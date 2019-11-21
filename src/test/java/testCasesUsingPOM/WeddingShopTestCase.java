package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.FlipKartPage;
import PageObjectModel.UnitedRegPage;
import PageObjectModel.W3schoolsPage;
import PageObjectModel.WeddingShopPage;
import testBase.TestBase;

public class WeddingShopTestCase extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException {
		String url="https://www.weddingshop.com";
		getURL(url);

		WeddingShopPage weddingShopPage=new WeddingShopPage();
	
//		weddingShopPage.getLnkBrands().click();		

		Actions action=new Actions(driver);
		action.moveToElement(weddingShopPage.getLnkBrands()).perform(); //move to target element
		Thread.sleep(3000);
		List<WebElement> listElementsTut=weddingShopPage.getListOfBrands();
	
		for(int i=0;i<listElementsTut.size();i++) {
			String elementText=listElementsTut.get(i).getText();  //get text gets the text inside the element
			System.out.println(""+elementText);		
		}		
	}
}