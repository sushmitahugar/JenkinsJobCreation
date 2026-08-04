package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import com.automationexrecise.exceptions.ElementExceptions;

import validationHelper.validation;

public class ElementInformation extends ElementsBase {
   public ElementInformation(WebDriver deriver) {
	   super(deriver);
   }
  public String fetchElementText(By Locator) {
	  validation.validateLocatorInput("fetchElementText()", Locator);
	  try {
		  return wait.locateElement(Locator).getText();
	  }catch(Exception e) {
		  throw new ElementExceptions("fetchElementText(),is failed to perform action");
	  }
	  
	  
  } 
  public String fetchElementTag(By Locator) {
	  validation.validateLocatorInput("fetchElementTag()", Locator);
	  try {
		  return wait.locateElement(Locator).getTagName();
	  }catch(Exception e) {
		  throw new ElementExceptions("fetchElementTag(),is failed to perform action");
	  }
	  
	  
  } 
  public String fetchElementAttribute(By Locator,String attribute) {
	  validation.validateLocatorInput("fetchElementAttribute", Locator);
	  validation.validateStringInput("fetchElementAttribute", attribute);

	  try {
		  return wait.locateElement(Locator).getAttribute(attribute);
	  }catch(Exception e) {
		  throw new ElementExceptions("fetchElementLocation(),is failed to perform action");
	  }  
	  
  } 
  public Dimension fetchElementSize (By Locator) {
	  validation.validateLocatorInput("fetchElementSize()", Locator);
	  try {
		  return wait.locateElement(Locator).getSize();
	  }catch(Exception e) {
		  throw new ElementExceptions("fetchElementSize(),is failed to perform action");
	  }
	  
	  
  } 
  public Point fetchElementLocation(By Locator) {
	  validation.validateLocatorInput("fetchElementLocation()", Locator);
	  try {
		  return wait.locateElement(Locator).getLocation();
	  }catch(Exception e) {
		  throw new ElementExceptions("fetchElementLocation(),is failed to perform action");
	  }
	  
	  
  } 

   
   
   
   
}
