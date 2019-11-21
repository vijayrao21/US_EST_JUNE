package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.UnitedRegPage;
import PageObjectModel.W3schoolsPage;
import testBase.TestBase;

public class W3schoolsDropdown extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException {
		String url="https://www.w3schools.com/";
		String LinkToSelect="Learn JavaScript";
		getURL(url);
		Thread.sleep(3000);
		W3schoolsPage w3schoolsPage=new W3schoolsPage();
		
		w3schoolsPage.getLnkTutorials().click();
		
		List<WebElement> listElementsTut=w3schoolsPage.getListOfLinksTut();
		
		for(int i=0;i<listElementsTut.size();i++) {
			String elementText=listElementsTut.get(i).getText();  //get text gets the text inside the element
			System.out.println(""+elementText);	
			if(elementText.equalsIgnoreCase(LinkToSelect)) {
				listElementsTut.get(i).click();
				break;
			}
		}		
		
		w3schoolsPage.getLnkReferences().click();
	List<WebElement> listElementsRef=w3schoolsPage.getListOfLinksRef();
	 LinkToSelect="HTML UTF-8";
		for(int i=0;i<listElementsRef.size();i++) {
			String elementText=listElementsRef.get(i).getText();  //get text gets the text inside the element
			System.out.println(""+elementText);	
			if(elementText.equalsIgnoreCase(LinkToSelect)) {
				listElementsRef.get(i).click();
				break;
			}
		}		
	}
}
