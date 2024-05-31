package com.FaceBook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass1;
import POM.SingleTonDesignPattern;
import property.ConfigurationHelper;

public class FbProperty extends BaseClass1{
	public static WebDriver driver=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver= browserLaunch(browser);
		
		SingleTonDesignPattern sdp= new SingleTonDesignPattern(driver);
		
		String url = ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		
		printText(sdp.getLoginPage().getText());
		
		String us = ConfigurationHelper.getInstance().getUserName();
		userInput(sdp.getLoginPage().getUsername(),us);
		
		String ps = ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(), ps);
		
		clickOnElement(sdp.getLoginPage().getLoginBtn());
		sleep();
		
 		screenshot(); 		

		
		NavigateBFR("back");
		sleep();
		
		clickOnElement(sdp.getSignUpPage().getCreateBtn());
		implicitWait();		
		
		String fN = ConfigurationHelper.getInstance().getfName();		
		userInput(sdp.getSignUpPage().getfName(), fN);
		
		String sN = ConfigurationHelper.getInstance().getsName();
		userInput(sdp.getSignUpPage().getsName(), sN);
		
		String mb = ConfigurationHelper.getInstance().getmble();
		userInput(sdp.getSignUpPage().getMble(), mb);
		
		String nP = ConfigurationHelper.getInstance().getnewpass();
		userInput(sdp.getSignUpPage().getNewpass(), nP);
		
		String d = ConfigurationHelper.getInstance().getdate();
		userInput(sdp.getSignUpPage().getDate(), d);
		
		String m = ConfigurationHelper.getInstance().getmonth();
		userInput(sdp.getSignUpPage().getMonth(), m);
		
		String y = ConfigurationHelper.getInstance().getyear();
		userInput(sdp.getSignUpPage().getYear(), y);
		
		
		clickOnElement(sdp.getSignUpPage().getGender());
		
		clickOnElement(sdp.getSignUpPage().getSignup());
		sleep();
		
 		screenshot(); 		

	
	}
	

} 
