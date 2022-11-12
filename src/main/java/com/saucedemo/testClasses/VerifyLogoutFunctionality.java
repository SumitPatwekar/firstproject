package com.saucedemo.testClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMHomePage;
import com.saucedemo.pomClasses.POMLoginPage;

public class VerifyLogoutFunctionality {

	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("waits are applied");
		
		POMLoginPage lp = new POMLoginPage(driver);
		lp.enterusername();
		System.out.println("Username is entered");
		lp.enterpassword();
		System.out.println("Password is entered");
		lp.clickloginbutton();
		System.out.println("Login button is clicked");
		
		POMHomePage hm = new POMHomePage(driver);
		hm.clickmenubutton();
		System.out.println("menu button is clicked");
		hm.clicklogoutbutton();
		System.out.println("log out button is clicked");
	}
	
	@Test
	
	public void VerifyLogOutFunc() {
		String expectedtitle="Swag Labs";
		String resulttitle = driver.getTitle();
		
		Assert.assertEquals(resulttitle, expectedtitle);
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
		System.out.println("Browser is closed");
	}
}
