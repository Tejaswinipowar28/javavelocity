package actionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//in mouse action, need to create object of action class and pass the parameter as driver
		
		Actions act = new Actions(driver);
		//find element to be act worked and store in reference variable
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		
		act.moveToElement(doubleclick).doubleClick().build().perform();
		

	}

}
