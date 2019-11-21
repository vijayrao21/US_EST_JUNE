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

public class W3schoolsPage extends TestBase{

	public W3schoolsPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}

	@FindAll({@FindBy(xpath="//nav[@id='nav_tutorials']//div//div//a")})  //to store multiple elements
	List<WebElement> listOfLinksTut;	
	
	@FindAll({@FindBy(xpath="//nav[@id='nav_references']//div//div//a")})  //to store multiple elements
	List<WebElement> listOfLinksRef;	

	public List<WebElement> getListOfLinksRef() {
		return listOfLinksRef;
	}

	public WebElement getLnkReferences() {
		return lnkReferences;
	}

	public List<WebElement> getListOfLinksTut() {
		return listOfLinksTut;
	}

	public WebElement getLnkTutorials() {
		return lnkTutorials;
	}

	@FindBy(id="navbtn_tutorials")
	WebElement lnkTutorials;

	@FindBy(id="navbtn_references")
	WebElement lnkReferences;
}


