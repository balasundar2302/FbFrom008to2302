package com.FaceBook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass1;
import POM.LoginPage;

public class FaceBook extends BaseClass1{
	//public static WebDriver driver= null;						
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 			//normal method
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver= browserLaunch("chrome");						//from base class
		driver.get("https://www.facebook.com/");				//normal method
		
		// lp= new LoginPage(driver);					//from Loginpage(POM)
		
		
		//launchUrl("https://www.facebook.com/");					//from base class
		driver.manage().window().maximize();					//normal method
		
		WebElement text = driver.findElement(By.tagName("h2"));		
		String t=text.getText();								//normal method
		System.out.println(t);									//normal method
		
		//printText(t);											//from base class
		
		//printText(lp.getText());								//from login page(POM)
 		
		
		WebElement username=driver.findElement(By.id("email"));
	 	username.sendKeys("balasundar008@gmail.com");			//normal method
		//userInput(username, "balasundar008@gmail.com");		//from base class
		
		//userInput(lp.getUsername(), "balasundar008@gmail.com");	//from login page(POM)
		
 		
		WebElement password=driver.findElement(By.name("pass"));
 		password.sendKeys("1122334455");						//normal method
		//userInput(password, "1122334455");					//from base class
		
		//userInput(lp.getPassword(), "1122334455");				//from login page(POM)
 		
 		
		
		WebElement loginBtn=driver.findElement(By.name("login"));
 		loginBtn.click();										//normal method
 		//clickOnElement(loginBtn);								//from base class

 		//clickOnElement(lp.getLoginBtn());
		
		TakesScreenshot ts= (TakesScreenshot)driver;
 		File source = ts.getScreenshotAs(OutputType.FILE);
 		File destination = new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase.png");
 		FileUtils.copyFile(source, destination);
 		
 		//screenshot(); 		
 		driver.navigate().back();								//normal method
 		//NavigateBFR("back");									//from base class
 		
 		
 		WebElement CreateBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));			
		CreateBtn.click();									//normal method
 		//clickOnElement(CreateBtn);								//from base class
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	//normal method
 		//implicitWait();											//from base class

		WebElement fName = driver.findElement(By.name("firstname"));
		fName.sendKeys("bala");								//normal method
		//userInput(fName, "bala");								//from base class
		
		WebElement sName = driver.findElement(By.name("lastname"));
		sName.sendKeys("sundar");								//normal method
		//userInput(sName, "sundar");								//from base class

		
		WebElement mble = driver.findElement(By.name("reg_email__"));
		mble.sendKeys("6382134515");							//normal method
		//userInput(mble, "6382134515");							//from base class

		
		WebElement newpass = driver.findElement(By.id("password_step_input"));
		newpass.sendKeys("1122334455");						//normal method
		//userInput(newpass, "1122334455");						//from base class

		
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select s= new Select(date);
		s.selectByVisibleText("23");
				
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1= new Select(month);
		s1.selectByValue("2");
		
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2= new Select(year);
		s2.selectByVisibleText("1996");
		
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();										//normal method
		//clickOnElement(gender);									//from base class
		
		WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signup.click();										//normal method
		//clickOnElement(signup);									//from base class
		
		TakesScreenshot ts1= (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1= new File("C:\\Users\\Admin\\eclipse-workspace1\\FaceBook\\ScreenshotFb\\facebookbase1.png");
		FileUtils.copyFile(source1, destination1);
		
//		String value = XLSXReader1.readParticularData("facebook", 2, 0);
//		username.sendKeys(value);
//		
//		WebElement password = driver.findElement(By.id("pass"));
//		String value1 = XLSXReader1.readParticularData("facebook", 2, 1);
//		password.sendKeys(value1);

//		driver.findElement(By.name("login")).click();
	}

}



