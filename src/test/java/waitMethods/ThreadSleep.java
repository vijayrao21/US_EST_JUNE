package waitMethods;

import java.time.LocalTime;

import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class ThreadSleep extends TestBase{
	LocalTime time;
	
	@Test
	public void testingPOMUnited() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		time=LocalTime.now();
		System.out.println("Before"+time);
		Thread.sleep(3000); //pause for 3 seconds
		time=LocalTime.now();
		System.out.println("After"+time);
		UnitedRegPage unitedRegPage=new UnitedRegPage();

		unitedRegPage.getBtnChange().click();
		unitedRegPage.getEditFirstName2().sendKeys("Test Page objects");
	}
}
