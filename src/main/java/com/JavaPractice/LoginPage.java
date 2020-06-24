package com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.Utility;

public class LoginPage extends Utility {
	By username =  By.xpath("//input[@name='txtUsername']");
	By password= By.xpath("//input[@name='txtPassword']");


	public LoginPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public void EnterUserName() {
		
	//return driver.findElement(username);

		clickOnElment("xpath","//input[@name='txtUsername']");
	}
	
	public void EnterPassword() {
		sendData("xpath","//input[@name='txtPassword']","admin123");
		//return driver.findElement(password);
	}
	
	public void VerifyTheUrl() {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		Assert.assertEquals("OrangeHRM",driver.getTitle());
	}
	

	public UserManagementPage   ChkPresenceOfText() throws Throwable 
	{
		if( driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).isDisplayed())
		{

			System.out.println("Text is present on the page");
		}
		else
		{
			System.err.println("Text is not present on  the page");
		}
	
		clickOnElment("xpath","//input[@name='Submit']");
		
		
		
		return new UserManagementPage();
	
	}
	
	

	}






