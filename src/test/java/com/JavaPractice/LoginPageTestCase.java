
package com.JavaPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*Launch the browser
 * Application is launched
 * Enter the Username
 * Enter the Password
 * Verify the text is present or not
 * Click on the login button
 * Verify the URl title
 */
public class LoginPageTestCase extends LoginPage{
	


	public LoginPageTestCase() throws Throwable  {
		super();

	}
	static WebDriver driver;


	@BeforeClass

	public void SetUp() throws Throwable {

		String browser = prop.getProperty("browser");
		String driverPath = prop.getProperty("browserDriverPath");
		String appUrl  = prop.getProperty("appUrl");
		driver = launchBrowser(browser,driverPath,appUrl); 

	}

	@Test
	public void LoginTest() throws Throwable
	{

		EnterUserName();

		EnterPassword();
		
		ChkPresenceOfText();

		VerifyTheUrl();

		
	}


}





