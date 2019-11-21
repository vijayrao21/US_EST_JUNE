package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebDriver_Chrome {

	public static void main(String[] args) {

		System.out.println("Launching Selenium WebDriver");

		//		String chromepath="C:\\Trainings\\US_EST_June\\lib\\chromedriver.exe";

		String chromepath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.out.println(chromepath);
		System.setProperty("webdriver.chrome.driver", chromepath);
		//Add chrome driver executable path to webdriver.chrome.driver
		WebDriver chrome=new ChromeDriver();		

	}
}
