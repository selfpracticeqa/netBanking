package com.practice.testcases;

import org.testng.annotations.Test;

import com.practice.pageobject.HomePage;

public class TC_New_Customer_001 extends BaseClass
{
	@Test
	public void addNewCustomer()
	{
		HomePage hp = new HomePage(driver);
		hp.addNewCustomer().click();
		logger.info("New Customer link clicked");
		
	}

}
