package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseClass1;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\com\\feature\\Facebook.feature",
glue= "com.stepdefinition",monochrome = true,
plugin= {"pretty",
		"html:Report/HtmlReport.html",
		"junit:Report/XmlReport.xml",
		"json:Report/JsonReport.json",})

public class FbRunner extends BaseClass1 {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Admin\\eclipse-workspace1\\IPTProject\\DriverNew\\chromedriver.exe");
		  driver= BaseClass1.browserLaunch("chrome");

	}
	@AfterClass
	public static void tear_Down() {
		driver.close();

	}


}
