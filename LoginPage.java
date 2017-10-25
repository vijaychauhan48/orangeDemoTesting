/**
 * 
 */
package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.dataProvider.ExcelDataProvider;
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
		typeInto(txtUserName,xl.getData("Login", 1, 0));
		typeInto(txtPassword,xl.getData("Login", 1, 1));
		
		clickOn(btnLogin);
	}
	
	public String verifyPageTitle(){
		return getPageTitle();
	}
	

}
