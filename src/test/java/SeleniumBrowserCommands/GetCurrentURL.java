package SeleniumBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\US_EST_June\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize(); // open browser in maximized mode
		driver.get("http://www.games24x7.com/");  //open url
		String urlValue=driver.getCurrentUrl();  //to get current url value displayed
		System.out.println(urlValue);
	
	}
}
