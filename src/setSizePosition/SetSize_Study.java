package setSizePosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
        
        System.out.println(driver.manage().window().getSize());
        //create object of dimension class
         Dimension dm = new Dimension(80, 100); 
         driver.manage().window().setSize(dm);

	}

}
