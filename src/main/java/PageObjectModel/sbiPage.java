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

public class sbiPage extends TestBase{

	public sbiPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(xpath=".//*[@id='banking']/div[1]/div/div/a[2]/img")
	WebElement linkSBI;
	
	@FindBy(xpath=".//*[@id='custom_carousel']/div[1]/div[6]/div/span[2]")
	WebElement linkLogin;
	

	public WebElement getLinkLogin() {
		return linkLogin;
	}


	public WebElement getLinkSBI() {
		return linkSBI;
	}

}


