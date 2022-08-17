package crossBrowTestNG_Study;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGFireTest {
  @Test
  public void launchKite() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
  }
}
