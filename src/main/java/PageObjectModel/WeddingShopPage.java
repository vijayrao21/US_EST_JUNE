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

public class WeddingShopPage extends TestBase{

	public WeddingShopPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}

	public List<WebElement> getListOfBrands() {
		return listOfBrands;
	}

	public WebElement getLnkBrands() {
		return lnkBrands;
	}

	@FindAll({@FindBy(xpath="//ul[@aria-labelledby='main-dropdown-menu-brand-id']//li//ul//div//li//a")})  //to store multiple elements
	List<WebElement> listOfBrands;	

	@FindBy(xpath="//a[@id='main-dropdown-menu-brand-id']//span[contains(text(),'Brands')]")
	WebElement lnkBrands;
	
	@FindBy(xpath="//*[@id='root']/div[3]/div/div[3]/div[1]/h4/b[2]")
	WebElement lblUnlimited;

	@FindBy(id="title")
	WebElement txtTitle;
	
	public WebElement getTxtTitle() {
		return txtTitle;
	}

	public WebElement getLblUnlimited() {
		return lblUnlimited;
	}
	
	


}


