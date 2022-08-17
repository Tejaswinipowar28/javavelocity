package kiteLoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		KiteLoginPage login=new KiteLoginPage(driver);
		
		login.sendUserId();
		login.sendPwd();
		login.clickLoginButton();
		
		Thread.sleep(200);
		KitePinPage PIN=new KitePinPage(driver);
		
		PIN.sendPin();
		PIN.clickContinueButton();
		
		Thread.sleep(200);
		KiteLogoutPage logout=new KiteLogoutPage(driver);
		
		logout.validuserID();
		logout.logOut();
		
		driver.close();
		
  

	}

}
