package com.testng;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class d9_task5 {
	public void onTestStart(ITestResult result) {
		System.out.println("Test State : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test success : "+result.getName());
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail : "+result.getName());
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
