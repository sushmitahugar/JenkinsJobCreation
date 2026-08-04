package com.automationexrecise.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int start=1;
	int end=3;
	public boolean retry(ITestResult result) {
			if(!result.isSuccess()) {
				//retry logic
				if(start<=end) {
					start++;
					result.setStatus(result.FAILURE);
					return true;
				}else {
					result.setStatus(result.FAILURE);
				}
			}
			else {
				result.setStatus(result.SUCCESS);
			}
			return false;//status is pass
			}
		}
	
	


