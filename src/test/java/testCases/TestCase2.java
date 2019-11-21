package testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCase2 {
Logger log;
	
	@Test
	public void executeTest() {
		String log4jPath=System.getProperty("user.dir")+"/src/main/resources/log4j2.properties";
		PropertyConfigurator.configure(log4jPath);
		log=Logger.getLogger("");
		log.info("This  is logs generation");
	}
}
