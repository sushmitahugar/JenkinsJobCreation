package com.automationexrecise.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automationexrecise.pagelayers.Signup_Login_Page;
import com.automationexrecise.pagelayers.UserPage;
import com.automationexricise.testdatamanager.TestCase01Data;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TestCase3 extends BaseTest {
	private static final Logger logger=LogManager.getLogger(BaseTest.class);

    @Epic("Web interface")
    @Feature("Essential features")
    @Story("UserCreation")
    @Description("This test attempt to create user and delete user")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("John Doe")
	@Test(dataProvider = "userSignup", dataProviderClass = TestCase01Data.class, invocationCount = 1)
    
	public void ITC01(String name, String email, String gender, String psw, String date, String month, String year,
			String firstName, String lastname, String company, String address, String country, String state,
			String city, String zipcode, String mobileNo) {
    	
    	Reporter.log("Auto jenkins triggerring  1", true);
		ChainTestListener.log("Auto jenkins triggerring 1");
		logger.info("Auto jenkins triggerring  1");
    	
    	
    	
		String expectedHomePageHeading = "Full-Fledged practice website for Automation Engineers";
		String homePageHeading = welcomePage.verifyHomePageDisplayed();
		Assert.assertEquals(expectedHomePageHeading, homePageHeading);
		Reporter.log("step no 3 verify homepage is visible successfully", true);
		ChainTestListener.log("step no 3 verify homepage is visible successfully");
		logger.info("step no 3 verify homepage is visible successfully");

		Signup_Login_Page signup_Login_Page = welcomePage.navigateToLoginSignupPage();
		String expectedSignupPageHeading = "New User Signup!";
		String SignupPageHeading = signup_Login_Page.verifyLoginPageHeading();

		Assert.assertEquals(SignupPageHeading, expectedSignupPageHeading);
		Reporter.log("step no 5 verifed that New user signup! is visible", true);
		ChainTestListener.log("step no 5 verifed that New user signup! is visible");
		logger.info("step no 5 verifed that New user signup! is visible");


		// input usersignup
		String newUserSignupMsg = signup_Login_Page.newUserSignup(name, email);
		String expectedNewUserSignupMsg = "ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(newUserSignupMsg, expectedNewUserSignupMsg);
		Reporter.log("step no 8 verifed that ENTER ACCOUNT INFORMATION is visible", true);
		ChainTestListener.log("step no 8 verifed that ENTER ACCOUNT INFORMATION is visible");
		logger.info("step no 8 verifed that ENTER ACCOUNT INFORMATION is visible");


		// Input-accountInfromation
		signup_Login_Page.enterAccInformation(gender, psw, date, month, year);
		Reporter.log("step no 9 fill deatials ", true);
		ChainTestListener.log("step no 9 fill deatials");
		logger.info("step no 9 fill deatials");

		String accountCreatedExpectedMsg = "ACCOUNT CREATED!";

		// Input-addressInforamtion
		String accountCreatedMSg = signup_Login_Page.enterAddressInformation(firstName, lastname,
				accountCreatedExpectedMsg, address, country, state, city, zipcode, mobileNo);
		Assert.assertEquals(accountCreatedMSg, accountCreatedExpectedMsg);
		Reporter.log("Step no 10,11,12,13,14 verified that ENTER ACCOUNT INFORMATION is visible", true);
        ChainTestListener.log("Step no 10,11,12,13,14 verified that ENTER ACCOUNT INFORMATION is visible");
		UserPage userPage = new UserPage(driver);
		boolean flag = userPage.chkLoggedInUser();
		Assert.assertTrue(flag);
		Reporter.log("Step no 15,16 verified that logged in as username is visible", true);
		ChainTestListener.log("Step no 15,16 verified that logged in as username is visible");
		logger.info("Step no 15,16 verified that logged in as username is visible");

        String accountDeletedExpectedMsg = "ACCOUNT DELETED!";
		String deleteAccountMsg = userPage.deleteAccount();
		Assert.assertEquals(deleteAccountMsg, accountDeletedExpectedMsg);
		userPage.clickOncontinue();
		Reporter.log("step no 17,18 account deleted! is visible and clicked on continue button", true);
        ChainTestListener.log("step no 17,18 account deleted! is visible and clicked on continue button");
		logger.info("step no 17,18 account deleted! is visible and clicked on continue button");

	}

}
