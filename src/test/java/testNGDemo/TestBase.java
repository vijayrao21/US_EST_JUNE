package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("#Before Suite Test");
		//Initialise report, initialise logs, Read test data, open browser
	}		
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("#After Suite Test");
		// close report, close database connections, close excel sheets, close browser
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("#Before class");
		//launching browser, login application
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("#After class");
		//close browser, logout
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("#Before Method");
		//capture the test name
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("#After Method");
		//capture the test result
	}
}
