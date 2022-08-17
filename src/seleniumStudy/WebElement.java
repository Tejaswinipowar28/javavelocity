package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		//send keys 
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello Everyone");
		Thread.sleep(2000);
		//using clear 
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		

	}

}
