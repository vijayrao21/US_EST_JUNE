package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testBase.TestBase;

public class Utilities {

	private static File src;

	public static void captureScreenshot(String string, WebDriver driver) throws IOException {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		//take screenshot is used to take screenshot oon a browser
		String dest=System.getProperty("user.dir")+"/screenshot/"+string+".png"; 
		//capturing screenshot with user defined name

		//creating destination path
		System.out.println("destination"+dest);

		FileUtils.copyFile(src, new File(dest) );
		//copying source to destination	 

	}

	public static String captureScreenshot(WebDriver driver) throws IOException {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		//take screenshot is used to take screenshot oon a browser

		String dest=System.getProperty("user.dir")+"/screenshot/"+getCurrentDateTime()+".png";
		//capturing screenshot with current date and time
		//creating destination path
		System.out.println("destination"+dest);

		FileUtils.copyFile(src, new File(dest) );
		//copying source to destination	 
		
		return dest;

	}

	public static String getCurrentDateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMM_HHmmss");
		return myDateObj.format(myFormatObj);
	}

}
