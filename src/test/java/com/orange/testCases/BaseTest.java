/**
 * 
 */
package com.orange.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.easyFrame.dataProvider.ConfigDataProvider;
import com.easyFrame.factory.BrowserFactory;

/**
 * @author cyrus
 *
 */
public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
	
		driver=BrowserFactory.getBrowser("chrome");
		driver.get(ConfigDataProvider.getAppUrl());
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		driver.quit();
	}
	
}
