package testNGDemo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFunctions2 {

	@Test(dependsOnMethods = "login")  //when login method fails, this method skips execution
	public void clickHomeButton() {
		System.out.println("Home button");
	}

	@Test()
	public void login() {
		System.out.println("Test Execution2");
		Assert.assertTrue(false);
	}	
}
