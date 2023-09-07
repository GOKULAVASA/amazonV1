package com.amazonV1.TestCases;

import org.testng.annotations.Test;

import com.amazonV1.PageObjects.LoginPage;

public class TC_ReguserLogin_002 extends BaseClass {
	@Test
	public void SignUptest() throws InterruptedException {
		LoginPage si=new LoginPage(driver);
		Boolean tab=si.signupTAB();
		System.out.println("SIGN UP MODULE IS WORKING FINE ?:"+tab);
		logger.info("amazon homepage reached");
		si.signUPNavArrow();
		logger.info("navigating to signup tab");
		si.checkingcreatecustTab();
		logger.info("ENTERED INTO ACC CREATION PAGE SIGNIN MODULE IS WORKING 100%");
		si.alredyhaveACC();
		logger.info("alredy have an account so trying to login");
		si.registeredemail(userEmail);
		si.clickContinue();
		logger.info("user email entered");
		si.userregpass(userpass);
		logger.info("user entered passwored");

		si.signinsubmitbutton();
		logger.info("signin sucessfull");
	}
}