package testCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCase1 extends TestBase{

	@Test
	public void executeTest() {
		log.info("This us test case");
		log.error("error message");
		log.debug("Message");
	}
}
