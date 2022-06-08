package com.poly.TestData;

import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.poly.Utils.ExcelUtils;

public class PhimData extends TestData implements Log<PhimData> {

	private String maPhim;
	private String tiTle;
	private String noiDung;
	private String doPhanGiai;
	private String daoDien;
	private String ngayCongChieu;
	private String thoiLuong;
	private String phuDe;
	
	private String traiLer;
	private String link;
	private String poster;
	private String hinh1;
	private String hinh2;
	private String hinh3;
	private String hinh4;
	private String hieuLuc;
	
	
	
	public String getMaPhim() {
		return maPhim;
	}

	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}

	public String getTiTle() {
		return tiTle;
	}

	public void setTiTle(String tiTle) {
		this.tiTle = tiTle;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getDoPhanGiai() {
		return doPhanGiai;
	}

	public void setDoPhanGiai(String doPhanGiai) {
		this.doPhanGiai = doPhanGiai;
	}

	public String getDaoDien() {
		return daoDien;
	}

	public void setDaoDien(String daoDien) {
		this.daoDien = daoDien;
	}

	

	public String getNgayCongChieu() {
		return ngayCongChieu;
	}

	public void setNgayCongChieu(String ngayCongChieu) {
		this.ngayCongChieu = ngayCongChieu;
	}

	public String getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(String thoiLuong) {
		this.thoiLuong = thoiLuong;
	}

	public String getPhuDe() {
		return phuDe;
	}

	public void setPhuDe(String phuDe) {
		this.phuDe = phuDe;
	}

	

	public String getTraiLer() {
		return traiLer;
	}

	public void setTraiLer(String traiLer) {
		this.traiLer = traiLer;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getHinh1() {
		return hinh1;
	}

	public void setHinh1(String hinh1) {
		this.hinh1 = hinh1;
	}

	public String getHinh2() {
		return hinh2;
	}

	public void setHinh2(String hinh2) {
		this.hinh2 = hinh2;
	}

	public String getHinh3() {
		return hinh3;
	}

	public void setHinh3(String hinh3) {
		this.hinh3 = hinh3;
	}

	public String getHinh4() {
		return hinh4;
	}

	public void setHinh4(String hinh4) {
		this.hinh4 = hinh4;
	}

	public String getHieuLuc() {
		return hieuLuc;
	}

	public void setHieuLuc(String hieuLuc) {
		this.hieuLuc = hieuLuc;
	}

	@Override
	public void writeLog(String src, String sheetName, Set<PhimData> logs) throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(src);
		XSSFSheet xssfSheet = ExcelUtils.getSheet(xssfWorkbook, sheetName);
		
		int startRow = 0, lastRow = xssfSheet.getPhysicalNumberOfRows();
		if(lastRow < startRow) {
			lastRow = startRow;
		}
		
		CellStyle cellStyle = ExcelUtils.getCellStyle(xssfWorkbook);
		for(PhimData log : logs) {
			Row row  = xssfSheet.createRow(lastRow);
			row.setHeightInPoints(80);
			row.setRowStyle(cellStyle);
			log.writeDataRow(log, row, xssfSheet);
			lastRow++;
		}
		ExcelUtils.export(src, xssfWorkbook);
	}

	@Override
	public void writeDataRow(PhimData log, Row row, XSSFSheet xssfSheet) throws Exception {
		CellStyle cellStyle = row.getRowStyle();
		Cell cell;
		cell = row.createCell(0);
		cell.setCellValue(getMaPhim());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(1);
		cell.setCellValue(getTiTle());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(2);
		cell.setCellValue(getNoiDung());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(3);
		cell.setCellValue(getDoPhanGiai());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(4);
		cell.setCellValue(getDaoDien());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(5);
		cell.setCellValue(getNgayCongChieu());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(6);
		cell.setCellValue(getThoiLuong());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(7);
		cell.setCellValue(getPhuDe());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(8);
		cell.setCellValue(getTraiLer());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(9);
		cell.setCellValue(getLink());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(10);
		cell.setCellValue(getPoster());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(11);
		cell.setCellValue(getHinh1());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(12);
		cell.setCellValue(getHinh2());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(13);
		cell.setCellValue(getHinh3());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(14);
		cell.setCellValue(getHinh4());
		cell.setCellStyle(cellStyle);
		
		cell = row.createCell(15);
		cell.setCellValue(getHieuLuc());
		cell.setCellStyle(cellStyle);
		
		writeTestData(16, row, xssfSheet);
		
	}
	
}
