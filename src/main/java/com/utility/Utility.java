package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class Utility {



	public  static WebDriver driver ;
	public static ExtentReports extent;
	public static	ExtentTest logger;
	public static Properties prop;

	public Utility()  {
		try {
		prop= new Properties();
		
		String filepath= System.getProperty("user.dir")+"\\Resources\\data.properties";
		
		//FileInputStream	fis = new FileInputStream("E:\\Bebo\\MyWorkspace\\JavaPractice\\Resources\\data.properties");
		FileInputStream fis = new FileInputStream(filepath);
	
			prop.load(fis);
		
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//To launch the browser dynamically
	public WebDriver launchBrowser(String browserName,String browserDriver,String appUrl) throws IOException 
	{

		if(browserName.equalsIgnoreCase("Chrome"))
		{
			String driverPath = System.getProperty("user.dir")+"//src//"+browserDriver;

			System.setProperty("webdriver.chrome.driver",driverPath);

			System.setProperty("webdriver.chrome.silentOutput", "true");

			driver = new ChromeDriver();


			driver.manage().window().maximize();
		
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			String driver_path = System.getProperty("user.dir")+"//src//"+browserDriver;

			System.setProperty("webdriver.gecko.driver", driver_path);

			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browsername");
		}

		driver.get(appUrl);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}



	public void launchApp(String appUrl)
	{
		driver.get(appUrl);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//To Locate the Elements
	public By locator(String locName,String locValue)
	{
		By byObj = null;
		switch(locName)
		{
		case "id":
			byObj = By.id(locValue);
			break;
		case "name":
			byObj = By.name(locValue);
			break;
		case "className":
			byObj = By.className(locValue);
			break;
		case "tagName":
			byObj = By.tagName(locValue);
			break;
		case "linkText":
			byObj = By.linkText(locValue);
			break;
		case "partialLinkText":
			byObj = By.partialLinkText(locValue);
			break;
		case "xpath":
			byObj = By.xpath(locValue);
			break;
		case "cssSelector":
			byObj = By.cssSelector(locValue);
			break;
		default:
			System.out.println("No locator found");
		}
		return byObj;
	}

	//To send the data in the text field
	public void sendData(String locName,String locValue,String testdata)
	{
		driver.findElement(locator(locName,locValue)).sendKeys(testdata);
	}




	//To click on button/Element
	public void clickOnElment(String locName,String locValue)
	{
		driver.findElement(locator(locName,locValue)).click();
	}

	//To click on button/Element
	public void clickOnElment1(String locName,String locValue,int n)
	{
		driver.findElements(locator(locName,locValue)).get(n).click();
	}

	//To clear the fields
	public void clearField(String locName,String locValue)
	{
		driver.findElement(locator(locName,locValue)).clear();
	}

	public void selectListByValue(String locName, String locValue, String Value)
	{
		WebElement elment =driver.findElement(locator(locName, locValue));
		//System.out.println(locName+locValue+Value);
		Select drop= new Select(elment);
		drop.selectByValue(Value);
	}


	public  void selectByText(WebElement element, String text) {
		Select selectElement = new Select(element);
		selectElement.selectByVisibleText(text);

	}



}

