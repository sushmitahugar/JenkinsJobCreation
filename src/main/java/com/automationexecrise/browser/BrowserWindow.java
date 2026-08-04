package com.automationexecrise.browser;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.automationexrecise.constants.ExceptionMessages;
import com.automationexrecise.exceptions.FrameworkExceptions;

public class BrowserWindow extends BrowserPage{
	
public BrowserWindow(WebDriver driver) {
	super(driver);
}

public void maximizeBrowser() {
	try {
	driver.manage().window().maximize();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.maximizeBriwser);
	}
}
public void minimizeBrowser() {
	try {
	driver.manage().window().minimize();
}catch(Exception e) {
	throw new FrameworkExceptions(ExceptionMessages.minimizeBrowser);
	}
}
public void fullScreenBrowser() {
	try {
	driver.manage().window().fullscreen();
}catch(Exception e) {
	throw new FrameworkExceptions(ExceptionMessages.fullScreenBrowser);
	}
}
public String getParentTabBrowser() {
	try {
	  return driver.getWindowHandle();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.getParentTabBrowser);
	}
}

public Set<String> getAllTabAddress() {
	try {
		 return driver.getWindowHandles();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.getAllTabAddress);
	}
}



}
