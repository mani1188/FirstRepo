/*Click on Job
 * Select the PayGrade option
 * To Add payGrade Click On Add button
 * Add the payGrade
 * Save the PayGrade
 * Print the results on console
 */


package com.JavaPractice;

import org.testng.annotations.Test;

public class PayGradeTestCase extends PayGradesPage {
	public PayGradeTestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test

	public void PayGradeTest() throws Throwable 
	{
		clickOnJob();
		ClickOnPayGrade();
		ClickOnAddButton();
		EnterPayGrade();
		ClickOnSaveButton(); 
		PrintTable();



	}
}