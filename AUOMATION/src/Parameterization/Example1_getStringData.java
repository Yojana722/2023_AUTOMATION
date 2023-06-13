package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\March2023\\Excel\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TestData");
		
		//1. getStringCellValue() - to read String, Char data
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		String data2 = sh.getRow(0).getCell(3).getStringCellValue();
		System.out.println(data2);
		
		//2. getNumericCellValue() - to read numeric data
		double data3 = sh.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data3);//100.0
		
		//explicit casting - double to int
		int data4 = (int)data3;
		System.out.println(data4);//100
		
		//3. getBooleanCellValue() - to read boolean values
		boolean data5 = sh.getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(data5);
		
		String data6 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data6);
		
		//4. getLastRowNum() - it returns no. of rows from 0th index
		int rowSize = sh.getLastRowNum();//1
		System.out.println(rowSize+1);//actual rowSize = getLastRowNum() + 1
		
		//5. getLastCellNum() - it returns no. of values from specific row
		short cellSize = sh.getRow(0).getLastCellNum();
		System.out.println(cellSize);//4
	}
}
