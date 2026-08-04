package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationexrecise.exceptions.ElementExceptions;

import validationHelper.validation;

public class ElementValidation extends ElementsBase {
public ElementValidation(WebDriver driver) {
	super(driver);
}

public boolean ElementisDispalyed(By locator) {
	validation.validateLocatorInput("ElementisDispalyed", locator);
	try {
		return wait.locateElement(locator).isDisplayed();
	}catch(Exception e) {
		throw new ElementExceptions("ElementisDispalyed.is not displayed");
	}
}
public void Elementisenabled(By locator) {
	validation.validateLocatorInput("Elementisenabled", locator);
	try {
		wait.locateElement(locator).isEnabled();
	}catch(Exception e) {
		throw new ElementExceptions("Elementisenabled.checkElementEnabled");
	}
}
public void ElementSelected(By locator) {
	validation.validateLocatorInput("ElementSelected", locator);
	try {
		wait.locateElement(locator).isSelected();
	}catch(Exception e) {
		throw new ElementExceptions("Elementisenabled.checkElementSelected");
	}
}

}
