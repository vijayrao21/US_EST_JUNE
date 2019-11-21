package SeleniumBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
	
	public static void main(String[] args) throws InterruptedException {
		String title;
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\US_EST_June\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize(); // open browser in maximized mode
		driver.get("http://www.amazon.in/");  //open url
		title=driver.getTitle();
		System.out.println("Tile is: "+title);
		driver.navigate().refresh();
		title=driver.getTitle();
		System.out.println("Tile is: "+title);
	}
}
