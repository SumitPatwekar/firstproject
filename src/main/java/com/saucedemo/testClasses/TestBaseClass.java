package com.saucedemo.testClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.pomClasses.POMHomePage;
import com.saucedemo.pomClasses.POMLoginPage;
import com.saucedemo.utilityPack.UtilityClass;

public class TestBaseClass {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("waits are applied");
		
		UtilityClass.Screenshot(driver,"LoginPage");
//		LoginActivity
		POMLoginPage lp = new POMLoginPage(driver);
		lp.enterusername();
		System.out.println("Username is entered");
		UtilityClass.Screenshot(driver,"username_entered");
		lp.enterpassword();
		System.out.println("Password is entered");
		UtilityClass.Screenshot(driver,"password_entered");
		lp.clickloginbutton();
		System.out.println("Login button is clicked");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		System.out.println("Browser is closed ");
	}
}
