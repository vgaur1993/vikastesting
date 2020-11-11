package com.deere.ics.Utility;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class TestUtil {

	public static ArrayList<Object[]> getDataFromExcel() throws Exception {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		System.out.println("Applogin fgh");

		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		HSSFWorkbook wb = null;
		try {
			fileIn = new FileInputStream("TEST1.xls");
			POIFSFileSystem fs = new POIFSFileSystem(fileIn);
			wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {

				String Username = sheet.getRow(rowNum).getCell(0).toString();

				String Password = sheet.getRow(rowNum).getCell(1).toString();

				Object ob[] = { Username, Password };
				myData.add(ob);
			}

		} finally {
			if (wb != null)
				// wb.close();
				if (fileOut != null)
					fileOut.close();
			if (fileIn != null)
				fileIn.close();
		}

		return myData;

	}
}
