/*Click on admin
 * Click on job
 * Select the Workshift page
 * Click on Add button to select the Workshift
 * Select the Workhours 
 * print the value on console
 * Compare it with expected one 
 * Verify the visibility of employee from Assigned Employee
 * print the value on console
 * Click on Add 
 * Save the Changes
 */


package com.JavaPractice;
import org.testng.annotations.Test;
public class WorkShiftsTestcase extends WorkShiftsPage {

	public WorkShiftsTestcase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test

	public void workshiftsTest() throws Throwable {

		ClickOnAdmin();
		ClickOnJob();
		ClickOnWorkshift();
		ClickOnAddButton();
		WorkshiftName();
		SelectWorkHours();
		DurationValue();
		AvailableEmployess();
		VisibilityOftext();
		ClickOnSaveButton();

	}
}