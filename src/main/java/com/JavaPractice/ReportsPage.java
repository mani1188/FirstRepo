package com.JavaPractice;
import org.openqa.selenium.JavascriptExecutor;

import com.utility.Utility;

public class ReportsPage extends Utility {

	public ReportsPage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ClickOnReports() {

		clickOnElment("xpath","//a[@id='menu_core_viewDefinedPredefinedReports']");

	}

	public void ClickOnLink() {

		clickOnElment("xpath","//a[contains(text(),'Run')]");

	}

	public void Scroll() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		System.out.println("Scrolled vertically  till the end of Page ");
		
		
	}
	
	
}
