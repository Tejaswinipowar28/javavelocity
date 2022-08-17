package webTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	  // how to find no of rows
		
	 List<WebElement> noofRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
	    System.out.println("no of rows in table are "+noofRows.size());
	    
	    //how to find no of colomns
	    
	   List<WebElement> noOfColomn = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	    System.out.println("no of colomn in table are "+noOfColomn.size());
	    
	    //print header in table
	    
	    for(WebElement c:noOfColomn)
	    {
	    	System.out.println(c.getText()+" || ");
	    }
	    	System.out.println();
	   
	    	for(WebElement r:noofRows)
	    {
	    	System.out.println(r.getText()+" || ");
	    }
	    	
	    	System.out.println();
	    	
	
	
	}

}
