package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingSengKeyStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
        Thread.sleep(1000);
       
        WebElement emailid = driver.findElement(By.id("identifierId"));
        WebElement forget = driver.findElement(By.xpath("//button[text()='Forgot email?']"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='tejaswinipowar@12';",emailid);
        
        js.executeScript("arguments[0].click();",forget);
        
        driver.close();
        

	}

}
