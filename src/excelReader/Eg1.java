package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {


	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
 String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(value);
	
	}

}
