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

public class FlipKartPage extends TestBase{

	public FlipKartPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}

	@FindAll({@FindBy(xpath="//a[@title='Mobiles']/following::a[starts-with(@href,'/mobiles')]")})  //to store multiple elements
	List<WebElement> listOfLinksMobile;	
	
	@FindBy(xpath="//span[contains(.,'Electronics')]")
	WebElement lnkElectronics;

	public List<WebElement> getListOfLinksMobile() {
		return listOfLinksMobile;
	}

	public WebElement getLnkElectronics() {
		return lnkElectronics;
	}

}


