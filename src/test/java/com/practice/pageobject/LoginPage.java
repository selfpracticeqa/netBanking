package com.practice.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By usernamePath = By.name("uid");
	By passwordPath = By.name("password");
	By submitPath = By.name("btnLogin");
	
	public WebElement getUsername()
	{
		return driver.findElement(usernamePath);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(passwordPath);
	}
	
	public WebElement clickSubmit()
	{
		return driver.findElement(submitPath);
	}
}
