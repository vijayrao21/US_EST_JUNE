package testCasesUsingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class UnitedRegistration2 extends TestBase{

	@Test
	public void testingPOMUnited() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		Thread.sleep(3000);
		UnitedRegPage unitedRegPage=new UnitedRegPage();
		
		unitedRegPage.getBtnChange().click();
		unitedRegPage.getEditFirstName2().sendKeys("Test Page objects");
		Thread.sleep(3000);
		unitedRegPage.editFirstName2.sendKeys("Updated");
	

	}
}
