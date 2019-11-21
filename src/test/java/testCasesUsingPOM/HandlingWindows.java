package testCasesUsingPOM;

import java.util.Set;
import org.testng.annotations.Test;
import PageObjectModel.sbiPage;
import testBase.TestBase;

public class HandlingWindows extends TestBase{

	@Test
	public void w3SchoolsDropdown() throws InterruptedException {
		String url="https://www.onlinesbi.com/";
		getURL(url);

		sbiPage sbipage=new sbiPage();
		sbipage.getLinkSBI().click();

		String mainWindow=driver.getWindowHandle();  //returns main window
		System.out.println("Main Windows "+mainWindow);

		Set<String> allWindows = driver.getWindowHandles();  //return all windows
		System.out.println("All Windows "+allWindows);

		for(String handle: allWindows) {
			if(handle.equals(mainWindow)) {
				System.out.println("This is main window");
			}else {			
				driver.switchTo().window(handle);  //switching to child window
				break;
			}
			Thread.sleep(5000);
			sbipage.getLinkLogin().click();
		}
		driver.switchTo().window(mainWindow); //switching to main window
	}
}