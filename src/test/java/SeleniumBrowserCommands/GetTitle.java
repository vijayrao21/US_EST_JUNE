package SeleniumBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\US_EST_June\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize(); // open browser in maximized mode
		driver.get("http://www.amazon.in/");  //open url
		String title=driver.getTitle();
		System.out.println("Tile is: "+title);
	}
}
