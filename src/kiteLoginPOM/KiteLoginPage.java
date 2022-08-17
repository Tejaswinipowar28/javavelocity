package kiteLoginPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
     //1.Data member shoud be declaired globally with access level private using @findBy annitation
	
	@FindBy(id="userid") private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	
	//2.initialize within a constructor with access level public using pagefactory
	
	public KiteLoginPage(WebDriver driver)
	{
        PageFactory.initElements(driver, this);
	}
	
	//3.utilize within method with access level public 
	
	public void sendUserId()
	{
		userID.sendKeys("ELR321");
	}
	
	public void sendPwd()
	{
		password.sendKeys("Dhana1111");
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}







}
