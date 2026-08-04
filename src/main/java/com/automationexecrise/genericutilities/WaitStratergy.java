package com.automationexecrise.genericutilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.automationexrecise.constants.ExceptionMessages;
import com.automationexrecise.exceptions.ElementExceptions;

import validationHelper.validation;

public class WaitStratergy extends BaseGenericUtility {
FluentWait<WebDriver> fw;
	public WaitStratergy(WebDriver driver) {
		super(driver);
		fw=new FluentWait<WebDriver>(driver).pollingEvery(DurationofSeconds(10)).ignoring(Exception.class);
	}
private Duration DurationofSeconds(int i) {
		// TODO Auto-generated method stub	
		return null;
	}
public WebElement locateElement(By locator) {
	validation.validateLocatorInput("locateElement", locator);
	try {
	return	fw.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}catch(Exception e) {
		throw new ElementExceptions(ExceptionMessages.locateElement);
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
