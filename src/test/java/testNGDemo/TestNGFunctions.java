package testNGDemo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFunctions {

	@Test(enabled = true, description = "The intent of this test is to print text 1") //to enable test
	public void testNGFun1() {
		System.out.println("Test Execution1");
	}

	@Test(enabled = true, description = "The intent of this test is to print text 2")
	public void testNGFun2() {
		System.out.println("Test Execution2");
		Assert.assertTrue(false);
	}	
}
