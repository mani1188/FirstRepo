package com.JavaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Utility;

public class EmloymentStatusPage extends Utility  {

	public EmloymentStatusPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ClickOnJob() {


		clickOnElment("xpath","//a[@id='menu_admin_Job']");
	}
	public void ClickOnEmplstatus() {
		clickOnElment("xpath","//a[@id='menu_admin_employmentStatus']");
	}
	public void ClickOnAddButton() {
		clickOnElment("xpath","//input[@id='btnAdd']");
	}
	public void EnterEmplName() {
		sendData("xpath","//input[@id='empStatus_name']","Tester23");
	}
	public void ClickOnSaveButton() {
		clickOnElment("xpath" ,"//input[@id='btnSave']");

	}

	public JobCatagoriesPage ResultsPage() throws Throwable 

	{
		List<WebElement> table6 = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

		List<WebElement> results =driver.findElements((By.tagName("tr")));


		for (int i = 0; i < results.size(); i++) {

			String temp = results.get(i).getText();

			System.out.println(temp);
			
		}      
		System.out.println("*************************************");

		return new JobCatagoriesPage();
	}

}

