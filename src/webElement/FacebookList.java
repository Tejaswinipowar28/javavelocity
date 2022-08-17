package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(5000);
		//identify elementand store in ref variable
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(month);
		Thread.sleep(200);
		s1.selectByVisibleText("Aug");
		System.out.println(s1.isMultiple());
	

	}

}
