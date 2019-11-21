package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebDriver_IE {
	
	@Test
	public void launchIE() {
		System.out.println("Launching Selenium WebDriver IE");

		WebDriverManager.iedriver().setup();	
		WebDriver driver=new InternetExplorerDriver();	
		driver.get("http://www.seleniumhq.org");	


	}

}
