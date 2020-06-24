package com.JavaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Utility;

public class UserManagementPage extends Utility {

	public UserManagementPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}


	public void ClickOnAdmin() 
	{
		clickOnElment("xpath","//b[contains(text(),'Admin')]");
	}
	public void ClickOnUsrmngmnt() {
		clickOnElment("xpath","//a[contains(text(),'User Management')]");
	}
	public void EnterUserName() {
		sendData("id","searchSystemUser_userName","admin");
	}
	public void SelectUserType() {
		selectListByValue("id","searchSystemUser_userType","1");
	}
	public void SearchEmpName() {
		sendData("id","searchSystemUser_employeeName_empName","admin");
	}
	public void SelectStatus() {
		selectListByValue("id","searchSystemUser_status","1");
	}
		
	public void ClickOnsearchButton() {
			clickOnElment("xpath","//input[@name='_search']");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}


		public JobPage  Chkresults() throws Throwable 
		{


			List<WebElement> table1 = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

			List<WebElement> results =driver.findElements((By.tagName("tr")));


			for (int i = 0; i < results.size(); i++) {

				String temp = results.get(i).getText();

				System.out.println(temp);
				
				
			}
			System.out.println("*************************************");
			return new JobPage();
			
		
		}  


}
















































































