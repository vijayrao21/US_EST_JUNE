package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testBase.TestBase;

public class RediffPage extends TestBase{

	public RediffPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement btnGo;

	public WebElement getBtnGo() {
		return btnGo;
	}
	
	public boolean isAlertPresent() {		
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
		return false;
		}		
	}
}


