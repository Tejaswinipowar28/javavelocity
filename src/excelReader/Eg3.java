package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	File myfile = new File("C:\\automation\\excelReadingTest.xlsx");
     Workbook myWorkbook = WorkbookFactory.create(myfile);
     
	 Sheet mySheet = myWorkbook.getSheet("Sheet1");
	 Row myRow = mySheet.getRow(0);
	 Cell mycell = myRow.getCell(0);
	 CellType mycellType = mycell.getCellType();
	 System.out.println(mycellType);
	 System.out.println(mySheet.getRow(0).getCell(0).getStringCellValue());
	
	 System.out.println("=======================");
	 
	 
	
	
	
	
	
	}

}
