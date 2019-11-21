package SeleniumBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\US_EST_June\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();// open browser in full screen mode
		Thread.sleep(5000);
		driver.manage().window().maximize(); // open browser in full screen mode
		Thread.sleep(5000);
		driver.get("https://www.seleniumhq.org/");  //open url
		Thread.sleep(5000); //waiting for 1 second before executing next statement
		//		driver.close();  //close browser
	}
}
