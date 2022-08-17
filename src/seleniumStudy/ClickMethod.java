package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Radio3\"]")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//input[@value=\"Radio3\"]")).clear();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(500);
		
	}

}
