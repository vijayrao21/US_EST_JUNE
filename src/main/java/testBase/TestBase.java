package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utilities.projectUtils;

public class TestBase extends projectUtils{
	protected ExtentReports reports;
	protected ExtentTest test;
	ExtentHtmlReporter htmlReporter;

	@BeforeSuite
	public void configurations() throws IOException{
		initialiseLog4j();
		readPropertiesFile();
		extentReportsSetup();
	}

	@AfterSuite
	public void closeReport() {
		reports.flush();
	}

	private void extentReportsSetup() {
		reports=new ExtentReports();
		String reportName=System.getProperty("user.dir")+"/Reports/ExtentReport.html";
		htmlReporter=new ExtentHtmlReporter(new File(reportName));	
		htmlReporter.loadXMLConfig(String.valueOf(new File(System.getProperty("user.dir")+"/src/main/resources/ReportConfig.xml")));
		reports.setSystemInfo("Executed By", "Soumi");
		reports.setSystemInfo("Authored By", "Bhaskar");
		reports.setSystemInfo("Environment", "Stage");
		reports.attachReporter(htmlReporter);
	}

	@BeforeClass
	public void testCaseConfig() {
		launchBrowser();
	}

	//	@AfterClass
	public void closeBrowserConfig() {
		closeBrowser();
	}

	private void closeBrowser() {
		log.info("Browser Closed");
		driver.quit();
	}

	@AfterMethod
	public void screenCapture() throws IOException {
		captureScreenshot(driver);
	}

	private void launchBrowser() {
		browser=prop.getProperty("browser");
		switch(browser) {
		case "chrome":
			String chromepath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			//			WebDriverManager.chromedriver().setup();	
			driver=new ChromeDriver();	
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait
			break;
		case "ie":
			String iepath=System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iepath);		
			driver=new InternetExplorerDriver();
			break;
		case "firefox":
			String firefoxpath=System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";			
			System.setProperty("webdriver.gecko.driver", firefoxpath);
			driver=new FirefoxDriver();			
			break;
		}
		driver.manage().window().maximize();
	}

	private void readPropertiesFile() throws IOException {
		prop=new Properties();
		configFileInputStream=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		prop.load(configFileInputStream);	//to load properties
	}

	protected void getURL() {
		String env=prop.getProperty("environment");
		switch(env) {
		case "test":
			url=prop.getProperty("testurl");
			break;
		case "stage":
			url=prop.getProperty("stageurl");
			break;
		}
		driver.get(url);
	}

	protected void getURL(String urlValue) {
		driver.get(urlValue);
	}

	private void initialiseLog4j() {
		String log4jPath=System.getProperty("user.dir")+"/src/main/resources/log4j2.properties";
		PropertyConfigurator.configure(log4jPath);
		log=Logger.getLogger("");
		log.info("This  is logs generation");
	}
}
