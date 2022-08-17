package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(1000);
		
		System.out.println("Total no of links "+links.size());
		
		//using for loop , for each loop , iterator
		
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}

	}

}
