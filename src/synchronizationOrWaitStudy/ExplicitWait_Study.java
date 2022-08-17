package synchronizationOrWaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
	    WebElement checkboxP = driver.findElement(By.id("checkBoxOption1"));
	    WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(300));
	    
	    w.until(ExpectedConditions.elementToBeClickable(checkboxP));

	}

}
