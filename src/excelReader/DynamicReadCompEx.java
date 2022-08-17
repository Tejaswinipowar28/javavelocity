package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicReadCompEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
	       Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
	       //dynamic reading of complete sheet data
	       
	       int totalRow = mySheet.getLastRowNum();
	       System.out.println(totalRow);
	       int totalCell = mySheet.getRow(0).getLastCellNum()-1;
	       System.out.println(totalCell);
	       
	       //using for loop
	       for(int i=0; i<=totalRow;i++) 
	       {
	    	   for(int j=0; j<= totalCell; j++)
	    	   {
	    		   String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    	       System.out.print(value+" ");
	    	   }
	    	   System.out.println();
	       }

	}

}
