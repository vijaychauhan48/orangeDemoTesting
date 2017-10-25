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

import com.easyFrame.factory.BrowserFactory;
import com.orange.dataProvider.ConfigDataProvider;

/**
 * @author cyrus
 *
 */
public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
	
		BrowserFactory bf=new BrowserFactory();
		
		ConfigDataProvider cp=new ConfigDataProvider();
		
		driver=bf.getBrowser(cp.selectBrowser());
		
		driver.get(cp.getAppUrl());
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		driver.quit();
	}
	
}
