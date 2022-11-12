package com.saucedemo.testClasses;

import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMLoginPage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_LoginActivityValidation extends TestBaseClass{


	
	@Test
	public void TC01_LoginActivity()throws IOException {
		
		String expectedtitle ="Swag Labs";
		String resulttitle=driver.getTitle();
		
		  AssertJUnit.assertEquals(resulttitle,expectedtitle);
		
	}
}
