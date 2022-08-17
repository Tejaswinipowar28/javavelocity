package crossBrowTestNG_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowTestStudy {
    @Parameters("browserName")
	@Test
  
  public void launchKiteMethod(String Bname)
  {
	WebDriver driver=null;
	  if(Bname.equals("chrome")) 
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
	   driver=new ChromeDriver();
	  }
	  else if(Bname.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "C:\\automation\\geckodriver.exe");
	  driver=new FirefoxDriver();
	 }
		 driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
			
  }
}
