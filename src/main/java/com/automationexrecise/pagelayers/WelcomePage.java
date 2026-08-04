package com.automationexrecise.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Step;

public class WelcomePage extends BasePage {

	By homepageheading = By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers'][1]");
	By singupLoginLink=By.xpath("//a[@href='/login']");
	
	
 public	WelcomePage(WebDriver driver) {
 super(driver);
}
	@Step("verifyHomePageDisplayed")

   public String verifyHomePageDisplayed(){
	  String expectedHomePageHeading="Full-Fledged practice website for Automation Engineers";
	  Reporter.log("Fecthed and returned homePage/welcomePage title", true);
	  ChainTestListener.log("Fecthed and returned homePage/welcomePage title");
	//  return wait.locateElement(homepageheading1).getText();
	  return elementInfo.fetchElementText(homepageheading);
}
	@Step("Signup_Login_Page")

   public  Signup_Login_Page navigateToLoginSignupPage() {
	  driver.findElement(singupLoginLink).click();
	   elementActions.clickOnElement(singupLoginLink);
	   Reporter.log("step no 4 clicked on signuplink and navigating respective page", true);
	   ChainTestListener.log("step no 4 clicked on signuplink and navigating respective page");
	   Reporter.log("Signup page object is created",true);
	   ChainTestListener.log("Signup page object is created");
	   return new Signup_Login_Page(driver);
    	 
     }
}