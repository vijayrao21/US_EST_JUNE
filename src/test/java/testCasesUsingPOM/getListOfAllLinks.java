package testCasesUsingPOM;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;
import utilities.Utilities;

public class getListOfAllLinks extends TestBase{

	@Test
	public void testingPOMUnited() throws InterruptedException, IOException {
		test=reports.createTest("Test1");

		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		Thread.sleep(3000);
		UnitedRegPage unitedRegPage=new UnitedRegPage();
		unitedRegPage.getBtnChange().click();

		List<WebElement> listOfLinks=driver.findElements(By.xpath("//a"));  //storing multiple locators
		log.info("Size of links: "+listOfLinks.size());
		test.info("Size of links: "+listOfLinks.size());
		test.pass("Screenshot").addScreenCaptureFromPath(Utilities.captureScreenshot(driver));
		test.fail("Screenshot", 
				MediaEntityBuilder.createScreenCaptureFromPath(Utilities.captureScreenshot(driver)).build());
		
		for(int i=0; i<listOfLinks.size();i++) {
			log.info(listOfLinks.get(i).getText());  //get the text in the element
			test.pass(listOfLinks.get(i).getText());
		}		
	}

	@Test
	public void testingExtentReport() throws InterruptedException {
		test=reports.createTest("Test2");
		test.fail("Test is failed");
	}
}