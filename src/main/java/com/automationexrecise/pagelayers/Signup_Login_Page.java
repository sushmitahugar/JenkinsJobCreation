package com.automationexrecise.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import com.automationexecrise.genericutilities.HandlingDropdown;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Step;

public class Signup_Login_Page extends BasePage {
By SignupPageHeading=By.xpath("//h2[.='New User Signup!']");
	By nameTf=By.name("name");
	By emailTf=By.xpath("//input[@data-qa='signup-email']");
	By signupBtn=By.xpath("//button[.='Signup']");
	
	//enter account information
	By enterAccountPageHeading=By.xpath("//b[text()='Enter Account Information']");
	
	//dynamic locators
        public By selectGender(String genderInput) {
        	By gender = null;
        	if(genderInput.equals("Male")) {
			gender=By.xpath("//input[@type='radio' and @value='Mr']");
		}else if(genderInput.equals("Female")){
			gender=By.xpath("//input[@type='radio' and @value='Mrs']");
		}
		return gender;
	}
	By nameTfAI=By.xpath("//input[@id='name']");
	By emailTfAI=By.xpath("//input[@name='email']");
	By psswTfAI=By.xpath("//input[@id='password']");
	//DOB
	By dateTf=By.xpath("//select[@id='days']");
	By monthTf=By.xpath("//select[@id='months']");
	By yearTf=By.xpath("//select[@id='years']");
	By newsLetterCheckBox=By.xpath("//label[@for='newsletter']");
	By ReceiveCheckBox=By.xpath("//label[@for='optin']");
	
	//address information
	By firstnameTf=By.xpath("//input[@id='first_name']");
	By lastnameTf=By.xpath("//input[@id='last_name']");
	By companyTf=By.xpath("//input[@id='company']");
	By addressTf=By.xpath("//input[@id='address1']");
	By countryselectF=By.xpath("//select[@id='country']");
	By stateTf=By.xpath("//input[@id='state']");
	By cityTf=By.xpath("//input[@id='city']");
	By zipcodeTf=By.xpath("//input[@id='zipcode']");
	By mobilenumberTf=By.xpath("//input[@id='mobile_number']");
	By createAccBtn=By.xpath("//button[text()='Create Account']");
	By userPageHeading=By.xpath("//b[.='Account Created!']");
	private HandlingDropdown handlingDropdown;
	
	public Signup_Login_Page(WebDriver driver) {
	super(driver);
	}	
	
	@Step("verifyLoginPageHeading")
	public String verifyLoginPageHeading() {
	Reporter.log("Fetched and returned login page heading",true);
	ChainTestListener.log("Fetched and returned login page heading");
	return	elementInfo.fetchElementText(SignupPageHeading);
		
		
	}
	@Step("newUserSignup")
	    public String newUserSignup(String name,String email) {
		elementActions.enterValues(nameTf, name);
		Reporter.log("step 6 located nameTf and entered\t" +name,true);
		ChainTestListener.log("step 6 located nameTf and entered");
		elementActions.enterValues(emailTf, email);
		Reporter.log("step 6 located emailTf and entered\t" +name,true);
		ChainTestListener.log("step 6 located emailTf and entered");
        elementActions.clickOnElement(signupBtn);
		Reporter.log("step 7 located submitBtn and clicked\t" +name,true);
		ChainTestListener.log("step 7 located submitBtn and clicked");
        return elementInfo.fetchElementText(enterAccountPageHeading);
	}   
       
       //Enter account information page.
//for allure report is Step and Paramerters for testng
	      @Step("enterAccInformation")
	      @Parameters({"gender","psw", "date","month","year"})
          public void enterAccInformation(String gender,String psw,String date,String month,String year) {
	      
        	 elementActions.clickOnElement(selectGender(gender));
        	  //driver.findElement(selectGender(gender)).click();
	      System.out.println("Entering scc information");
	      //elementActions.enterValues(nameTfAI, name);
	    //  elementActions.enterValues(emailTfAI, email);
	      elementActions.enterValues(psswTfAI, psw);
	      
	      handlingDropdown = new HandlingDropdown(wait.locateElement(dateTf));
	      handlingDropdown.selectOptions(date);
	      handlingDropdown=new HandlingDropdown(wait.locateElement(monthTf));
	      handlingDropdown.selectOptions(month);
	      handlingDropdown=new HandlingDropdown(wait.locateElement(yearTf));
	      handlingDropdown.selectOptions(year);
         
	      elementActions.clickOnElement(newsLetterCheckBox);
	      //driver.findElement(newsLetterCheckBox).click();;
	     elementActions.clickOnElement(ReceiveCheckBox);
	     // driver.findElement(ReceiveCheckBox).click();
	      Reporter.log("step 9,10,11 filled details" ,true);
	      ChainTestListener.log("step 9,10,11 filled details");
          }	      
	      //Address information
	      @Step("enterAddressInformation")
	      @Parameters({"firstname","lastname", "comapny","address","country","state","city","zipcode","mobilenumber"})

	      public String enterAddressInformation(String firstname,String lastname,String comapny,String address,String country,String state,String city,String zipcode,String mobilenumber) {
		      elementActions.enterValues(firstnameTf, firstname);
		      elementActions.enterValues(lastnameTf, lastname);
		      elementActions.enterValues(companyTf, comapny);
		      elementActions.enterValues(addressTf, address);
		      
		      handlingDropdown=new HandlingDropdown(wait.locateElement(countryselectF));
		      handlingDropdown.selectOptions(country);
		      
		      elementActions.enterValues(stateTf, state);
		      elementActions.enterValues(cityTf, city);
		      elementActions.enterValues(zipcodeTf, zipcode);
		      elementActions.enterValues(mobilenumberTf, mobilenumber);
		      elementActions.clickOnElement(createAccBtn);
	      
	      Reporter.log("step no 12,12 fill the deatils",true);
	      ChainTestListener.log("step no 12,12 fill the deatils");
	      return  elementInfo.fetchElementText(userPageHeading);
}
         
}


	

