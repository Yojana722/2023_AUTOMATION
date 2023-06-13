package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_PrintAllDataUsingCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\March2023\\Excel\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("TestData");

		for (int i = 0; i <= sh.getLastRowNum(); i++) {// row
			for (int j = 0; j <= sh.getRow(i).getLastCellNum() - 1; j++) {// cell
				Cell cellInfo = sh.getRow(i).getCell(j);
				CellType CT = cellInfo.getCellType();

				if (CT == CellType.STRING) {
					System.out.print(cellInfo.getStringCellValue() + "  ");
				} else if (CT == CellType.NUMERIC) {
					System.out.print(cellInfo.getNumericCellValue() + "  ");
				} else if (CT == CellType.BOOLEAN) {
					System.out.print(cellInfo.getBooleanCellValue() + "  ");
				}
			}
			System.out.println();// next row
		}
	}
}
