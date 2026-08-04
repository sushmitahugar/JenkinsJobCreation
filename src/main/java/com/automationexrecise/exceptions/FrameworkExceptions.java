package com.automationexrecise.exceptions;

import org.openqa.selenium.By;

public class FrameworkExceptions extends RuntimeException {
	      public FrameworkExceptions(String exceptionMsg) {
	    	  super(exceptionMsg);
	      }

	      
		  public FrameworkExceptions(int exceptionMsg) {

			// TODO Auto-generated constructor stub
		  }


		  public FrameworkExceptions(By exceptionMsg) {
			// TODO Auto-generated constructor stub
		  }

}
