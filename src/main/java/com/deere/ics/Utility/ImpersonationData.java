
package com.deere.ics.Utility;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ImpersonationData {

	HSSFWorkbook wb;

	HSSFSheet sheet1;

	public ImpersonationData(String excelPath) {

		try {
			File src = new File(System.getProperty("user.dir")+excelPath);

			FileInputStream fis = new FileInputStream(src);

			wb = new HSSFWorkbook(fis);

		
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	public String getData(int sheetNumber, int row, int column) {
		sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();

		return data;

	}

}
