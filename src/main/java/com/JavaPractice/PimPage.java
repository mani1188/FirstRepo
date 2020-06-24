package com.JavaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utility.Utility;

public class PimPage  extends Utility{

	public PimPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ClickOnPimModule() {

		clickOnElment("xpath","//b[contains(text(),'PIM')]");
	}
	public void ClickOnEmployeeList() {
		clickOnElment("xpath","//a[@id='menu_pim_viewEmployeeList']");
	}

	public void ClickOnLink() {

		clickOnElment("xpath","//a[contains(text(),'Linda')]");
	}



	public void EditButtonIsDisabled() {

		WebElement button = driver.findElement(By.xpath("//input[@id='btnSave']"));

		boolean actualValue = button.isEnabled();

		if (actualValue)

			System.out.println("Edit Button is not  enabled");
		else
			System.out.println("Edit Button is  disabled");
	}
	public void ClickOnEditButton() 
	{
		clickOnElment("xpath","//input[@id='btnSave']");
	}

	public void ClickonDatePicker() {

		driver.findElement(By.xpath("//ol[2]//li[4]//img[1]")).click();
		WebElement yearDropDown= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear= new Select(yearDropDown);
		selectYear.selectByVisibleText("2018");

		WebElement monthDropDown= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonth= new Select(monthDropDown);
		selectMonth.selectByVisibleText("Sep");

		WebElement date= driver.findElement(By.xpath("//a[contains(text(),'13')]"));
		date.click();


		String value1=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).getAttribute("value");

		System.out.println("value is" +   value1);

		String value2 = "2018-09-13";


		Assert.assertEquals(value1,value2 );

		System.out.println("Assertion Executed");


	}
	public void ClickOnSaveButton() {
		clickOnElment("xpath","//input[@id='btnSave']");
	}

	public void ClickOnEmployeeList1() {
		clickOnElment("xpath","//a[@id='menu_pim_viewEmployeeList']");
	}

	/*public void RecordToDelete() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ohrmList_chkSelectRecord_30")));

		driver.findElement(By.id("ohrmList_chkSelectRecord_30")).click();

		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();



	}
	public void ClickOnButton() {

		clickOnElment("xpath","//input[@class='btn']");

		System.out.println("Record Deleted Sucessfully ");
	}*/

	public ReportsPage PrintTable() throws Throwable 
	{
		List<WebElement> table7 = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));

		List<WebElement> results =driver.findElements((By.tagName("tr")));


		for (int i = 0; i < results.size(); i++) {

			String temp = results.get(i).getText();

			System.out.println(temp);
			
		}
		System.out.println("**********************************");
		return new ReportsPage();
	}
}