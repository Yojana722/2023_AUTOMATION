package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_VerifyTypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\March2023\\Excel\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TestData");

		// 6. getCellType()
		CellType CT = sh.getRow(0).getCell(2).getCellType();
		System.out.println(CT);// STRING, NUMERIC, BOOLEAN
	}
}
