package kitePomExcelDataRead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	  @FindBy(xpath="//span[@class='user-id']") private WebElement UID;
	  @FindBy(xpath="//a[@target='_self']")private WebElement logout;
	  
	  public KiteHomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void validUserID(String exceptedUID) 
	  {
		  String actualUID = UID.getText();
		  if(actualUID.equals(exceptedUID))
		  {
			  System.out.println("Actual and Excepted matched then tc passed");
		  }
		  else
		  {
			  System.out.println("Actual and excepted are nit matche then tc failed");
		  }
	  }
	  
	  public void clickLogoutButton() throws InterruptedException
	  {
		  UID.click();
		  Thread.sleep(100);
		  logout.click();
	  }

}
