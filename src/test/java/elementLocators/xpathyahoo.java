package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class xpathyahoo extends TestBase{

	@Test
	public void identifyelementUsingID() throws InterruptedException {
		
		String url="https://login.yahoo.com/account/create";
		getURL(url);
		
		WebElement txtTitle=driver.findElement(By.id("usernamereg-firstName"));		
		txtTitle.sendKeys("Title value");  //enteres value in text field
		Thread.sleep(2000);
		txtTitle.clear();  //erases the text in the field
		Thread.sleep(3000);
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Title value new");
		
	}
	
	
}
