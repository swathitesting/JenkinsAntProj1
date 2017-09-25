package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_ParameteriseTests 
{

	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("xxxxxxxxxxxx");
	}
	
		
  @Test(dataProvider="getData")//2nd 
  public void doLoginTest(String username,   //3rd
	                      String password,
	                      String browser,
	                      String expectval,
	                       int phone )
  {
	 System.out.println(username+"----"+password);
	 
  }

  
  @DataProvider
    public Object[][] getData()
  {
	  Object[][] data = new Object [3][5]; //1st
                            //	  [rows][cols]
	  data[0][0] = "U1";
	  data[0][1] = "P1";
	  data[0][2] = "Mozilla";
	  data[0][3] = "Pass";
	  data[0][4] = 998765443;
	  
	// 2nd row, 2nd set of data --> 2nd iteration of the testcase
	  data[1][0] = "U2";
	  data[1][1] = "P2";
	  data[1][2] = "Mozilla";
	  data[1][3] = "Pass";
	  data[1][4] = 998765443;
	  
	// 3rd row, 3rd set of data
	  data[2][0] = "U3";
	  data[2][1] = "P3";
	  data[2][2] = "Mozilla";
	  data[2][3] = "Pass";
	  data[2][4] = 998765443;
	  
	  return data;
  }	  
	  

  
  
  
  }
