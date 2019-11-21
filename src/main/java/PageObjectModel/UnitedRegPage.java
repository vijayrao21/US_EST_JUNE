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

public class UnitedRegPage extends TestBase{

	public UnitedRegPage(){ //this constructor initialised all the locators in this page
		PageFactory.initElements(driver,this);
	}

	//	public WebElement editFirstName=driver.findElement(By.xpath("//*[@id='FirstName']"));

	@FindBy(xpath="//*[@id='FirstName']")
	public WebElement editFirstName2;

	@FindBy(xpath="//*[@id='simplemodal-data']/div[3]/div[2]/a")
	WebElement btnChange;

	@FindAll({@FindBy(xpath="//*[@id='simplemodal-data']/div[3]/div[2]/a")})  //to store multiple elements
	List<WebElement> listOfLinks;	

	//	@FindBy(xpath="//*[@id='simplemodal-data']/div[3]/div[2]/a")
	//	WebElement btnChange;

	@FindBy(id="Title") 
	WebElement dropDownTitle;	

	public List<WebElement> getListOfLinks() {
		return listOfLinks;
	}

	public WebElement getEditFirstName2() {
		return editFirstName2;
	}

	public WebElement getBtnChange() {
		return btnChange;
	}

	public void enterTextforFirstName(String text) {
		getEditFirstName2().clear();
		getEditFirstName2().sendKeys(text);
	}

	public void selectTitleByIndex(int i) throws InterruptedException {
		Select selectTitleDropDown=new Select(dropDownTitle);  
		selectTitleDropDown.selectByIndex(i);	
		System.out.println("Value selected in dropdown: "+selectTitleDropDown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
	}

	public void selectTitleByValue(String val) throws InterruptedException {
		Select selectTitleDropDown=new Select(dropDownTitle);  
		selectTitleDropDown.selectByValue(val);	
		System.out.println("Value selected in dropdown: "+selectTitleDropDown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
	}

	public void selectTitleByVisibleText(String visText) throws InterruptedException {
		Select selectTitleDropDown=new Select(dropDownTitle);  
		selectTitleDropDown.selectByVisibleText(visText);	
		System.out.println("Value selected in dropdown: "+selectTitleDropDown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
	}

	public void getAllTitleDropdownValues() throws InterruptedException {
		Select selectTitleDropDown=new Select(dropDownTitle);  
		List<WebElement> list=selectTitleDropDown.getOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println("Dropdown Value: "+list.get(i).getText());
		}	
	}













	@Test
	public void test123() throws InterruptedException {
		String url="https://www.united.com/ual/en/US/account/enroll/default";
		getURL(url);
		Thread.sleep(3000);
		WebElement change=driver.findElement(By.xpath("//*[@id='simplemodal-data']/div[3]/div[2]/a"));
		change.click();
		WebElement firstName=driver.findElement(By.xpath("//*[@id='FirstName']"));
		firstName.sendKeys("Testing Page object");
	}

}


