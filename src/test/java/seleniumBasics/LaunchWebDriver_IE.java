package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchWebDriver_IE {

	public static void main(String[] args) {

		System.out.println("Launching Selenium WebDriver IE");
	String iepath=System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", iepath);
		//Add IE driver executable path to webdriver.chrome.driver
		WebDriver driver=new InternetExplorerDriver();
		

	}

}
