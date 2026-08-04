package com.automationexecrise.browser;

import org.openqa.selenium.WebDriver;

import com.automationexrecise.constants.ExceptionMessages;
import com.automationexrecise.exceptions.FrameworkExceptions;

import validationHelper.validation;

public class NavigationUtility extends BrowserPage{
public NavigationUtility(WebDriver driver) {
	super(driver);
}
public void open(String testUrl) {
	validation.validateStringInput("open", testUrl);
	try {
		driver.get(testUrl);
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.open + testUrl);
	}
}
public void naviagteTo(String testUrl) {
	try {
		validation.validateStringInput("navigateTo", testUrl);

		driver.navigate().to(testUrl);
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.navigateTo+testUrl);
	}
}
public void naviagteBack() {
	try {
		driver.navigate().back();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.navigateBackMsg);
	}
}
public void navigateForward() {
	try {
		driver.navigate().forward();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.navigateForward);
	}
}
public void refreshPage() {
	try {
		driver.navigate().refresh();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.refreshPage);
	}
}

}
