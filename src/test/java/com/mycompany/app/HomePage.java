package com.mycompany.app;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		
	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String Password) throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);

		l.getLogin().click();

		LoginPage lp = new LoginPage(driver);

		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getsignin();

	}
	
	

	
	  @AfterTest
	  
	  public void teardown() {
	  
	  //driver.close();
	  
	  driver.quit(); 
	  driver=null;
	  
	  }
	 
	
	

	@DataProvider

	public Object[][] getData()

	{

		Object[][] data = new Object[2][2];
		data[0][0] = "abc";
		data[0][1] = "abc1";

		data[1][0] = "123";
		data[1][1] = "654";

		return data;

	}


}
