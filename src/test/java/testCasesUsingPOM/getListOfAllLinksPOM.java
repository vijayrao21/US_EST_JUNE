package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class getListOfAllLinksPOM extends TestBase{

	@Test
	public void testingPOMUnited() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		Thread.sleep(3000);
		UnitedRegPage unitedRegPage=new UnitedRegPage();
		unitedRegPage.getBtnChange().click();

		List<WebElement> list=unitedRegPage.getListOfLinks();
		log.info("Size of links: "+list.size());

		for(int i=0; i<list.size();i++) {
			log.info(list.get(i).getText());  //get the text in the element
		}		
	}
}