package iFrameStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class IFrameEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		//selenium focus on default main page 
		//we need to swich selenium focus from main page to frame
		
	  String text = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
	  System.out.println(text);
	  
	  Thread.sleep(2000);
	
	 driver.switchTo().frame("frame1");
	 Thread.sleep(1000);
     driver.findElement(By.tagName("input")).sendKeys("selenium");
     Thread.sleep(1000);
     driver.switchTo().frame("frame3");
     Thread.sleep(1000);
     driver.findElement(By.id("a")).click();
     Thread.sleep(1000);
     
     driver.switchTo().defaultContent();
     driver.switchTo().frame("frame2");
   
    WebElement listbox = driver.findElement(By.id("animals"));
    Select s= new Select(listbox);
    Thread.sleep(2000);
    
    //s.selectByIndex(3);
    s.selectByVisibleText("big baby cat");

	}

}
