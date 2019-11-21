package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebDriver_edge {

	public static void main(String[] args) {

		System.out.println("Launching Selenium WebDriver IE");

		WebDriverManager.edgedriver().setup();	
		WebDriver driver=new EdgeDriver();	
		driver.get("http://www.seleniumhq.org");	
		

	}

}
