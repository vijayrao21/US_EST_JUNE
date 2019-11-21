package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebDriver_Firefox {

	public static void main(String[] args) {

		System.out.println("Launching Selenium WebDriver");
		
		WebDriverManager.firefoxdriver().setup();	
		WebDriver driver=new FirefoxDriver();	
		driver.get("http://www.seleniumhq.org");	
		

	}

}
