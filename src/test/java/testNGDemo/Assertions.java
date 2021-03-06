package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	@Test
	public void CheckTitle() {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.seleniumhq.org");
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "selenium - Web Browser Automation", "Expected and actual titles does not match");
//		Assert.assertEquals(actual, expected, message);
		System.out.println("Assertion passed");
		Assert.assertTrue(title.equalsIgnoreCase("selenium - Web Browser Automation"),"Title mismatch");
		
		if(title.equals("selenium")) {
			System.out.println("Title matches with expected");
		}else {
			System.out.println("Title does not match with expected");
		}
	}
}
