package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class PtracPage extends TestBase{

	public PtracPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement editUserName;
	
	@FindBy(xpath="//span[contains(text(),'Login1')]")
	WebElement btnLogin;	

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getEditUserName() {
		return editUserName;
	}
}
