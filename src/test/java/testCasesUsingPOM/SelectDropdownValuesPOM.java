package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class SelectDropdownValuesPOM extends TestBase{

	@Test
	public void testingPOMUnited() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		Thread.sleep(3000);
		UnitedRegPage unitedRegPage=new UnitedRegPage();
		unitedRegPage.getBtnChange().click();


		unitedRegPage.selectTitleByIndex(0);
		unitedRegPage.selectTitleByIndex(3);

		unitedRegPage.selectTitleByValue("MS");
		unitedRegPage.selectTitleByValue("DR");

		unitedRegPage.selectTitleByVisibleText("Dr.");
		unitedRegPage.selectTitleByVisibleText("Mr.");
		
		unitedRegPage.getAllTitleDropdownValues();

	}
}
