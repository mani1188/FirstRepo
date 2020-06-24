package com.JavaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.Utility;

public class JobCatagoriesPage extends Utility{


	public JobCatagoriesPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	
		public void ClickOnJob() {
		clickOnElment("xpath","//a[@id='menu_admin_Job']");
		}
		public void ClickOnJobCatagory() {

		clickOnElment("xpath","//a[@id='menu_admin_jobCategory']");
	}

	public void ClickOnAddJobCatagoery() {

		clickOnElment("xpath","//input[@id='btnAdd']");
	}
	
	public void EnterJobName() {
		sendData("xpath","//input[@id='jobCategory_name']","Workers");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void ClickOnSaveJobCatagoery() {

		clickOnElment("xpath","//input[@id='btnSave']");

	}
	
	

	public WorkShiftsPage  PrintJobCatogeries() throws Throwable 

	{ 

		List<WebElement> table4 = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

		List<WebElement> results =driver.findElements((By.tagName("tr")));


		for (int i = 0; i < results.size(); i++) {

			String temp = results.get(i).getText();

			System.out.println(temp);
			
			
		}
		System.out.println("*************************************");
		return new WorkShiftsPage();
	}


}
