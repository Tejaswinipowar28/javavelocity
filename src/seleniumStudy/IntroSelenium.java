package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroSelenium {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe" );

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	}

}
