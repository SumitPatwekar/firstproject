package com.saucedemo.testClasses;

import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMHomePage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_AllProducts_addtoCart extends TestBaseClass {

	@Test
	public void TC04_Allproducts_AddtoCart() throws IOException{
		POMHomePage hm = new POMHomePage(driver);
		hm.clickallproduct();
		System.out.println("all products are added to the cart");
		
		String expectedcount ="6";
		String actualcount =hm.getTextofaddtocart();
		
		 AssertJUnit.assertEquals(actualcount, expectedcount);
		
	}
}
