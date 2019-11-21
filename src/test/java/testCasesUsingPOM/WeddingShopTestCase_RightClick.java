package testCasesUsingPOM;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
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

public class WeddingShopTestCase_RightClick extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException, AWTException {
		String url="https://www.weddingshop.com";
		getURL(url);

		WeddingShopPage weddingShopPage=new WeddingShopPage();

		Actions action=new Actions(driver);
		action.doubleClick(weddingShopPage.getLblUnlimited()).perform(); //move to target element
		Thread.sleep(2000);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

		String copiedText1=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(copiedText1);	
	}
}