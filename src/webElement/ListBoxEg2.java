package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(5000);
		//identify element and store in ref variable
		
		WebElement day = driver.findElement(By.id("day"));
		//create object of select class
		Select s= new Select(day);
		Thread.sleep(5000);
		s.selectByVisibleText("28");
		System.out.println(s.isMultiple());
		
		//using for loop for multiple times operations
		for(int i=0; i<=9; i++)
		{
			s.selectByIndex(i);
			Thread.sleep(200);
		}
		
		for(int i=9; i>=0; i--) 
		{
			s.selectByIndex(i);
			Thread.sleep(200);
		}
	

	}
	

}
