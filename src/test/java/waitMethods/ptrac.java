package waitMethods;

import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import PageObjectModel.PtracPage;
import testBase.TestBase;
import utilities.Utilities;

public class ptrac extends TestBase{
	LocalTime time;	

	@Test
	public void implicitWait() throws InterruptedException, IOException {
		String url="https://purpletrac.com/ui/login";
		getURL(url);	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try {
			PtracPage ptracPage=new PtracPage();
			System.out.println("Before"+LocalTime.now());
//			wait.until(ExpectedConditions.visibilityOf(ptracPage.getEditUserName()));
			waitForElementVisibility(ptracPage.getEditUserName(), 5);
			Utilities.captureScreenshot("screen1",driver);
			ptracPage.getEditUserName().sendKeys("test123");
			Utilities.captureScreenshot("screen2",driver);
			System.out.println("After1"+LocalTime.now());
//			wait.until(ExpectedConditions.elementToBeClickable(ptracPage.getBtnLogin()));
			waitForElementClick(ptracPage.getBtnLogin(), 20);  //calling reusable method
		
			ptracPage.getBtnLogin().click();
			System.out.println("After2"+LocalTime.now());
			
		} catch (Exception e) {		
			Utilities.captureScreenshot(driver);
			System.out.println("Exception"+LocalTime.now());
		}
	}
	
	public void waitForElementVisibility(WebElement ele, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitForElementClick(WebElement ele, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}