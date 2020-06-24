package com.utility;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterNG {

static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
		
		String fileppath =System.getProperty("user.dir")+"\\Reports\\learn_automation2.html";
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(fileppath);
		
		//ExtentHtmlReporter reporter=new ExtentHtmlReporter("E://Bebo//MyWorkspace//JavaPractice//Reports/learn_automation2.html");
		
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mani");
		return extent;
		
	}
}








