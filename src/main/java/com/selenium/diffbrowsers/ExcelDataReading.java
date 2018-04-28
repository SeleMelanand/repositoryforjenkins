package com.selenium.diffbrowsers;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataReading {
	@Test
	public void excelreading() throws IOException{
		FileInputStream fis = new FileInputStream(".//data/testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum()+1;
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(columnCount);
		workbook.close();
	}

}
