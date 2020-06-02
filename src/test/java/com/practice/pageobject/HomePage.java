package com.practice.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By newCustomer = By.xpath("//a[contains(text(),'New Customer')]");
	By edidCustomer = By.xpath("//a[contains(text(),'Edit Customer')]");
	By deleteCustomer = By.xpath("//ul[@class='menusubnav']//a[contains(text(),'Delete Customer')]");
	By newAccount = By.xpath("//a[contains(text(),'New Account')]");
	By editAccount = By.linkText("Edit Account");
	By deleteAccount = By.linkText("Delete Account");
	By miniStatement = By.linkText("Mini Statement");
	By customizedStatement = By.xpath("//a[contains(text(),'Customised Statement')]");
	By logout = By.linkText("Log out");
	
	
	public WebElement addNewCustomer()
	{
		return driver.findElement(newCustomer);
	}
}
