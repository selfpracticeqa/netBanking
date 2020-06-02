package com.practice.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.practice.pageobject.LoginPage;

public class TC_LoginPage_001 extends BaseClass 
{
	@Test
	public void login()
	{
		LoginPage lp = new LoginPage(driver);
		logger.info("Browser Invoked");
		lp.getUsername().sendKeys(username);
		logger.info("Username entered");
		lp.getPassword().sendKeys(password);
		logger.info("Password entered");
		lp.clickSubmit().click();
		logger.info("Login button clicked");
	}
}
