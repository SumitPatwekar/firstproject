package com.saucedemo.testClasses;

import org.testng.annotations.Test;

import com.saucedemo.pomClasses.POMHomePage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_BagProductAddtocart extends TestBaseClass{

	@Test
	public void TC03_AddtoCart_bagPack() throws IOException{

		POMHomePage hm = new POMHomePage(driver);
		hm.clickaddtocartbagpack();
		System.out.println("Back pack is added to cart");
		
		
		String expectedproductcount="1";
		String actualproductcount =  hm.getTextofaddtocart();
		System.out.println("result-->"+actualproductcount);
		AssertJUnit.assertEquals(actualproductcount, expectedproductcount);
		System.out.println("Validation applied");
		
	}
	
	}
