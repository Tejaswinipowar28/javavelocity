package kiteLoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogoutPage
{
	 //1.Data member shoud be declaired globally with access level private using @findBy annitation
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private  WebElement logoutButton;

    //2.initialize within a constructor with access level public using pagefactory
	
	public  KiteLogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.utilize within method with access level public 
	
	public void validuserID()
	{
		String exceptedUserId = "ELR321";
		String actualUserID = userID.getText();
		
		if (exceptedUserId.equals(actualUserID))
		{
			System.out.println("Actual and excepted userId are matching tc is passed ");
		}
		
		else
		{
			System.out.println("Actual and excepted userId are matching tc is passed ");
		}
		
	   }

     public void logOut() throws InterruptedException
     {
    	 userID.click();
    	 Thread.sleep(200);
    	 logoutButton.click();
     }



}
