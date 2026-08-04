package com.automationexecrise.genericutilities;

import java.io.FileInputStream;

import java.util.Properties;

import com.automationexrecise.constants.PathConstants;
import com.automationexrecise.exceptions.FrameworkExceptions;

public class ReadPropertyFile {
	private Properties properties;
	private FileInputStream fis;

	public ReadPropertyFile() {
		try {
			properties = new Properties();
			String path = PathConstants.propertyFilePath;
			fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			throw new FrameworkExceptions("Failed to initiate ReadPropertyFile");
		}
	}

	public String readPropertyData(String key) {
		return properties.getProperty(key);
	}
}
