package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
	

	//ITestListener interface which implements Testng listeners
public class Listeners extends Utility implements ITestListener {



		public Listeners() throws Throwable {
			super();
			// TODO Auto-generated constructor stub
		}
		ExtentTest test;
		ExtentReports extent=ExtentReporterNG.getReportObject();
		ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
		@Override
		public void onTestStart(ITestResult result) {
			test= extent.createTest(result.getMethod().getMethodName());
			extentTest.set(test);
		
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			extentTest.get().log(Status.PASS, "Test Passed");
			
		
		}

		@Override
		public void onTestFailure(ITestResult result ) {
			extentTest.get().fail(result.getThrowable());
			
		}
			
		
		@Override
		public void onTestSkipped(ITestResult result) {
			
			System.out.println("I skipped executed Listeners Pass code" +result.getName());
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
			
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			 extent.flush();
		}

	}












