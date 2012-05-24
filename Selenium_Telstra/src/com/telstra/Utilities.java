package com.telstra;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Utilities {
	/**
	 * Get a random row of data from Excel file with specific name and sheet
	 * @param fileName
	 * @param sheetName
	 * @return the row of data (converted to String), or empty String if there is any exception
	 */
	public static String getRandomRecord(String fileName, String sheetName) {
		Random rand = new Random();
		int randNumber = 0;
		
		String rowStringValue = "";
		List<String> list = new ArrayList<String>();
		int rowPosition = 1;
		
		try {
			InputStream myXLS = new FileInputStream(fileName);
			HSSFWorkbook workbook = new HSSFWorkbook(myXLS);
			HSSFSheet sheet = workbook.getSheet(sheetName);

			HSSFRow row = null;
			HSSFCell cell = null;
			boolean endData = false;
			
			while (endData == false) {
				rowStringValue = "";
				row = sheet.getRow(rowPosition);
				int columnPosition = 0;
				boolean stopFlag = false;
				while (stopFlag == false) {
					String cellValue = "";
					cell = row.getCell(columnPosition);
					cellValue = cell.getStringCellValue();
					if (cellValue.equalsIgnoreCase("##")) {
						stopFlag = true;
					}
					if (cellValue.length() > 0) {
						rowStringValue = rowStringValue + cellValue + ";";
					}
					columnPosition++;
				}
								
				if (rowStringValue.startsWith("##")) {
					rowStringValue = "";
					stopFlag = true;
					endData = true;
				} else {
					list.add(rowStringValue);	
				}
				
				rowPosition++;
			}
		} catch (Exception e) {
			// clear the list if we face any issue with test data
			e.printStackTrace();
			System.out.println("Line number: " + rowPosition);
			list.clear();
		}
		
		// choose a random number
		randNumber = rand.nextInt(list.size());

		String rowToReturn = "";
		if (list.size() > 0) {
			rowToReturn = list.get(randNumber);
		}
		
		return rowToReturn;
	}
	
	/**
	 * Write log to specified file
	 * @param message
	 */
	public static void writeLog(String file, String message) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			out.println(message + "\n--");
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
