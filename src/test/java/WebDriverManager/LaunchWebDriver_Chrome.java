package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebDriver_Chrome {

	@Test
	public void launchChrome() {

		System.out.println("Launching Selenium WebDriver");

		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.seleniumhq.org");	

	}
}
