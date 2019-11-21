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

public class WeddingShopTestCase_RobotClass extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		String url="https://www.weddingshop.com";
		getURL(url);

		WeddingShopPage weddingShopPage=new WeddingShopPage();

		Actions action=new Actions(driver);
		action.doubleClick(weddingShopPage.getLblUnlimited()).perform(); //move to target element
		Thread.sleep(2000);
		action.sendKeys(Keys.chord(Keys.CONTROL, "c")).build().perform();
		String copiedText=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(copiedText);
		
		action.contextClick(weddingShopPage.getLblUnlimited()).perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(3000);	
	}
}