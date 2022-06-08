package com.poly.TestData;

import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.poly.Utils.ExcelUtils;

public class RegisterData extends TestData implements Log<RegisterData>{
	
	private String lastName;
	
	private String firstName;
	
	private String userName;
	
	private String email;
	
	private String password;
	
	private String confirmPassword;
	
	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	@Override
	public void writeLog(String src, String sheetName, Set<RegisterData> logs) throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(src);
		XSSFSheet xssfSheet = ExcelUtils.getSheet(xssfWorkbook, sheetName);
		
		int startRow = 0, lastRow = xssfSheet.getPhysicalNumberOfRows();
		if(lastRow < startRow) {
			lastRow = startRow;
		}
		
		CellStyle cellStyle = ExcelUtils.getCellStyle(xssfWorkbook);
		for(RegisterData log : logs) {
			Row row = xssfSheet.createRow(lastRow);
			row.setHeightInPoints(80);
			row.setRowStyle(cellStyle);
			log.writeDataRow(log, row, xssfSheet);
			lastRow++;
		}
		ExcelUtils.export(src, xssfWorkbook);
	}

	@Override
	public void writeDataRow(RegisterData log, Row row, XSSFSheet xssfSheet) throws Exception {
		CellStyle cellStyle = row.getRowStyle();
		
		Cell cell;
		
		cell = row.createCell(0);
		cell.setCellValue(getLastName());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(1);
		cell.setCellValue(getFirstName());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(2);
		cell.setCellValue(getUserName());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(3);
		cell.setCellValue(getEmail());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(4);
		cell.setCellValue(getPassword());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(5);
		cell.setCellValue(getConfirmPassword());
		cell.setCellStyle(cellStyle);
		
		writeTestData(6, row, xssfSheet);
	}

}
