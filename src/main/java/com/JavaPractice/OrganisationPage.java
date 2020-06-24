package com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Utility;

public class OrganisationPage extends Utility {


	public OrganisationPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}


	public void ClickOnAdmin() {


		clickOnElment("xpath","//b[contains(text(),'Admin')]");
	}
	public void ClickOnOrganization() {

		clickOnElment("xpath","//a[@id='menu_admin_Organization']");
	}

	public void ClickOnInformation() {
		clickOnElment("id","menu_admin_viewOrganizationGeneralInformation");



	}


	public void ChkFieldEnabled() 
	{
		WebElement textbox  = driver.findElement(By.xpath("//input[@id='organization_name']"));

		boolean actualValue = textbox.isEnabled();

		if (actualValue)

			System.out.println("Edit Button is enabled");
		else
			System.out.println("Edit Button is not  enabled");

	}

	public void ClickOnEditButton() {

		clickOnElment("xpath","//input[@id='btnSaveGenInfo']");


	}

	public void ClearNametextBox() {
	
	
		clearField("xpath","//input[@id='organization_name']");
	}
	public void EnterName() {
		sendData("xpath","//input[@id='organization_name']","Automation");
	}
	public void ClearFax() {
		clearField("xpath","//input[@id='organization_fax']");
	}
	public void EnterFax() {
		sendData("xpath","//input[@id='organization_fax']","575757");
	}
   
	
	public PimPage ClickOnSaveButton() throws Throwable {
		
		  clickOnElment("xpath","//input[@id='btnSaveGenInfo']");
		  
		  System.out.println("*********************************************");

		return new PimPage();
	}
	
}