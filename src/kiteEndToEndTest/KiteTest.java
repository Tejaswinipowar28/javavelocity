package kiteEndToEndTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement UID = driver.findElement(By.id("userid"));
		WebElement UPassword = driver.findElement(By.id("password"));
		WebElement subButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UID.sendKeys("ELR321");
		UPassword.sendKeys("Dhana1111");
		subButton.click();
		
		
		Thread.sleep(200);
		WebElement UPin = driver.findElement(By.id("pin"));
	    WebElement ButtonSub = driver.findElement(By.xpath("//button[@type='submit']"));
	    UPin.sendKeys("982278");
	    ButtonSub.click();
	    
		Thread.sleep(1000);
		WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
	
		String exceptedUID = "ELR321";
		String actualUID = userID.getText();
		
		if(exceptedUID.equals(actualUID)) 
		{
			System.out.println("actual and excepted user id match then test case pass");
		}
		else
		{
			System.out.println("actual and excepted user id not match then test case fail");
		}
		
		userID.click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		driver.close();

	}

}
