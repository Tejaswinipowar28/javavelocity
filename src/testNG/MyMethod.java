package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyMethod {
  @Test
  public void myStudy() 
  {
	  System.out.println("Hii this is printing in a printing statement");
	  
	  Reporter.log("Hii this is printing in a reporter log wihtout boolean value");
	  Reporter.log("Hii this is printing in a reporter log wiht boolean value", true);
  }
}
