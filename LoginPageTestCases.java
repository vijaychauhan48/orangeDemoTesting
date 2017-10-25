/**
 * 
 */
package com.orange.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.orange.pages.LoginPage;

/**
 * @author cyrus
 *
 */
public class LoginPageTestCases extends BaseTest{
	
		
	static Logger log=Logger.getLogger(LoginPageTestCases.class);
	
	@Test
	public void Login(){
		
		log.info("Setting up browser");
		LoginPage loginPg=PageFactory.initElements(driver, LoginPage.class);
		
		log.info("Login to application user admin credentials");
		loginPg.LoginToOrange();
		
		log.info("Login Successfull.");
		
	}
	
	/*@Test
	public void verifyTitle(){
		
		log.info("Verifying the page title");
		
		LoginPage loginPg=new LoginPage();

		String actualTitle=loginPg.verifyPageTitle();
		System.out.println(actualTitle);
	}*/

}
