package Testcases;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class ApplicationTest 
{
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("!!!Before Suite");
	  
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("!!!After Suite");
	  
  }	
  
  @BeforeTest
  public void beforeTest()
  {
	  // selenium webdriver Code for opening browser
	  System.out.println("***Before executing all testscases***");
	  System.out.println();
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  // selenium webdriver Code for closing browser
	  System.out.println("***After executing all testscases***");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("....Before method...");
	  
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("....After method...");
	  System.out.println();
  }
  
  @Test(priority=1) // testcase
  public void LoginTest()
  {  
	  //webdriver code
	  throw new SkipException("some reason");       //skipping a testcase 
	 // System.out.println("Login Test execution");
  }
  @Test(priority=2/*,dependsOnMethods={"LoginTest"}*/ )
  public void PassWordChangeTest()
  {
	  System.out.println("Changing Password");
	  
  }
  
  @Test(priority=3/*, dependsOnMethods={"LoginTest"}*/)
  public void LogoutTest()
  {
	  System.out.println("Logging out");
	  
  }
}
