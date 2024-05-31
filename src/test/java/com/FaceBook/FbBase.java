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

public class FbBase extends BaseClass1{
	public static WebDriver driver= null;						
	
		public static void main(String[] args) throws IOException {
		
			driver= browserLaunch("chrome");						//from base class
			
			
			
			launchUrl("https://www.facebook.com/");					//from base class
			
			WebElement t = driver.findElement(By.tagName("h2"));		
			
			printText(t);											//from base class
			
	 		
			
			WebElement username=driver.findElement(By.id("email"));
			userInput(username, "balasundar008@gmail.com");		//from base class
			
			
	 		
			WebElement password=driver.findElement(By.name("pass"));
			userInput(password, "1122334455");					//from base class
			
	 		
	 		
			
			WebElement loginBtn=driver.findElement(By.name("login"));
	 		clickOnElement(loginBtn);								//from base class

			
//			TakesScreenshot ts= (TakesScreenshot)driver;
//	 		File source = ts.getScreenshotAs(OutputType.FILE);
//	 		File destination = new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase.png");
//	 		FileUtils.copyFile(source, destination);
	 		
	 		screenshot(); 		
	 		NavigateBFR("back");									//from base class
	 		
	 		
	 		WebElement CreateBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));			
	 		clickOnElement(CreateBtn);								//from base class
			
	 		implicitWait();											//from base class

			WebElement fName = driver.findElement(By.name("firstname"));
			userInput(fName, "bala");								//from base class
			
			WebElement sName = driver.findElement(By.name("lastname"));
			userInput(sName, "sundar");								//from base class

			
			WebElement mble = driver.findElement(By.name("reg_email__"));
			userInput(mble, "6382134515");							//from base class

			
			WebElement newpass = driver.findElement(By.id("password_step_input"));
			userInput(newpass, "1122334455");						//from base class

			
			
			WebElement date = driver.findElement(By.name("birthday_day"));
//			Select s= new Select(date);
//			s.selectByVisibleText("23");
			selectDropDown(date, "text", "23");

			WebElement month = driver.findElement(By.name("birthday_month"));
//			Select s1= new Select(month);
//			s1.selectByValue("2");
			selectDropDown(month, "value", "2");

			WebElement year = driver.findElement(By.name("birthday_year"));
//			Select s2= new Select(year);
//			s2.selectByVisibleText("1996");
			selectDropDown(year, "text", "1996");

			WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
			clickOnElement(gender);									//from base class
			
			WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
			clickOnElement(signup);									//from base class
			
			TakesScreenshot ts1= (TakesScreenshot) driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			File destination1= new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase1.png");
			FileUtils.copyFile(source1, destination1);


}}
