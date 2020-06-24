/*Click On Admin Module
 * Click On Job Heading
 * Under Job Click On Jobtitle
 * Click On Add Button
 * Enter the Job Title
 * Enter JobDescription
 * Choose file 
 * Upload the file
 * Add notes in it 
 * Specify the dimensions of File 
 *Then  Save it successfully
 */
package com.JavaPractice;
import org.testng.annotations.Test;
public class JobTestcase extends JobPage   {

	public JobTestcase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}


	@Test
	public void JobTest() throws Throwable {
		clickOnAdmin();
		ClickOnJob();
		ClickOnJobTitle();
		ClickOnAddButton();
		EnterJobTitile();
		EnterJobDescription();
		choosefile();
		Uploadfile();
		Addnotes() ;
		ClickOnSaveButton();
	}

}