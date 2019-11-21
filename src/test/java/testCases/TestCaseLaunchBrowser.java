package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCaseLaunchBrowser extends TestBase{

	@Test
	public void launchBrowser() {
		log.info("Browser Launched: "+browser);
		getURL();
		log.info(driver.getCurrentUrl());
		getURL("http://www.rediffmail.com");
		log.info(driver.getCurrentUrl());
	}
}
