package actionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction_Study {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id");
		Thread.sleep(1000);
		//in mouse action, need to create object of action class and pass the parameter as driver
		
		Actions act = new Actions(driver);
        WebElement day = driver.findElement(By.id("day"));
        
        act.click(day).perform();
        
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_UP).perform();
        act.sendKeys(Keys.ARROW_UP).perform();
        act.sendKeys(Keys.ARROW_UP).perform();
        act.sendKeys(Keys.ENTER).perform();
        
      
         
 
 


	}
}
