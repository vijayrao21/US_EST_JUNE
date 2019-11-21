package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchWebDriver_Firefox {
	@Test
	public void launchChrome() {
		System.out.println("Launching Selenium WebDriver");
		System.out.println("Launching Selenium WebDriver IE");
		String iepath=System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iepath);
			//Add IE driver executable path to webdriver.chrome.driver
			WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.seleniumhq.org");
		

	}

}
