package com.saucedemo.testClasses;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMHomePage;
import com.saucedemo.pomClasses.POMLoginPage;
import com.saucedemo.pomClasses.POMProductSpecialPage;

public class VerifyBackpackProductAddtocart {

	WebDriver driver;
	
	
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		System.out.println("waits are applied");
		
	
		POMLoginPage lp = new POMLoginPage(driver);
		lp.enterusername();
		System.out.println("Username is entered");
		lp.enterpassword();
		System.out.println("Password is entered");
		lp.clickloginbutton();
		System.out.println("Login button is clicked");
		
		POMHomePage hm = new POMHomePage(driver);
		hm.clickaddtocartbagpack();
		System.out.println("Back pack is added to cart");
		
	}
	@Test
	
	public void VerifyBackPackProdcutAddtocart() {
		POMHomePage hm = new POMHomePage(driver);
		
		String expectedproductcount="1";
		String actualproductcount =  hm.getTextofaddtocart();
		System.out.println("result-->"+actualproductcount);
		Assert.assertEquals(actualproductcount, expectedproductcount);
		System.out.println("Validation applied");
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Browser is closed");
	}
}
