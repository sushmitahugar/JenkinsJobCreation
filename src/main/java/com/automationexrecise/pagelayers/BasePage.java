package com.automationexrecise.pagelayers;

import org.openqa.selenium.WebDriver;
import com.automationexecrise.genericutilities.WaitStratergy;

import elements.ElementAction;
import elements.ElementInformation;
import elements.ElementValidation;

public class BasePage {
     protected WebDriver driver;
     protected WaitStratergy wait;
     protected ElementInformation elementInfo;
     protected ElementAction elementActions;
     protected ElementValidation elementValidation;
     
	public BasePage(WebDriver driver) {
		this.driver=driver;
		wait =new WaitStratergy(driver);
		elementInfo = new ElementInformation(driver);
		elementActions=new ElementAction(driver);
		elementValidation=new ElementValidation(driver);
	}
}
