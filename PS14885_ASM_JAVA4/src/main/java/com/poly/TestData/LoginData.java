package com.poly.TestData;

import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.poly.Utils.ExcelUtils;



public class LoginData extends TestData implements Log<LoginData>{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void writeLog(String src, String sheetName, Set<LoginData> logs) throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(src);
		
		XSSFSheet xssfSheet = ExcelUtils.getSheet(xssfWorkbook, sheetName);
		
		int startRow = 0, lastRow = xssfSheet.getPhysicalNumberOfRows();
		if(lastRow < startRow) {
			lastRow = startRow;
		}
		
		CellStyle cellStyle = ExcelUtils.getCellStyle(xssfWorkbook);
		
		for(LoginData log : logs) {
			Row row = xssfSheet.createRow(lastRow);
			row.setHeightInPoints(80);
			row.setRowStyle(cellStyle);
			log.writeDataRow(log, row, xssfSheet);
			lastRow++;
		}
		ExcelUtils.export(src, xssfWorkbook);
	}
	
	@Override
	public void writeDataRow(LoginData log, Row row, XSSFSheet xssfSheet) throws Exception {
		CellStyle cellStyle = row.getRowStyle();
		
		Cell cell;
		
		cell = row.createCell(0);
		cell.setCellValue(log.getUsername());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(1);
		cell.setCellValue(log.getPassword());
		cell.setCellStyle(cellStyle);
		
		writeTestData(2, row, xssfSheet);
	}
}
