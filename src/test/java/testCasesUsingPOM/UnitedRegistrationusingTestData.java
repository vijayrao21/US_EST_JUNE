package testCasesUsingPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import testBase.TestBase;

public class UnitedRegistrationusingTestData extends TestBase{

	@Test
	public void testingPOMUnited() throws InterruptedException, EncryptedDocumentException, IOException {
		String testDataPath=System.getProperty("user.dir")+"/TestData/testdata.xlsx";
		String sheetName="tc01";
		Object[][] data=readExcelData(testDataPath, sheetName);
		
			String url="https://www.united.com/ual/en/US/account/enroll/default";
			getURL(url);
			Thread.sleep(3000);
			UnitedRegPage unitedRegPage=new UnitedRegPage();

			//		unitedRegPage.btnChange.click();
			//		unitedRegPage.editFirstName2.sendKeys("Test Page objects");

			unitedRegPage.getBtnChange().click();
			Thread.sleep(3000);
			
			for(int i=0;i<data.length;i++) {
			unitedRegPage.enterTextforFirstName((String)data[i][1]);
		}

	}
}
