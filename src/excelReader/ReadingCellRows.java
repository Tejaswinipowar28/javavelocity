package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingCellRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
         Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	     
         //reading row data
         for(int i=0;i<=2;i++) 
         {
          String value = mySheet.getRow(0).getCell(i).getStringCellValue();
           System.out.println(value+" ");
         }
	    System.out.println();
	    //reading column data
	    
	    for(int j=0; j<=2;j++)
	    {
	    	String value = mySheet.getRow(j).getCell(0).getStringCellValue();
	    	 System.out.println(value+" ");
	    }
	
	}

}
