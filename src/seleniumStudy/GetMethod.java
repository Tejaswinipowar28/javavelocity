package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.close();
		Thread.sleep(2000);
		driver.get("https://web.telegram.org/");
		//driver.quit();
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().window().minimize();
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		

		
	}

}
