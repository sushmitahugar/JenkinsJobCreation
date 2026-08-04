package com.automationexricise.testdatamanager;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import com.github.javafaker.Faker;

public class FakerData {
static Faker fakeData=new Faker();

public String getName() {
	return fakeData.name().name();
}
public String getEmail() {
	return fakeData.internet().emailAddress();
}

public String getGender() {
	return fakeData.demographic().sex();
}

public String getPassword() {
	return fakeData.internet().password(6,8,true,true,true);
	}
public String getDate() {
	Date randomnDate=fakeData.date().birthday();
	LocalDate localDate=randomnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	int dayOfMonth=localDate.getDayOfMonth();	
	return String.valueOf(dayOfMonth);
}

public String getMonth() {
	Date randomnDate=fakeData.date().birthday();
	LocalDate localDate=randomnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return String.valueOf(localDate.getMonthValue());
}
public String getYear() {
	Date randomnDate=fakeData.date().birthday();
	LocalDate	localDate=randomnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return String.valueOf(localDate.getYear());
}
public String getFirstName() {
	return fakeData.name().firstName();
}
public String getLastName() {
	return fakeData.name().lastName();
}
public String getCompany() {
	return fakeData.company().name();
}
public String getAddress() {
	return fakeData.address().fullAddress();
}

public String getCountry() {
	return fakeData.address().country();
}
public String getState() {
	return fakeData.address().state();
}

public String getCity() {
	return fakeData.address().city();
}
public String getZipcode() {
	return fakeData.address().zipCode();
}
public String getMobileNo() {
	return fakeData.number().digit();
}

}












