/*Click On Reports 
 *Click on the Run Link
 *Scroll down the page vertically  till the End of the page 
 */




package com.JavaPractice;

import org.testng.annotations.Test;

public class ReportsTestCase extends ReportsPage {

	public ReportsTestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test

	public void ReportTest() {

		ClickOnReports();
		ClickOnLink();
		Scroll();
		

	}
}