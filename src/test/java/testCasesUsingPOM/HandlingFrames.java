package testCasesUsingPOM;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import PageObjectModel.FlipKartPage;
import PageObjectModel.RediffPage;
import PageObjectModel.SeleniumWikiPage;
import PageObjectModel.UnitedRegPage;
import PageObjectModel.W3schoolsPage;
import testBase.TestBase;

public class HandlingFrames extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException {
		String url="https://seleniumhq.github.io/selenium/docs/api/java/index.html";
		getURL(url);
		Thread.sleep(3000);

		SeleniumWikiPage seleniumWikiPage=new SeleniumWikiPage();

		driver.switchTo().frame("packageListFrame");
		System.out.println("$$$$$$$$$Switching to Frame&&&&&&&&&&&&&&&&&");
		List<WebElement> listOfLinks=seleniumWikiPage.getListOfLinks();
		System.out.println("List Size: "+listOfLinks.size());
		for(int i=0;i<listOfLinks.size();i++) {
			System.out.println(listOfLinks.get(i).getText());
		}

		driver.switchTo().defaultContent();
		WebElement ele=driver.findElement(By.xpath("//*[@name='packageFrame']"));
		driver.switchTo().frame(ele);
		System.out.println("$$$$$$$$$Switching to Frame&&&&&&&&&&&&&&&&&");
		List<WebElement> listOfLinks2=seleniumWikiPage.getListOfLinks();
		System.out.println("List Size: "+listOfLinks2.size());
//		for(int i=0;i<listOfLinks2.size();i++) {
//			System.out.println(listOfLinks.get(i).getText());
//		}
		
		driver.switchTo().defaultContent();  //switch to  default page
		driver.switchTo().frame("classFrame");
		System.out.println("$$$$$$$$$Switching to Frame&&&&&&&&&&&&&&&&&");
		List<WebElement> listOfLinks3=seleniumWikiPage.getListOfLinks();
		System.out.println("List Size: "+listOfLinks3.size());
		for(int i=0;i<listOfLinks3.size();i++) {
			System.out.println(listOfLinks.get(i).getText());
		}
	}	
}