package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyStudy {
  @Test
  public void myMethod() 
  {
	  Reporter.log("my method is running", true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("before method is running", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after method is running", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("before class is running",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("after class is running", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("before test is running", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("after test is running", true);
  }

}
