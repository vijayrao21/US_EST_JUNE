package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.FlipKartPage;
import PageObjectModel.RediffPage;
import PageObjectModel.UnitedRegPage;
import PageObjectModel.W3schoolsPage;
import testBase.TestBase;

public class HandlingPopUpMessages extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException {
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		getURL(url);
		Thread.sleep(3000);
		
		RediffPage rediffPage=new RediffPage();
		
		rediffPage.getBtnGo().click();
		System.out.println("Is Alert Present: "+rediffPage.isAlertPresent()); //check if alert message is present
		Alert alert = driver.switchTo().alert();  //switching to alert message
		alert.accept();  //closing alert message
		System.out.println("Is Alert Present: "+rediffPage.isAlertPresent());
		
		rediffPage.getBtnGo().click();
		System.out.println("Is Alert Present: "+rediffPage.isAlertPresent()); //check if alert message is present
		alert = driver.switchTo().alert();  //switching to alert message
		System.out.println("Alert Text: "+alert.getText());
		alert.dismiss();  //closing alert message
		System.out.println("Is Alert Present:  "+rediffPage.isAlertPresent());
		
	}
	
	
}