package com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utility.Utility;

public class WorkShiftsPage extends Utility {



	public WorkShiftsPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ClickOnAdmin() {

		clickOnElment("xpath","//b[contains(text(),'Admin')]");
	}

	public void ClickOnJob() {
		clickOnElment("xpath","//a[@id='menu_admin_Job']");
	}
	public void ClickOnWorkshift() {
		clickOnElment("xpath","//a[@id='menu_admin_workShift']");
	}
	public void ClickOnAddButton() {
		clickOnElment("xpath","//input[@id='btnAdd']");
	}
	public void WorkshiftName() {
		sendData("xpath","//input[@id='workShift_name']","HalfDay");
	}
	public void SelectWorkHours() {
		selectListByValue("id","workShift_workHours_from","09:00");

		selectListByValue("id","workShift_workHours_to","13:00");
	}

	public void DurationValue() {

		WebElement duration =  driver.findElement(By.xpath("//input[@class='time_range_duration']"));

		String typeValue = duration.getAttribute("value");

		System.out.println(typeValue);

		String  expectedValue = "4" ;

		Assert.assertEquals(typeValue,expectedValue);

		System.out.println("values are equal");

	}

	public void AvailableEmployess() {

		selectListByValue("xpath","//select[@id='workShift_availableEmp']","1");

		clickOnElment("xpath","//a[@id='btnAssignEmployee']");

	}
	public void VisibilityOftext() {

		if( driver.findElement(By.xpath("//option[contains(text(),'Linda Anderson')]")).isDisplayed())
			//Linda Anderson
			//Test 1
		{


			System.out.println("Name  is present on the page");
		}
		else
		{
			System.out.println("Name  is not present on  the page");
		}

	}

	public OrganisationPage ClickOnSaveButton() throws Throwable 
	{

		clickOnElment("xpath","//input[@id='btnSave']");
		
		

		return new OrganisationPage();

		
	}

}
