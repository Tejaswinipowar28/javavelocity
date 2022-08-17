package actionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//1.create object of action method
		
		Actions act = new Actions(driver);
		
		//find element to be act
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
        //now take action ad perform
		
		act.moveToElement(aboutUs).perform();
		//aboutUs.click();
		
		//click method using action class
		//act.click().perform();
		//i want click to click on radio button
		WebElement radio4 = driver.findElement(By.xpath("//input[@value='Radio4']"));
		
		act.moveToElement(radio4).perform();
		act.click().perform();
		Thread.sleep(1000);
		
		act.moveToElement(radio4).click().build().perform();
		act.click(radio4).perform();
		
	}

}
