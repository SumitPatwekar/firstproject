package com.saucedemo.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage {

	WebDriver driver;
	
	@FindBy (xpath="//input[@id='user-name']")
	WebElement username;
	
	public void enterusername() {
		username.sendKeys("standard_user");
	}
	
	@FindBy (xpath="//input[@id='password']")
	WebElement password;
	
	public void enterpassword() {
		password.sendKeys("secret_sauce");
	}
	
	@FindBy (xpath="//input[@id='login-button']")
	WebElement loginbutton;
	
	public void clickloginbutton() {
		loginbutton.click();
	}
	
	
	public POMLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
