package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCaseToGetProperties extends TestBase{

	@Test
	public void readProperties() {
		String env=prop.getProperty("environment");  //to get property value using proeprty name
		log.info("Environment Value: "+env);
		String url=prop.getProperty("stageurl");
		log.info("URL Value: "+url);
	}
}
