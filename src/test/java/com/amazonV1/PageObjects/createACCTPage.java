package com.amazonV1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createACCTPage {
	WebDriver driver;

	public createACCTPage(WebDriver d){
		driver=d;
		PageFactory.initElements(driver,this);

	}
	@FindBy(id="ap_customer_name")
	WebElement name;

	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement countrycodeverify;

	@FindBy(id="ap_phone_number")
	WebElement phNum;

	@FindBy(id="ap_email")
	WebElement email;


	@FindBy(id="ap_password")
	WebElement password;

	@FindBy(id="continue")
	WebElement clickctn;

	

	public void custName(String custname) {

		name.sendKeys(custname);
	}

	public String  ccode() {


		String text = countrycodeverify.getText();
		System.out.println("Element text: " + text);
		return text;
	}

	public void custNum(String phnumber) {

		phNum.sendKeys(phnumber);
	}
	public void custemail(String custemail) {
		email.sendKeys(custemail);
	}


	public void custpass(String pass) {

		password.sendKeys(pass);
	}

	public void cilckOk() {
		clickctn.click();
	}


}
