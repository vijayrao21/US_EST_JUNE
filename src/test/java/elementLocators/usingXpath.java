package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class usingXpath extends TestBase{

	@Test
	public void identifyelementUsingID() throws InterruptedException {
		
		String url="https://www.weddingshop.com/register";
		getURL(url);		
		WebElement txtTitle=driver.findElement(By.xpath("//input[@id='title']"));		
		txtTitle.sendKeys("Title value");  //enteres value in text field
		Thread.sleep(2000);	
		txtTitle.clear();
		txtTitle=driver.findElement(By.xpath("//input[@placeholder='Title *']"));
		txtTitle.sendKeys("Title value updated");
	}
	
	
}
