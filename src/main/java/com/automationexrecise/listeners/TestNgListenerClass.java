package com.automationexrecise.listeners;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.automationexecrise.browsermanager.BrowserConfig;
import com.automationexecrise.genericutilities.CaptureScreenshot;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;

public  class TestNgListenerClass implements ITestListener{

	//suite level
	
	public void onStart(ITestContext context) {
		Reporter.log("Suite"+ context.getName()+"started excution",true);
		ChainTestListener.log("Suite\"+ context.getName()+\"started excution");
	}
	public void onFinish(ITestContext context) {
		Reporter.log("Suite"+ context.getName()+"finished excution",true);
		ChainTestListener.log("Suite\"+ context.getName()+\"finished excution");
	}
	
	//test level
	public void onTestStart(ITestResult result) {
		Reporter.log("Suite"+ result.getName()+"started excution",true);
		ChainTestListener.log("Suite\"+ result.getName()+\"started excution");

	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Suite"+ result.getName()+"has been excuted successfully",true);
		ChainTestListener.log("Suite\"+ result.getName()+\"has been excuted successfully");

	}
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Suite"+ result.getName()+"has been excuted successfully",true);
		ChainTestListener.log("Suite\"+ result.getName()+\"has been excuted successfully");

	}
	//on failure test case taking the screenshots
	public void onTestFailure(ITestResult result) {
		Reporter.log("Suite"+ result.getName()+"has skipped from excuted ",true);
		ChainTestListener.log("Suite\"+ result.getName()+\"has skipped from excuted");
         WebDriver driver=BrowserConfig.getDriver();
         if(driver!=null) {
        	 byte[] image=CaptureScreenshot.getScreenshotAsBytes(driver);
        	 ChainTestListener.embed(image, "image/png");
        	 ChainTestListener.log("Captureed the Screenshot of failed testcases"+result.getName());
        	 
          
        	 
        	 Allure.addAttachment("Failure Screenshot","image/png", new ByteArrayInputStream(image),".png");
        	    	 
         
         }
         
	}
	}
	
	
	

