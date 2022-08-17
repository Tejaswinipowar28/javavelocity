package kitePomExcelDataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteExcelTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("disable notification");
		WebDriver driver=new ChromeDriver(opt);
		
	    driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
        
        // create excel file path 
        
       File myFile = new File("C:\\automation\\excelReadingTest.xlsx");
       Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
       String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
       Thread.sleep(100);
       
       KiteLoginPage login= new KiteLoginPage(driver);
       login.sendUserid(UN);
       login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
       login.clickLoginButton();
       
       Thread.sleep(1000);
       KitePinPage pIN=new KitePinPage(driver);
       pIN.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
       pIN.clickContinueButton();
       
       Thread.sleep(100);
       KiteHomePage home=new KiteHomePage(driver);
       home.validUserID(UN);
       home.clickLogoutButton();
      
       
       driver.close();
       
	
	
	
	}
}