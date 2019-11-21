package testBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class commonObjects {
	public Logger log;
	public Properties prop;
	public FileInputStream configFileInputStream;
	protected String url;
	public static WebDriver driver;
	public String browser;
	
}
