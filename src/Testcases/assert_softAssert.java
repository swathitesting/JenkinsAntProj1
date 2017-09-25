package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_softAssert 
{
  SoftAssert softAssert = new SoftAssert();
	
	
	@Test
public void RegisterTest()
{
   String expectedTitle= "aaaaa";
   String actualTitle="bbbbb";
   
 	     // Using SoftAssert    
   
       System.out.println("AAA"); 
       softAssert.assertEquals( actualTitle,expectedTitle);
       softAssert.assertEquals("P","Q" );
       System.out.println("BBB");
       
       softAssert.assertAll();
       
        
}


}
