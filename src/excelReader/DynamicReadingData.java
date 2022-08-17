package excelReader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DynamicReadingData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		int totalrow = mySheet.getLastRowNum();
        int totalCell = mySheet.getRow(0).getLastCellNum()-1;
	   
	    for(int i=0;i<=totalrow;i++)
	    {
	    	for(int j=0;j<=totalCell;j++)
	    	{
	    	Cell myCell = mySheet.getRow(i).getCell(j);
	    	CellType cellDataType = myCell.getCellType();
	    	
	    	if(cellDataType==CellType.STRING)
	    	{
	    		String value = myCell.getStringCellValue();
	    		System.out.print(value+" ");
	    	}
	    	
	    	else if(cellDataType==CellType.BOOLEAN)
	    	{
	    		boolean value = myCell.getBooleanCellValue();
	    		System.out.print(value+" ");
	    	}
	    	else if(cellDataType==CellType.NUMERIC)
	    	{
	    		double value = myCell.getNumericCellValue();
	    		System.out.println(value+" ");
	    				
	    	}
	    	else if (cellDataType==CellType.BLANK)
	    	{
	    		
	    	}
	    	}
	    	System.out.println();
	    }
		}

}
