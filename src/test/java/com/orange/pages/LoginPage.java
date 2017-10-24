/**
 * 
 */
package com.orange.pages;

import org.openqa.selenium.WebElement;

import com.easyFrame.dataProvider.ExcelDataProvider;

import org.openqa.selenium.support.FindBy;
/**
 * @author cyrus
 *
 */
public class LoginPage extends BaseClass{
	
	
	@FindBy(id="txtUsername")
	WebElement txtUserName;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	public void enterUsername(String username){
		typeInto(txtUserName, username);
	}
	
	public void enterPassword(String password){
		typeInto(txtPassword, password);
	}
	public void LoginToOrange(){
		
		//typeInto(txtUserName, "Admin");
		//typeInto(txtPassword, "admin");
		ExcelDataProvider xl=new ExcelDataProvider();
		typeInto(txtUserName,xl.getData("Login", 2, 1));
		typeInto(txtPassword,xl.getData("Login", 2, 2));
		
		clickOn(btnLogin);
	}
	
	public String verifyPageTitle(){
		return getPageTitle();
	}
	

}
