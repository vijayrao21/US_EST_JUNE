package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCaseGetURL extends TestBase{
	@Test
	public void readProperties() {
		log.info("URL value is :"+url);
	}
}
