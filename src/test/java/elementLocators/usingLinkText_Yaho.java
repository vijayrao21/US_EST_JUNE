package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class usingLinkText_Yaho extends TestBase{

	@Test
	public void identifyelementUsingID() throws InterruptedException {
		
		String url="https://login.yahoo.com/account/create";
		getURL(url);
		
		WebElement lnkTerms=driver.findElement(By.linkText("Terms"));		
		lnkTerms.click();
	
		
	}	
}
