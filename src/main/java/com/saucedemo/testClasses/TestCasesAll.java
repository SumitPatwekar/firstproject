package com.saucedemo.testClasses;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMHomePage;

public class TestCasesAll extends TestBaseClass {

	@Test(priority=0)
	public void TC01_VerifyLogin() {
		String expectedtitle ="Swag Labs";
		String resulttitle=driver.getTitle();
		
		  AssertJUnit.assertEquals(resulttitle,expectedtitle);
		
	}
	
	@Test(priority=-1)
	public void TC02_VerifyLogout() {
		POMHomePage hm = new POMHomePage(driver);
		hm.clickmenubutton();
		System.out.println("menu button is clicked");
		hm.clicklogoutbutton();
		System.out.println("log out button is clicked");
		
		String expectedtitle="Swag Labs";
		String resulttitle = driver.getTitle();
		
		AssertJUnit.assertEquals(resulttitle, expectedtitle);
	}
	@Test(priority=2)
	public void TC03_VerifyBagProductAddedtoCart() {
		POMHomePage hm = new POMHomePage(driver);
		hm.clickaddtocartbagpack();
		System.out.println("Back pack is added to cart");
		
		
		String expectedproductcount="1";
		String actualproductcount =  hm.getTextofaddtocart();
		System.out.println("result-->"+actualproductcount);
		AssertJUnit.assertEquals(actualproductcount, expectedproductcount);
		System.out.println("Validation applied");
	}
	@Test(priority=3)
	public void TC04_Verify_allTheProductAddedtoCart() {
		POMHomePage hm = new POMHomePage(driver);
		hm.clickallproduct();
		System.out.println("all products are added to the cart");
		
		String expectedcount ="6";
		String actualcount =hm.getTextofaddtocart();
		
		 AssertJUnit.assertEquals(actualcount, expectedcount);
		
	}
}
