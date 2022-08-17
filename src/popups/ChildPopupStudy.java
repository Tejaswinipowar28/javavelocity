package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		//to get single id of (main page)
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
		// to get multiple  id of 
		Set<String> idOfAllPage = driver.getWindowHandles();
		System.out.println(idOfAllPage);
		//to convert the set into arraylist
		
		ArrayList<String> al= new ArrayList<String>(idOfAllPage);
		
		String newIdOfMainPage = al.get(0);
		String idOfChildPage = al.get(1);
		//chnge the focus from main page to child page 
		
		driver.switchTo().window(idOfChildPage);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		driver.close();
		
	}

}
