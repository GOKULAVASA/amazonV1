package com.amazonV1.TestCases;

import org.testng.annotations.Test;

import com.amazonV1.PageObjects.HomemodulesPage;

public class TC_HOMEPAGEMODULES_001 extends BaseClass{
@Test 
	public void homepagemodulesTest() {
		HomemodulesPage hp=new HomemodulesPage(driver);
		boolean isLogoDisplayed =hp.amazonlogo();
		if (isLogoDisplayed) {
		    // The logo is displayed
		    System.out.println("Amazon logo is displayed.");
		} else {
		    // The logo is not displayed
		    System.out.println("Amazon logo is not displayed.");
		}
		    hp.LocationTAB();
		   hp.choosingLocation();
	boolean isbuttonisthere	=hp.signinLINKPRESENT();
		if (isbuttonisthere) {
		    // The link is there
		    System.out.println("Amazon signin direct link button is not displayed");
		} else {
		    // The link is not there
		    System.out.println("Amazon signin direct link button is not displayed.");
		}
		hp.checkingInputBox();
		logger.info("text box is there");
		hp.checkingsubmitbutton();
		hp.checkingdropdown();
		hp.checkingLanguagemodule();
		logger.info("clicking the language module");
		boolean isenablethere	=hp.languagesetting();
		if (isenablethere) {
		    // The link is there
		    System.out.println("EN is enabled");
		} else {
		    // The link is not there
		    System.out.println("EN is not enabled.");
		}
		
		
		
	}
	
}
