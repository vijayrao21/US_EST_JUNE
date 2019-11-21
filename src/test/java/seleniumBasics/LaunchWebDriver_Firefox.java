package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchWebDriver_Firefox {

	public static void main(String[] args) {

		System.out.println("Launching Selenium WebDriver");
		String firefoxpath=System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", firefoxpath);
		//Add firefox driver executable path to webdriver.chrome.driver
		WebDriver driver=new FirefoxDriver();
		

	}

}
