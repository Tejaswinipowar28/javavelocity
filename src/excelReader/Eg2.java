package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	   
		File myFile = new File("C:\\automation\\excelReadingTest.xlsx");

        String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	
	    System.out.println(value);

	    System.out.println("===================");
	    String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	    System.out.println(value1);
	    
	    System.out.println("===================");
	     
        String value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(value2);
	
	}

}
