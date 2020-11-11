package com.deere.ics.Driver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.deere.ics.Utility.Constant;
import com.deere.ics.Utility.PropertfileReader;
import com.deere.ics.Utility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver1 {

	private static WebDriver driver;

	private Driver1() {

	}

	public static synchronized WebDriver getDriver() throws Exception {
		if (null == driver) {
			
			Properties properties = PropertfileReader.getproperties("\\src\\test\\resource\\RacfIDs.properties");
			String browser = properties.getProperty(Constant.BROWSER);
			String url = properties.getProperty(Constant.URL);
			
			
			switch (browser) {
			case Constant.CHROME:
				WebDriverManager.chromedriver().setup();
			//	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			//	WebDriverManager.chromedriver().version(Constant.CHROME_DRIVER_VERSION).setup();
				driver = new ChromeDriver();
				// System.out.println(WebDriverManager.chromedriver().getVersions());
				break;
			case Constant.IE:
				WebDriverManager.iedriver().setup();
				// WebDriverManager.iedriver().version(Constant.IE_DRIVER_VERSION).setup();
				driver = new InternetExplorerDriver();
				break;
			case Constant.FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				// WebDriverManager.firefoxdriver().version(Constant.FIREFOX_DRIVER_VERSION).setup();
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println(Constant.SUITABLE_DRIVER_NOT_FOUND);
				break;

			}
			if (driver != null) {
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
	
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			

		}

		return driver;

	}
	
	public void navigateBack(){
		driver.navigate().back();
	}

	//@AfterSuite
	//public void quitDriver() {
		//if (null != driver) {

			//driver.quit();
	//	}
	

}
