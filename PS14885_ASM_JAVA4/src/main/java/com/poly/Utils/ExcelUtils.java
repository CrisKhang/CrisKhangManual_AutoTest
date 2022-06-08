package com.poly.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ExcelUtils {
	public static final String CHROME_DRIVER_SRC = System.getProperty("user.dir") + "/test-resources/chromedriver.exe";

	public static final String DATA_SRC = System.getProperty("user.dir") + "/test-resources/datas/";

	public static final String IMG_SRC = System.getProperty("user.dir") + "/test-resources/images/";

	public static XSSFWorkbook getWorkbook(String filePath) throws Exception {
		File src = new File(filePath);
		if (!src.exists()) {
			throw new Exception("Filepath: " + filePath + " is not Exist!");
		}
		FileInputStream fileInputStream = new FileInputStream(src);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		fileInputStream.close();
		return xssfWorkbook;
	}

	public static XSSFSheet getSheet(XSSFWorkbook xssfWorkbook, String sheetName) throws Exception {
		XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
		if (xssfSheet == null) {
			throw new Exception("Sheet name: " + sheetName + " is not exist!");
		}
		return xssfSheet;
	}

	public static CellStyle getCellStyle(XSSFWorkbook xssfWorkbook) {
		CellStyle cellStyle = xssfWorkbook.createCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.CENTER);
		cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		cellStyle.setWrapText(true);
		return cellStyle;
	}

	public static String getCellValue(XSSFSheet sheet, int row, int column) {
		String returnValue;
		XSSFCell xssfCell = sheet.getRow(row).getCell(column);
		try {
			if (xssfCell.getCellType() == CellType.STRING) {
				returnValue = xssfCell.getStringCellValue();
			} else if (xssfCell.getCellType() == CellType.NUMERIC) {
				returnValue = String.format("%.0f", xssfCell.getNumericCellValue());
			} else if (xssfCell.getCellType() == CellType.BLANK) {
				returnValue = "";
			} else {
				returnValue = "";
			}
		} catch (Exception e) {
			returnValue = "";
		}
		return returnValue;
	}

	public static void takeScreenShot(WebDriver webDriver, String outputPath) throws Exception {
		File screenShot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(outputPath));
	}

	public static Object[][] readSheetData(XSSFSheet sheet) {
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows - 1][columns];

		for (int row = 1; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				data[row - 1][column] = ExcelUtils.getCellValue(sheet, row, column);
			}
		}
		return data;
	}

	public static void writeImage(String imagePath, Row row, Cell cell, XSSFSheet sheet) throws Exception {
		InputStream inputStream = new FileInputStream(imagePath);

		byte[] bytes = IOUtils.toByteArray(inputStream);

		int imageId = sheet.getWorkbook().addPicture(bytes, XSSFWorkbook.PICTURE_TYPE_PNG);

		inputStream.close();

		XSSFDrawing xssfDrawing = sheet.createDrawingPatriarch();
		ClientAnchor anchor = new XSSFClientAnchor();

		anchor.setCol1(cell.getColumnIndex());
		anchor.setRow1(row.getRowNum());
		anchor.setCol2(cell.getColumnIndex() + 1);
		anchor.setRow2(row.getRowNum() + 1);

		xssfDrawing.createPicture(anchor, imageId);
	}

	public static void export(String outputPath, XSSFWorkbook xssfWorkbook) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
		xssfWorkbook.write(fileOutputStream);
		fileOutputStream.close();
	}
}
