package validationHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automationexrecise.exceptions.ElementExceptions;
import com.automationexrecise.exceptions.InputDataExceptions;

public class validation {
	public static void validateStringInput(String methodName, String input) {
		if(methodName==null) {
			throw new InputDataExceptions("The method name cannot be null");
		}if(input==null) {
			throw new InputDataExceptions("The string input name cannot be null");
		}
	}
	public static void validateLocatorInput(String methodName, By Locator) {
if(methodName==null) {
	throw new ElementExceptions("The method name cannot be null");
	}if(Locator==null) {
		throw new ElementExceptions("The locator cannot be null");
	}
}
public static void validatenumericInput(String methodName,int input) {
	if(methodName==null) {
		throw new InputDataExceptions("The method name cannot be null");
	}if(input<=0) {
		throw new InputDataExceptions("The numeric input cannot be less than 0");
	}
}	
public static void validatewebelementInput(String methodName, WebElement elementAddress) {
	if(methodName==null) {
		throw new ElementExceptions("The method name caanot be null");
	}if(elementAddress==null) {
		throw new ElementExceptions("The elementaddress cannot be null");
	}
}
	
	
	
	
	
}
