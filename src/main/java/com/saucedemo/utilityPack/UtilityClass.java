package com.saucedemo.utilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.saucedemo.testClasses.TestBaseClass;

public class UtilityClass extends TestBaseClass{

	public static void Screenshot(WebDriver driver,String name)throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		 File destFile = new File("./ScreenshotFolder/"+name+".jpg");
		 FileHandler.copy(sourceFile, destFile);
	}
	
}
