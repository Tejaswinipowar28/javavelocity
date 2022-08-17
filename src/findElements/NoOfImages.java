package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
       List<WebElement> img = driver.findElements(By.tagName("img"));
		Thread.sleep(1000);
		
		System.out.println("Total no of img "+img.size());
		//using for loop , for each loop , iterator
		for(WebElement a:img)
		{
			System.out.println(a.getText());
		}
		
 }
}


