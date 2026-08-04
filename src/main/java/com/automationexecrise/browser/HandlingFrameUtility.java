package com.automationexecrise.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationexrecise.constants.ExceptionMessages;
import com.automationexrecise.exceptions.FrameworkExceptions;

import validationHelper.validation;

public class HandlingFrameUtility extends BrowserPage{
public HandlingFrameUtility(WebDriver driver) {	
	super(driver);
}
public WebDriver switchToFrame(int input) {	
	validation.validatenumericInput("switchToFrame", input);
	try {
		return driver.switchTo().frame(input);
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.switchToFrameWithInt+input);
	}
	
}

public WebDriver switchToFrame(String input) {
	validation.validateStringInput("switchToFrame", input);
	try {
		return driver.switchTo().frame(input);
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.switchToFrameWithString+input);	
	}
}
public WebDriver switchToFrame(By input) {
	validation.validateLocatorInput("switchToFrame", input);
	try {	
		return driver.switchTo().frame(driver.findElement(input));
	}catch(Exception e) {
		//throw new FrameworkExceptions(ExceptionMessages.switchToFrameWithAddress+input);
		throw new FrameworkExceptions(ExceptionMessages.switchToFrameWithAddress+input.toString());
	}
}
public WebDriver switchToParentFrame() {
	try {
		return driver.switchTo().parentFrame();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.switchToParentFrame);	
	}
}
public WebDriver switchToMainPage() {
	try {
		return driver.switchTo().defaultContent();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.switchToMainPage);	
	}
}








}
