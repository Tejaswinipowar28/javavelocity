package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("title is "+title);
	
		
		//getCurrentMethod
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

	

	}

}
