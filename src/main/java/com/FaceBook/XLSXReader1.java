package com.FaceBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXReader1 {
	static String value;
	//String sheet;

	public static String readParticularData(String sheet,int row,int cell ) throws IOException {
		File f= new File("C:\\Users\\Admin\\Desktop\\Maven Excel.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fi);
		Sheet sheetAt1 = w.getSheet(sheet);
		Row r= sheetAt1.getRow(row);
		Cell c= r.getCell(cell);
		CellType ce= c.getCellType();				
		if (ce.equals(CellType.STRING)) {				
			value =  c.getStringCellValue();	
			//System.out.println(stringCellValue);				
		    
		}
		else if (ce.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int i=(int) d;
			value= Integer.toString(i);
			//System.out.println(numericCellValue);
			
		
		}
		return value;
	}
		public static  void readall_Data() throws IOException {
			File f= new File("C:\\Users\\Admin\\eclipse-workspace\\IPTProject\\Excel\\Maven Excel.xlsx");
			FileInputStream fi= new FileInputStream(f);
			Workbook w= new XSSFWorkbook(fi);
			Sheet sheet=  w.getSheetAt(0);
			int numberOfRows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < numberOfRows; i++) {
				Row r= sheet.getRow(i);
				
			int PhysicalNumberOfCells= r.getPhysicalNumberOfCells();
			for (int j = 0; j < PhysicalNumberOfCells; j++) {
				Cell c = r.getCell(j);
				
				CellType cellType= c.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = c.getStringCellValue();
				System.out.println(stringCellValue);
			}
				
				else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = c.getNumericCellValue();
					System.out.println(numericCellValue);
			}
				
			}
				
			}
			
			
			}
	//	public static void main(String[] args) throws IOException {
		
			
		//	readall_Data();
		//}	






	}


