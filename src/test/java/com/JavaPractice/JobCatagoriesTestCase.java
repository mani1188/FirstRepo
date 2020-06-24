/*Click on Job Module
 * Click on JobCatagoery
 * Click on Add button
 * Enter the Job Name
 * Click On Save Button
 * Print the JobCatagoery with Name on console
 * 
 */

package com.JavaPractice;
import org.testng.annotations.Test;

public class JobCatagoriesTestCase extends JobCatagoriesPage {


	public JobCatagoriesTestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}


	@Test

	public void JobCatagoryTest() {
		ClickOnJob();
		ClickOnJobCatagory();
		ClickOnAddJobCatagoery();
		EnterJobName();
		ClickOnSaveJobCatagoery();
		try {
			PrintJobCatogeries();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}