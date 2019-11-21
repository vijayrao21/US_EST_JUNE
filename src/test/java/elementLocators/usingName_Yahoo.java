package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class usingName_Yahoo extends TestBase{

	@Test
	public void identifyelementUsingID() throws InterruptedException {
		
		String url="https://login.yahoo.com/account/create";
		getURL(url);
		
		WebElement txtTitle=driver.findElement(By.name("firstName"));		
		txtTitle.sendKeys("Title value");  //enteres value in text field
	
		WebElement btnSubmit=driver.findElement(By.id("reg-submit-button"));		
		btnSubmit.click();  //click is used to click on an element
		
	}	
}
