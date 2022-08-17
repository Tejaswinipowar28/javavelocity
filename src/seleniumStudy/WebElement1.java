package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.findElement( By.xpath("//input[@name=\"q\"]")).sendKeys("search mobile");
		
		Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@name=\"q\"]")).clear();

	}
}

