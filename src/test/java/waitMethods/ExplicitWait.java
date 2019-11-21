package waitMethods;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class ExplicitWait extends TestBase{

	LocalTime time;

	@Test
	public void implicitWait() throws InterruptedException {
		String url="https://purpletrac.com/ui/login";
		getURL(url);	
		
		try {
			UnitedRegPage unitedRegPage=new UnitedRegPage();
			unitedRegPage.getBtnChange().click();		
			System.out.println("Before"+LocalTime.now());
			unitedRegPage.getEditFirstName2().sendKeys("Test Page objects");
			unitedRegPage.editFirstName2.clear();
		} catch (Exception e) {
			System.out.println("After"+LocalTime.now());
		}
	}
}