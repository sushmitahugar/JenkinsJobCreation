package com.automationexecrise.browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.automationexrecise.constants.ExceptionMessages;
import com.automationexrecise.exceptions.FrameworkExceptions;

import validationHelper.validation;

public class AlertUtility extends BrowserPage{



	public AlertUtility(WebDriver driver) {
        super(driver);
	}
	
	public Alert switchToAlert() {
		try {
			return driver.switchTo().alert();
		}catch(Exception e) {
			throw new FrameworkExceptions(ExceptionMessages.switchToAlert);
		}
		
	}
	
	public void acceptAlert() {
		try {
			switchToAlert().accept();
		}catch(Exception e) {
			throw new FrameworkExceptions(ExceptionMessages.acceptAlert);
		}
		
	}
	
	public void dismissAlert() {
		try {
			switchToAlert().dismiss();
		}catch(Exception e) {
			throw new FrameworkExceptions(ExceptionMessages.dismissAlert);
		}
		
	}

	public void enterInfoAlert(String alertvalue) {
		validation.validateStringInput("enterInfoAlert", alertvalue);
		try {
		switchToAlert().sendKeys(alertvalue);
		}catch(Exception e) {
			throw new FrameworkExceptions(ExceptionMessages.enterInfoAlert);
		}
		
	}
public String fetchAlertMessgae() {
	try {
		return switchToAlert().getText();
	}catch(Exception e) {
		throw new FrameworkExceptions(ExceptionMessages.fetchAlertMessgae);
	}
}

}
