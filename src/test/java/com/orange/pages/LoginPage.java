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
		
	/*	typeInto(txtUserName, username);
		typeInto(txtPassword, password);*/
		typeInto(txtUserName,ExcelDataProvider.getData("Login", 2, 1));
		typeInto(txtPassword,ExcelDataProvider.getData("Login", 2, 2));
		clickOn(btnLogin);
	}
	
	public String verifyPageTitle(){
		return getPageTitle();
	}
	

}
