package com.FaceBook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass1;
import POM.LoginPage;
import POM.SignUpPage;

public class FbPOM extends BaseClass1 {
	public static WebDriver driver= null;						
	
		public static void main(String[] args) throws IOException {		
			
			driver= browserLaunch("chrome");					
			
			LoginPage lp= new LoginPage(driver);					
			
			
			launchUrl("https://www.facebook.com/");					
			//driver.manage().window().maximize();					
			
			
			
			printText(lp.getText());							
	 		
						
			userInput(lp.getUsername(), "balasundar008@gmail.com");
			
	 		
			
			userInput(lp.getPassword(), "1122334455");				
	 		
	 		
			
			clickOnElement(lp.getLoginBtn());
			
//			TakesScreenshot ts= (TakesScreenshot)driver;
//	 		File source = ts.getScreenshotAs(OutputType.FILE);
//	 		File destination = new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase.png");
//	 		FileUtils.copyFile(source, destination);
	 		
	 		screenshot(); 		
	 		//driver.navigate().back();								
	 		NavigateBFR("back");								
	 		
	 		clickOnElement(lp.getCreateBtn());

	 		//from base class
			
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	//normal method
	 		implicitWait();	
			SignUpPage sp= new SignUpPage(driver);					


			userInput(sp.getfName(), "bala");
			
			
			
			userInput(sp.getsName(), "sundar");								

			
			
			userInput(sp.getMble(), "6382134515");							

			
			
			userInput(sp.getNewpass(), "1122334455");						

			
			
//			WebElement date = driver.findElement(By.name("birthday_day"));
//			Select s= new Select(date);
//			s.selectByVisibleText("23");
//			
			userInput(lp.getDate(),"23");
			
//			WebElement month = driver.findElement(By.name("birthday_month"));
//			Select s1= new Select(month);
//			s1.selectByValue("2");
			userInput(lp.getMonth(), "2");
			
//			WebElement year = driver.findElement(By.name("birthday_year"));
//			Select s2= new Select(year);
//			s2.selectByVisibleText("1996");
			userInput(lp.getYear(), "1996");
			
			clickOnElement(sp.getGender());									
			
			clickOnElement(sp.getSignup());									
			
//			TakesScreenshot ts1= (TakesScreenshot) driver;
//			File source1 = ts1.getScreenshotAs(OutputType.FILE);
//			File destination1= new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase1.png");
//			FileUtils.copyFile(source1, destination1);
			screenshot();

		}}
