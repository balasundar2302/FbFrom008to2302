package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.FbRunner;

import BaseClass.BaseClass1;
import POM.SingleTonDesignPattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import property.ConfigurationHelper;

public class FbStepdefinition extends BaseClass1 {
	public static WebDriver driver=	FbRunner.driver;
	public static SingleTonDesignPattern sdp;

	@Given("user Launch The Url Of Application")
	public void user_Launch_The_Url_Of_Application() throws IOException, InterruptedException {
//		driver= browserLaunch("chrome");
//		launchUrl("https://www.facebook.com/");
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver= browserLaunch(browser);
		sdp= new SingleTonDesignPattern(driver);
		String url = ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		
		printText(sdp.getLoginPage().getText());

		sleep();

	}

	@When("user Enter The Email Id or Phone Number Into Such Field")
	public void user_Enter_The_Email_Id_or_Phone_Number_Into_Such_Field() throws IOException {

//		WebElement username=driver.findElement(By.id("email"));
// 		//username.sendKeys("balasundar008@gmail.com");
//		userInput(username, "balasundar008@gmail.com");
		String us = ConfigurationHelper.getInstance().getUserName();
		userInput(sdp.getLoginPage().getUsername(),us);
	}

	@When("user Enter The Password Into Password Field")
	public void user_Enter_The_Password_Into_Password_Field() throws IOException {
//		WebElement password=driver.findElement(By.name("pass"));
// 		//password.sendKeys("1122334455");
//		userInput(password, "1122334455");
		String ps = ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(), ps);
	}

	@When("user Click The Login button")
	public void user_Click_The_Login_button() throws IOException, InterruptedException {
//		WebElement loginBtn=driver.findElement(By.name("login"));
// 		//loginBtn.click();
// 		clickOnElement(loginBtn);
		clickOnElement(sdp.getLoginPage().getLoginBtn());
		sleep();
		
 		screenshot(); 	
// 		NavigateBFR("back");
		implicitWait();
		
// 		TakesScreenshot ts= (TakesScreenshot)driver;
// 		File source = ts.getScreenshotAs(OutputType.FILE);
// 		File destination = new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase.png");
// 		FileUtils.copyFile(source, destination);
// 		
// 		//driver.navigate().back();
 		NavigateBFR("back");

	}

	@When("user Click The Create Account button")
	public void user_Click_The_Create_Account_button() throws InterruptedException {

// 		WebElement CreateBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));			
//		//CreateBtn.click();
// 		clickOnElement(CreateBtn);

		clickOnElement(sdp.getSignUpPage().getCreateBtn());
// 		
 		implicitWait();
	}

	@When("user Enter Their First Name In Such Field")
	public void user_Enter_Their_First_Name_In_Such_Field() throws IOException {

//		WebElement fName = driver.findElement(By.name("firstname"));
//		//fName.sendKeys("bala");
//		userInput(fName, "bala");
		
		String fN = ConfigurationHelper.getInstance().getfName();		
		userInput(sdp.getSignUpPage().getfName(), fN);
		
				
	}

	@When("user Enter Their Surname Name In Such Field")
	public void user_Enter_Their_Surname_Name_In_Such_Field() throws IOException {
//		WebElement sName = driver.findElement(By.name("lastname"));
//		//sName.sendKeys("sundar");
//		userInput(sName, "sundar");
		String sN = ConfigurationHelper.getInstance().getsName();
		userInput(sdp.getSignUpPage().getsName(), sN);
		
		

	}
	@When("user Enter Their Mobile Number or Email Id In Such Field")
	public void user_Enter_Their_Mobile_Number_or_Email_Id_In_Such_Field() throws IOException {
//		WebElement mble = driver.findElement(By.name("reg_email__"));
//		//mble.sendKeys("6382134515");
//		userInput(mble, "6382134515");
		String mb = ConfigurationHelper.getInstance().getmble();
		userInput(sdp.getSignUpPage().getMble(), mb);
		
			}

	@When("user Enter Their New Password In Such Field")
	public void user_Enter_Their_New_Password_In_Such_Field() throws IOException {
//		WebElement newpass = driver.findElement(By.id("password_step_input"));
//		//newpass.sendKeys("1122334455");
//		userInput(newpass, "1122334455");
		String nP = ConfigurationHelper.getInstance().getnewpass();
		userInput(sdp.getSignUpPage().getNewpass(), nP);
		
		

	}

	@When("user Select Their DOB  In Such Field")
	public void user_Select_Their_DOB_In_Such_Field() throws IOException {

//		WebElement date = driver.findElement(By.name("birthday_day"));
//		Select s= new Select(date);
//		s.selectByVisibleText("23");
//		
//		WebElement month = driver.findElement(By.name("birthday_month"));
//		Select s1= new Select(month);
//		s1.selectByValue("2");
//		
//		WebElement year = driver.findElement(By.name("birthday_year"));
//		Select s2= new Select(year);
//		s2.selectByVisibleText("1996");
		String d = ConfigurationHelper.getInstance().getdate();
		userInput(sdp.getSignUpPage().getDate(), d);
		
		String m = ConfigurationHelper.getInstance().getmonth();
		userInput(sdp.getSignUpPage().getMonth(), m);
		
		String y = ConfigurationHelper.getInstance().getyear();
		userInput(sdp.getSignUpPage().getYear(), y);

	}

	@When("user Click Their Gender In Such Field")
	public void user_Click_Their_Gender_In_Such_Field() throws IOException {
//		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
//		//gender.click();
//		clickOnElement(gender);
		clickOnElement(sdp.getSignUpPage().getGender());
	}

	@When("user Click The SignUp button In Such Field")
	public void user_Click_The_SignUp_button_In_Such_Field() throws IOException, InterruptedException {
//		WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
//		//signup.click();	
//		clickOnElement(signup);
		
		clickOnElement(sdp.getSignUpPage().getSignup());
		sleep();
		
//		TakesScreenshot ts1= (TakesScreenshot) driver;
//		File source1 = ts1.getScreenshotAs(OutputType.FILE);
//		File destination1= new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase1.png");
//		FileUtils.copyFile(source1, destination1);
		screenshot();
	}



}
