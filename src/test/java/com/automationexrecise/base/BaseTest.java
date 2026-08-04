package com.automationexrecise.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automationexecrise.browser.BrowserInfoAction;
import com.automationexecrise.browser.NavigationUtility;
import com.automationexecrise.browsermanager.BrowserConfig;
import com.automationexecrise.genericutilities.ReadPropertyFile;
import com.automationexrecise.listeners.TestNgListenerClass;
import com.automationexrecise.pagelayers.WelcomePage;
import com.aventstack.chaintest.plugins.ChainTestListener;


@Listeners({TestNgListenerClass.class, ChainTestListener.class})
public class BaseTest {

	protected WelcomePage welcomePage;
	protected WebDriver driver;
	protected BrowserInfoAction browserInfoAction;
	protected NavigationUtility navigationUtility;
	//protected ReadPropertyFile readPropertyFile;
	private static final Logger logger=LogManager.getLogger(BaseTest.class);
	

	@Parameters({ "browserName", "headlessMode", "privateMode" })
	@BeforeClass
	public WelcomePage launchApplication(@Optional("EDGE")   String browserName,@Optional("false") String headlessMode,@Optional("true") String privateMode) {
		driver = BrowserConfig.initBrowser(browserName, Boolean.parseBoolean(headlessMode),Boolean.parseBoolean(privateMode));
  // readPropertyFile = new ReadPropertyFile();
		browserInfoAction = new BrowserInfoAction(driver);
		navigationUtility = new NavigationUtility(driver);
		System.out.println("Executed till here");
	//navigationUtility.open(readPropertyFile.readPropertyData("testUrl"));
		navigationUtility.open("https://automationexercise.com/");
	//Reporter.log("step no 2 the test url is entered\t" + readPropertyFile.readPropertyData("testUrl"), true);
		//ChainTestListener.log("step no 2 the test url is entered\t" + readPropertyFile.readPropertyData("testUrl"));
	//	logger.info("step no 2 the test url is entered\t" + readPropertyFile.readPropertyData("testUrl"));

		welcomePage = new WelcomePage(driver);
		return welcomePage;
	}

	@AfterClass(enabled = true)
	public void closeBrowser() {
		browserInfoAction.clsoeBrowser();
		Reporter.log("The browser is closed", true);
		ChainTestListener.log("The browser is closed");
		logger.info("The browser is closed");
	}

}
