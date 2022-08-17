package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
	    Sheet mySheet = myWorkbook.getSheet("Sheet2");
	    //using numeric value
	    
	  double value = mySheet.getRow(1).getCell(0).getNumericCellValue();
	  System.out.println(value);
	    
	  //using boolen value
	  
	  boolean value2 = mySheet.getRow(2).getCell(1).getBooleanCellValue();
      System.out.println(value2);
	 
      //using string value
	  
	  String value3 = mySheet.getRow(0).getCell(0).getStringCellValue();
	  System.out.println(value3);
	
	
	
	
	
	
	}

}
