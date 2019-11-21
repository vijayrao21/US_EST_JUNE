package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.FlipKartPage;
import PageObjectModel.UnitedRegPage;
import PageObjectModel.W3schoolsPage;
import testBase.TestBase;

public class FlipkartTestCase extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException {
		String url="https://www.flipkart.com/";
		getURL(url);
		Thread.sleep(3000);
		FlipKartPage flipKartPage=new FlipKartPage();
	
		flipKartPage.getLnkElectronics().click();
		

		List<WebElement> listElementsTut=flipKartPage.getListOfLinksMobile();

		for(int i=0;i<listElementsTut.size();i++) {
			String elementText=listElementsTut.get(i).getText();  //get text gets the text inside the element
			System.out.println(""+elementText);		
		}		
	}
}