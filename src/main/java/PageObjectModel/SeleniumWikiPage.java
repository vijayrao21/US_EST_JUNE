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

public class SeleniumWikiPage extends TestBase{

	public SeleniumWikiPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "org.openqa.selenium")
	WebElement lnk1;

	public WebElement getLnk1() {
		return lnk1;
	}
	
	@FindAll({@FindBy(tagName = "a")})  //to store multiple elements
	List<WebElement> listOfLinks;

	public List<WebElement> getListOfLinks() {
		return listOfLinks;
	}	
	
}


