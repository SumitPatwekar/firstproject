package com.saucedemo.testClasses;

import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMHomePage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_LogOutActivity extends TestBaseClass{

	
	
	@Test
	public void TC02_LogOut()throws IOException {
		
//		LogoutActivity
		POMHomePage hm = new POMHomePage(driver);
		hm.clickmenubutton();
		System.out.println("menu button is clicked");
		hm.clicklogoutbutton();
		System.out.println("log out button is clicked");
		
		String expectedtitle="Swag Labs";
		String resulttitle = driver.getTitle();
		
		AssertJUnit.assertEquals(resulttitle, expectedtitle);
	}
}
