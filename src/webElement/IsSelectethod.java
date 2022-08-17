package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Thread.sleep(2000);
	
		if(checkBox1.isSelected()) 
		{
			System.out.println("check box is already selected");
		}
		
		else {
			
			System.out.println("check box is select now");
		}
	}

}
