package com.automationexricise.testdatamanager;

import org.testng.annotations.DataProvider;


	public class TestCase01Data {
		FakerData data=new FakerData(); 
			
		@DataProvider(name="userSignup")
		public String[][]testCase01Data(){
			String[][] userSignup=new String[1][16];
			userSignup[0][0]=data.getName();
			userSignup[0][1]=data.getEmail();

			userSignup[0][2]=data.getGender();
			userSignup[0][3]=data.getPassword();

			userSignup[0][4]=data.getDate();
			userSignup[0][5]=data.getMonth();
			userSignup[0][6]=data.getYear();

			userSignup[0][7]=data.getFirstName();
			userSignup[0][8]=data.getLastName();
			userSignup[0][9]=data.getCompany();
			userSignup[0][10]=data.getAddress();
			//userSignup[0][0]=data.getCountry();
			userSignup[0][11]="India";

			
			userSignup[0][12]=data.getState();
			userSignup[0][13]=data.getCity();
			userSignup[0][14]=data.getZipcode();
			userSignup[0][15]=data.getMobileNo();
		return userSignup;
			
			

		}
			
			
			
			
		}

