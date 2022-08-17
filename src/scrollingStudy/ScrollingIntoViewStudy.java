package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoViewStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
        WebElement seleniumpra = driver.findElement(By.xpath("//a[contains(text(),'Click to Start ')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("arguments[0].scrollIntoView();",seleniumpra);

	}

}
