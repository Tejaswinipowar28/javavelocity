package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingCompleteSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
       Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	
	  //reading excel table in static way
       
       for(int i=0;i<=2;i++) 
       {
    	   for(int j=0; j<=2;j++) 
    	   {
    		 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
    		   System.out.print(value+" ");
    	   }
        System.out.println();
       }
       
	
	
	}

}

