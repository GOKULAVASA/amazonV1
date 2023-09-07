package com.amazonV1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPverificationPage {
	WebDriver driver;

	public OTPverificationPage(WebDriver d){
		driver=d;
		PageFactory.initElements(driver,this);
	
}
	
	@FindBy(id="auth-pv-enter-code")
	WebElement OTP;

	@FindBy(id="auth-verify-button")
	WebElement createacctfinal;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signedin;
	

	public void OTPP(String otp) {
		OTP.sendKeys(otp);
	}

	public void createACCOUNT() {

		createacctfinal.click();
	}
	
	public void verifYUserACC() {
		String text=signedin.getText();
		System.out.println("Account signed in sucessfully and verifed user:"+text);
	}
}