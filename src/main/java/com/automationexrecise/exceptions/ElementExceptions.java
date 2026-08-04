package com.automationexrecise.exceptions;

import org.openqa.selenium.WebDriver;

public class ElementExceptions extends RuntimeException {
	   public  ElementExceptions(String exceptionMsg) {
		   super(exceptionMsg);
	   }
}
