/**
 * 
 */
package com.orange.pages;

import org.openqa.selenium.WebDriver;

import com.easyFrame.driver.PageObject;

/**
 * @author cyrus
 *
 */
public class BaseClass extends PageObject{
	
	public static String pageTitle(){
		
		return getPageTitle();
	}

}
