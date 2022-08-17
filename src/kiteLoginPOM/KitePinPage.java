package kiteLoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//1.Data member shoud be declaired globally with access level private using @findBy annitation
	
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	
	//2.initialize within a constructor with access level public using pagefactory
	
	public  KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.utilize within method with access level public 
	
	public void sendPin()
	{
		Pin.sendKeys("982278");
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}










}
