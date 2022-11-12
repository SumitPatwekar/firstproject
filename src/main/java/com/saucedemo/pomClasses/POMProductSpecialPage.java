package com.saucedemo.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMProductSpecialPage {

		WebDriver driver;
		
		@FindBy (xpath="//button[text()='Add to cart']")
		WebElement addtocartbutton;
		
		public void clickaddtocartbutton() {
			addtocartbutton.click();
		}
		
		
		public POMProductSpecialPage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
}
