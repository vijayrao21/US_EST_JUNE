package testNGDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void test1() {
		System.out.println("#Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("#Test2");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("#Before Suite Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("#After Suite Test");
	}
	
}
