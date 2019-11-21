package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {


	@Test
	@Parameters({"userID1","password","browser"})
	public void loginTest(String userID2, String password2, String browser) {
//		System.out.println("Browser#"+browser2);
		System.out.println("userID#"+userID2);
		System.out.println("password#"+password2);
	}	
}
