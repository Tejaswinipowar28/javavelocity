package setSizePosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
        
        System.out.println(driver.manage().window().getPosition());
        //create object of point class
        
        Point Pn = new Point(500, 100);
        driver.manage().window().setPosition(Pn);

	}

}
