package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(200);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		
		hideButton.click();
		if(textBox.isDisplayed()) {
			textBox.sendKeys("Welcome");
		}
		else {
			showbutton.click();
			textBox.sendKeys("Welcome Home");
		}
		

	}
}

