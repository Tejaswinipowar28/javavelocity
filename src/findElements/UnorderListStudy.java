package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderListStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(result.size());
		//using for each loop
		
		for(WebElement r:result)
		{
			System.out.println(r.getText());
			
		}
		
		for(WebElement r:result)
		{
			String exceptedResult = "honda amaze";
			String actualText = r.getText();
			if(actualText.equals(exceptedResult)) 
			{
				r.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();

		
		
	}

}
