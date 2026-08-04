package com.automationexecrise.browser;

import org.openqa.selenium.WebDriver;

import com.automationexrecise.constants.ExceptionMessages;
import com.automationexrecise.exceptions.FrameworkExceptions;

public class BrowserInfoAction extends BrowserPage {

	public BrowserInfoAction(WebDriver driver) {
		super(driver);
	}
	public String fetchPageTitle() {
		try {
			return driver.getTitle();
			}catch(Exception e) {
				throw new FrameworkExceptions(ExceptionMessages.fetchPageTitle);
			}
	}
	
	public String fetchPageUrl() {
		try {
			return driver.getCurrentUrl();
			}catch(Exception e) {
				throw new FrameworkExceptions(ExceptionMessages.fetchPageUrl);
			}
	}
	public String fetchPageSource() {
		try {
			return driver.getPageSource();
			}catch(Exception e) {
				throw new FrameworkExceptions(ExceptionMessages.fetchPageSource);
			}
	}
	public void closeTab() {
		try {
			driver.close();
		}catch(Exception e) {
			throw new FrameworkExceptions(ExceptionMessages.closeTab);
		}
	}
	public void clsoeBrowser() {
		try {
			driver.quit();
		}catch(Exception e) {
			throw new FrameworkExceptions(ExceptionMessages.clsoeBrowser);
		}
	}


}
