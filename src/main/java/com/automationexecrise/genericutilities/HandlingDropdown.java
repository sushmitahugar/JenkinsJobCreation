package com.automationexecrise.genericutilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationexrecise.exceptions.ElementExceptions;

import validationHelper.validation;

public class HandlingDropdown {
private Select dropDownAddress;
	
	public HandlingDropdown(WebElement dropDown) {
		validation.validatewebelementInput("HandlingDropdown", dropDown);
		dropDownAddress = new Select(dropDown);
	}
	
	public boolean multiSelectOrNot() {
		return dropDownAddress.isMultiple();
	}
	
	public void selectOptions(Object input) {
		if(input instanceof Integer) {
			dropDownAddress.selectByIndex((int) input);
		}	else if(input instanceof String) {
			dropDownAddress.selectByValue((String) input);
		}else if(input instanceof String) {
			dropDownAddress.selectByVisibleText((String) input);
		}else if(input instanceof String) {
			dropDownAddress.selectByContainsVisibleText((String) input);
	}else {
		throw new ElementExceptions("SelectOptions is failed");
		}
	}
	
	public void deselectOptions(Object input) {
		if(input instanceof Integer) {
			dropDownAddress.deselectByIndex((int) input);
		}	else if(input instanceof String) {
			dropDownAddress.deselectByValue((String) input);
		}else if(input instanceof String) {
			dropDownAddress.deselectByVisibleText((String) input);
		}else if(input instanceof String) {
			dropDownAddress.deSelectByContainsVisibleText((String) input);
		}else if(input==null) {
			dropDownAddress.deselectAll();

	}else {
		throw new ElementExceptions("deSelectOptions is failed");
		}
	}

	
	public WebElement fetchFirstSelectedOption() {
		try {
			return dropDownAddress.getFirstSelectedOption();
		}catch(Exception e) {
			throw new ElementExceptions("Failed to fecthFirstSelectedOption");
		}
	}
	
	public List<WebElement> fetchAllSelectedOptions() {
		try {
			return dropDownAddress.getAllSelectedOptions();
		}catch(Exception e) {
			throw new ElementExceptions("Failed to fetchAllSelectedOption");
		}
	
	}
	public List<WebElement> fetchOptions() {
		try {
			return dropDownAddress.getOptions();
		}catch(Exception e) {
			throw new ElementExceptions("Failed to fecthOption");
		}
	
	}	
	
}
