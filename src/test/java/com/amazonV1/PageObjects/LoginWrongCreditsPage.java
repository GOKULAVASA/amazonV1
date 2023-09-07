package com.amazonV1.PageObjects;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonV1.TestCases.BaseClass;

public class LoginWrongCreditsPage {

		WebDriver driver;
		Logger logger;
		public LoginWrongCreditsPage(WebDriver d){
			driver=d;
			PageFactory.initElements(driver,this);
			
		}

		@FindBy(id="nav-link-accountList")
		WebElement signinTab;

		@FindBy(xpath="//span[@class='nav-line-2 ']//span")
		WebElement signupnavArrow;



		@FindBy(id="createAccountSubmit")
		WebElement newcust;

		@FindBy(xpath="//a[@class='a-link-emphasis']")
		WebElement AlredyregUser;

		@FindBy(id="ap_email")
		WebElement RegEmail;

		@FindBy(id="ap_password")
		WebElement userpassword;

		@FindBy(id="signInSubmit")
		WebElement signinbutton;

		@FindBy(id="continue")
		WebElement clickcont;

		@FindBy(xpath="//div[@class='a-alert-content']/ul/li/span")
		WebElement loginverify;
		
		public boolean signupTAB() {
			
			return signinTab.isDisplayed();
		}

		public void signUPNavArrow() throws InterruptedException {
			signupnavArrow.click();

		}

		public String checkingcreatecustTab() {
		    String text = newcust.getText();
		    System.out.println("Element text: " + text);
		    newcust.click();
		    return text;

			

		}
		public void alredyhaveACC() {
			AlredyregUser.click();
		}
		public void registeredemail(String email) {
			
			RegEmail.sendKeys(email);
		}
		public void clickContinue() {
			clickcont.click();
		}

		public void userregpass(String pass) {
			
			userpassword.sendKeys(pass);
		}
		public void signinsubmitbutton() {
			signinbutton.click();
		}
		
				public WebElement loginverfication() {
				WebElement text = loginverify;
					return text;
				}	
			
		
				}	
			

