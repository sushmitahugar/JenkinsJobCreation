package com.automationexecrise.browsermanager;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import com.aventstack.chaintest.plugins.ChainTestListener;

import jdk.jfr.internal.Logger;



public class BrowserOptions {
	
	
	public static ChromeOptions getChromeOptions(Boolean headlessMode,Boolean privateMode) {
		ChromeOptions copts=new ChromeOptions();
		if(headlessMode) {
			copts.addArguments("--headless");
			Reporter.log("The chrom browser is running in headless mode",true);
			ChainTestListener.log("The chrom browser is running in headless mode");
		
		}
		if(privateMode) {
			copts.addArguments("--incognito");
			Reporter.log("The chrom browser is running in incognito mode",true);
			ChainTestListener.log("The chrom browser is running in incognito mode");

		}
		return copts;
	}

}
