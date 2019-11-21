package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class SelectDropdownValues extends TestBase{

	@Test
	public void testingPOMUnited() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		Thread.sleep(3000);
		UnitedRegPage unitedRegPage=new UnitedRegPage();
		unitedRegPage.getBtnChange().click();

		WebElement selectTitleDropDownLoc=driver.findElement(By.id("Title")); //dropdown locator
		Select selectTitleDropDown=new Select(selectTitleDropDownLoc);  
		
//		selectTitleDropDown.selectByIndex(0);  //selecting by index
//		Thread.sleep(2000);
//		selectTitleDropDown.selectByIndex(1);
//		Thread.sleep(2000);
//		selectTitleDropDown.selectByIndex(5);
//		Thread.sleep(2000);
		
//		selectTitleDropDown.selectByValue("MS");  //selecting by index
//		Thread.sleep(2000);
//		selectTitleDropDown.selectByValue("DR");
		
		log.info("Value selected: "+selectTitleDropDown.getFirstSelectedOption().getText());  //to get the value selected in the dropdown
		selectTitleDropDown.selectByVisibleText("Dr.");
		log.info("Value selected: "+selectTitleDropDown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		selectTitleDropDown.selectByVisibleText("Mr.");
		log.info("Value selected: "+selectTitleDropDown.getFirstSelectedOption().getText());

	}
}
