package com.saucedemo.pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomePage {

	WebDriver driver;
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	WebElement menubutton;
	
	public void clickmenubutton() {
		menubutton.click();
	}
	
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutbutton;
	
	public void clicklogoutbutton() {
		logoutbutton.click();
	}
	
	@FindBy (xpath="//a[@id='inventory_sidebar_link']")
	WebElement allitemsbutton  ;
	
	public void clickallitemsbutton() {
		allitemsbutton.click();
	}
	
	@FindBy (xpath="//a[@id='about_sidebar_link']")
	WebElement aboutbutton  ;
	
	public void clickaboutbutton() {
		aboutbutton.click();
	}
	
	@FindBy (xpath="//a[@id='reset_sidebar_link']")
	WebElement resetappstatebutton  ;
	
	public void clickresetappstatebutton() {
		resetappstatebutton.click();
	}
	
	@FindBy (xpath="//div[@id='shopping_cart_container']")
	WebElement cartcontainerlogo;
	
	public void clickcartcontainerlogo() {
		cartcontainerlogo.click();
	}
	
	@FindBy (xpath="//div[text()='Sauce Labs Backpack']")
	WebElement backpackproduct;
	
	public void clickbackpackproduct() {
		backpackproduct.click();
	}
	

	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocartbagpack;
	
	public void clickaddtocartbagpack() {
		addtocartbagpack.click();
	}
	
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	WebElement addtocartlink;
	
	public String getTextofaddtocart() {
		String actualCount = addtocartlink.getText();
		return actualCount;
	}
	
	
	@FindBy (xpath="//button[text()='Add to cart']")
	List<WebElement> allproductselect;
	
	public void clickallproduct() {
		for(WebElement a: allproductselect) 
		{
		allproductselect.get(0).click();
		}
	
	}
	
	public POMHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
}
