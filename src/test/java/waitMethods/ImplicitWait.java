package waitMethods;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class ImplicitWait extends TestBase{
	LocalTime time;

	@Test
	public void implicitWait() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);	
		Thread.sleep(3000); //pause for 3 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait
		//wait for specified time before throwing an exception
		
		try {
			UnitedRegPage unitedRegPage=new UnitedRegPage();
			unitedRegPage.getBtnChange().click();		
			System.out.println("Before"+LocalTime.now());
			unitedRegPage.getEditFirstName2().sendKeys("Test Page objects");
			System.out.println("After1: "+LocalTime.now());
			unitedRegPage.editFirstName2.clear();
			
		} catch (Exception e) {
			System.out.println("After2: "+LocalTime.now());
		}


	}
}
