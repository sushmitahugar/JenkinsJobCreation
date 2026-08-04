package com.automationexrecise.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import validationHelper.validation;

public class UserPage extends BasePage{


	// declaration locator
	By cotinueBtn=By.xpath("//a[.='Continue']");
	By logedInUser=By.xpath("//i[@class='fa fa-user']");
	By deleteAccBtn=By.xpath("//a[@href='/delete_account']");
	By accDeleted=By.xpath("//b[.='Account Deleted!']");
	By accDeletedMsg=By.xpath("//h2/b");
	
	//initialization
	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	//utilization
	@Step("chkLoggedInUser")
    public boolean chkLoggedInUser() {
	  elementActions.clickOnElement(cotinueBtn);
	return  elementValidation.ElementisDispalyed(logedInUser);
  }	  		  
	@Step("deleteAccount")
     public String deleteAccount() {
		  elementActions.clickOnElement(deleteAccBtn);
		 return elementInfo.fetchElementText(accDeletedMsg);
	  }
	@Step("clickOncontinue")
     public void clickOncontinue() {
			 elementActions.clickOnElement(cotinueBtn);
		 }		 	 
  }
	
	
	
	
	

