/*Click on JobModule
 * Select the EmloyeeStatus
 * Click on Add EmployeeStatus
 * Enter the Name of Employee
 * Click on Save the Employee Name
 * Then print the table Along with Name Saved
 */


package com.JavaPractice;

import org.testng.annotations.Test;

public class EmploymentStatusTestCase extends EmloymentStatusPage {

	public EmploymentStatusTestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void EmploymentStatusTest() throws Throwable 
	{
		ClickOnJob();
		ClickOnEmplstatus();
		ClickOnAddButton();
		EnterEmplName();
		ClickOnSaveButton();
		ResultsPage();

	}
}