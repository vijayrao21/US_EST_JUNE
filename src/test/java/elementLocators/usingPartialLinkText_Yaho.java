package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class usingPartialLinkText_Yaho extends TestBase{

	@Test
	public void identifyelementUsingID() throws InterruptedException {
		
		String url="https://login.yahoo.com/account/create";
		getURL(url);
	
		WebElement lnkPrivacy=driver.findElement(By.partialLinkText("Privacy"));		
		lnkPrivacy.click();	
		
	}	
}
