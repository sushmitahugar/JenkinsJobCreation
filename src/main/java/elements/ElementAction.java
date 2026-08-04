package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationexrecise.exceptions.ElementExceptions;

import validationHelper.validation;

public class ElementAction extends ElementsBase{
public ElementAction(WebDriver driver) {
	super(driver);
}
public void clickOnElement(By locator) {
	validation.validateLocatorInput("clickOnElement()", locator);
	try {
		//driver.findElement(locator).click();
		wait.locateElement(locator).click();
	}catch(Exception e) {
		throw new ElementExceptions("clickOnElement() is failed to excute action");
	}
}
public void ClearTheElement(By locator) {
	validation.validateLocatorInput("ClearTheElement()", locator);
	try {
		//driver.findElement(locator).click();
		wait.locateElement(locator).clear();
	}catch(Exception e) {
		throw new ElementExceptions("ClearTheElement() is failed to excute action");
	}
}
public void enterValues(By locator,String input) {
	validation.validateLocatorInput("enterValues()", locator);
	validation.validateStringInput("enterValues()", input);

	try {
		//driver.findElement(locator).click();
		wait.locateElement(locator).sendKeys(input);
	}catch(Exception e) {
		throw new ElementExceptions("enterValues() is failed to excute action");
	}
}
public void submitForm(By locator) {
	validation.validateLocatorInput("submitForm()", locator);
	try {
		//driver.findElement(locator).click();
		wait.locateElement(locator).submit();
	}catch(Exception e) {
		throw new ElementExceptions("submitForm() is failed to excute action");
	}
}

}
