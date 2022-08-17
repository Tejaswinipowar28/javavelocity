package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(20000);
		WebElement car = driver.findElement(By.id("cars"));
		Select s= new Select(car);
		System.out.println(s.isMultiple());
		Thread.sleep(300);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("volvo");
		Thread.sleep(2000);
		s.selectByValue("audi");
		
		s.deselectAll();
	
	

	}

}
