package com.automationexecrise.browsermanager;

import org.codehaus.plexus.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.automationexrecise.exceptions.FrameworkExceptions;
import com.aventstack.chaintest.plugins.ChainTestListener;

public class BrowserConfig {
 
	static ThreadLocal<WebDriver>threadLocal=new ThreadLocal<WebDriver>();
	
	public static WebDriver initBrowser(String browserName,Boolean headlessMode,Boolean privateMode) {
		browserName=browserName.toLowerCase();
		switch(browserName) {
		case "chrome":threadLocal.set(new ChromeDriver(BrowserOptions.getChromeOptions(headlessMode,privateMode)));

			threadLocal.set(new ChromeDriver());
			break;
		case "firefox":
			threadLocal.set(new FirefoxDriver());
			break;
		case "edge":
			threadLocal.set(new EdgeDriver());
			break;
       default: Reporter.log("Invalid browserName passed\t"+browserName,true);
       ChainTestListener.log("Invalid browserName passed");
      
       throw new FrameworkExceptions("Supports only chrome/edge/firefox browsers  "+browserName+" is not allowed");

		}
		return getDriver();
	}
public static WebDriver getDriver() {
	return threadLocal.get();
}
	}

