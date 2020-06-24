/* Click On PimModule
 * select the EmployeeList
 * Click on the Link Text
 * Verify the Edit button Enabled or Disabled
 * print on console
 * Disabled the button
 * Select the date from date picker
 * Get the value from text box
 * print it on console 
 * Compare it wit Actual and expected one 
 * Then save the value 
 * Print the table on console 
 */




package com.JavaPractice;
import org.testng.annotations.Test;
public class PimtestCase extends PimPage {

	public PimtestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void PimTest() throws Throwable {

		ClickOnPimModule();
		ClickOnEmployeeList();
		ClickOnLink();
		EditButtonIsDisabled();
		ClickOnEditButton();
		ClickonDatePicker();
		ClickOnSaveButton();
		ClickOnEmployeeList1();
		PrintTable();
	}
}