package com.JavaPractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Utility;

public class JobPage extends Utility {


	public JobPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickOnAdmin() {
		

		clickOnElment("xpath","//b[contains(text(),'Admin')]");
	}
	public void ClickOnJob() {
		clickOnElment("xpath","//a[@id='menu_admin_Job']");
	}
	public void ClickOnJobTitle() {
		clickOnElment("xpath","//a[@id='menu_admin_viewJobTitleList']");
	}
	public void ClickOnAddButton() {
		clickOnElment("xpath","//input[@id='btnAdd']");
	}
	public void EnterJobTitile() {

		sendData("id","jobTitle_jobTitle","Tester12");
	}
	public void EnterJobDescription() {
		sendData("id","jobTitle_jobDescription","testing");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	public void choosefile() {

		String filepath= "C:\\Users\\mani panjala\\Desktop\\excel.txt";


		driver.findElement(By.xpath("//input[@id='jobTitle_jobSpec']")).sendKeys(filepath);


		int width=driver.findElement(By.xpath("//input[@id='jobTitle_jobSpec']")).getSize().getWidth();

		System.out.println("Width of file is " + width);

		int height=driver.findElement(By.xpath("//input[@id='jobTitle_jobSpec']")).getSize().getHeight();

		System.out.println("Height of file is " + height);

		WebElement text = driver.findElement(By.xpath("//label[@class='fieldHelpBottom']"));

		System.out.println(text.getText());


	}
	public void Uploadfile() {

		File files = new File("C:\\Users\\mani panjala\\Desktop\\excel.txt");

		System.out.println("Length of file is " + files.length());
	}




	public void  Addnotes() throws Throwable {

		sendData("id","jobTitle_note","Testing");
	}


	public PayGradesPage ClickOnSaveButton() throws Throwable {

		clickOnElment("xpath","//input[@id='btnSave']");
		
		System.out.println("*************************************");

		return new PayGradesPage();
	}

	
}