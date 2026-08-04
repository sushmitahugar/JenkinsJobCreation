package com.automationexecrise.genericutilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
public static File getScreenshotAsFile(WebDriver driver) {
	TakesScreenshot ts= (TakesScreenshot)driver;
	return ts.getScreenshotAs(OutputType.FILE);
}

public static byte[] getScreenshotAsBytes(WebDriver driver) {
	TakesScreenshot ts= (TakesScreenshot)driver;
	return ts.getScreenshotAs(OutputType.BYTES);
}

}
