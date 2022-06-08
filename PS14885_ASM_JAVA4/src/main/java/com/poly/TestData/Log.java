package com.poly.TestData;

import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public interface Log<T extends TestData> {
	public void writeLog(String src, String sheetName, Set<T> logs) throws Exception;
	public void writeDataRow(T log, Row row, XSSFSheet xssfSheet) throws Exception;
}
