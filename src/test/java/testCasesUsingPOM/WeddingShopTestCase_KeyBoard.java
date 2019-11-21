package testCasesUsingPOM;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.FlipKartPage;
import PageObjectModel.UnitedRegPage;
import PageObjectModel.W3schoolsPage;
import PageObjectModel.WeddingShopPage;
import testBase.TestBase;

public class WeddingShopTestCase_KeyBoard extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		String url="https://www.weddingshop.com/register";
		getURL(url);

		WeddingShopPage weddingShopPage=new WeddingShopPage();
		WebElement titlefield=weddingShopPage.getTxtTitle();
		
		titlefield.sendKeys("text1");
		Actions action=new Actions(driver);
		action.moveToElement(titlefield).sendKeys("text2").build().perform();
		titlefield.sendKeys(Keys.TAB);

		Thread.sleep(3000);	
	}
}