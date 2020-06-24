package com.JavaPractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Utility;

public class PayGradesPage  extends Utility

{
	public PayGradesPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}



	public void clickOnJob() 

	{

		clickOnElment("xpath","//a[@id='menu_admin_Job']");
	}
	public void ClickOnPayGrade() {
		clickOnElment("xpath","//a[@id='menu_admin_viewPayGrades']");
	}
	public void ClickOnAddButton() {
		clickOnElment("xpath","//input[@id='btnAdd']");
	}
	public void EnterPayGrade() {
		sendData("xpath","//input[@id='payGrade_name']","AA");
	}


	public void ClickOnSaveButton() {
		clickOnElment("xpath","//input[@id='btnSave']");

		System.out.println("Saved Sucessfully ");



	}



	public EmloymentStatusPage PrintTable() throws Throwable {

		List<WebElement> table =      driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

		List<WebElement> rowsList = driver.findElements((By.tagName("tr")));


		for (WebElement row : rowsList) {

			System.out.println(row.getText() + "|");
			

		}

		System.out.println("*************************************");

		return new EmloymentStatusPage();



	}

}
