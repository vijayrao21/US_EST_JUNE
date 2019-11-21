package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class usingID extends TestBase{

	@Test
	public void identifyelementUsingID() throws InterruptedException {
		
		String url="https://www.weddingshop.com/register";
		getURL(url);
		
		WebElement txtTitle=driver.findElement(By.id("title"));		
		txtTitle.sendKeys("Title value");  //enteres value in text field
		Thread.sleep(2000);
		txtTitle.clear();  //reases the text in the field
		Thread.sleep(3000);
		
		driver.findElement(By.id("title")).sendKeys("Title value new");
		
	}
	
	
}
