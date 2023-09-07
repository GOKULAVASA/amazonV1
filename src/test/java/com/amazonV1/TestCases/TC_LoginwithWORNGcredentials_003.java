package com.amazonV1.TestCases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonV1.PageObjects.LoginWrongCreditsPage;

public class TC_LoginwithWORNGcredentials_003 extends BaseClass {
@Test
	public void NegativeCredentials() throws InterruptedException, IOException {
		LoginWrongCreditsPage lp =new LoginWrongCreditsPage(driver);
		
		Boolean tab=lp.signupTAB();
		System.out.println("SIGN UP MODULE IS WORKING FINE ?:"+tab);
		logger.info("amazon homepage reached");
		lp.signUPNavArrow();
		logger.info("navigating to signup tab");
		lp.checkingcreatecustTab();
		logger.info("ENTERED INTO ACC CREATION PAGE SIGNIN MODULE IS WORKING 100%");
		lp.alredyhaveACC();
		logger.info("alredy have an account so trying to login");
		lp.registeredemail(userEmail);
		lp.clickContinue();
		logger.info("user email entered");
		lp.userregpass("@123GKvasan");
		logger.info("user entered passwored");
		lp.signinsubmitbutton();
		logger.info("submit button clicked");
		try {
			WebElement verification=lp.loginverfication();
			if(verification.isDisplayed()) {
				CaptureScreenShot(driver,"NegativeCredentials");
			} 
		}     catch (Exception e) {
	            // Handle the exception here if needed
	            e.printStackTrace();
	        }
		
}
}

	






			
		


