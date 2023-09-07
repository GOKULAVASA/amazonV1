package com.amazonV1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomemodulesPage {
	WebDriver driver;
	public HomemodulesPage(WebDriver d) {
		driver=d;
				PageFactory.initElements(driver,this);

	}
@FindBy(id="nav-logo-sprites")
WebElement logo;


@FindBy(id="glow-ingress-block")
WebElement Location;

@FindBy(id="a-popover-header-1")
WebElement locationsettingTab;

@FindBy(xpath="//input[@aria-label='Sign in to see your addresses']")
WebElement signinlinkinLocationTab;

@FindBy(id="GLUXZipUpdateInput")
WebElement checkingpincodeinputbox;

@FindBy(id="GLUXZipUpdate-announce")
WebElement checkingsubmitBtn;

@FindBy(id="GLUXCountryValue")
WebElement checkingdropdowndisplayed;

@FindBy(id="icp-nav-flyout")
WebElement languagemodule;


@FindBy(xpath="(//span[text()='English'])[1]")
WebElement languageSetting;

public boolean  amazonlogo() {
	 return logo.isDisplayed();
	 
}
public void LocationTAB() {
	Location.click();
}

public void choosingLocation() {
	 String textisdisplayed= locationsettingTab.getText();
	System.out.println("showing:"+textisdisplayed);
	 
}
public boolean signinLINKPRESENT() {
	return signinlinkinLocationTab.isDisplayed();
}
	
	public boolean checkingInputBox() {
		return checkingpincodeinputbox.isDisplayed();
	}
	
	public void checkingsubmitbutton() {
		String text=checkingsubmitBtn.getText();
		System.out.println("is displayed:"+text);
	
	}
	public void checkingdropdown() {
		Actions act=new Actions(driver);
		String text= checkingdropdowndisplayed.getText();
		System.out.println("is displayed:"+text);
		act.click(languagemodule).perform();
	}
	public void checkingLanguagemodule() {
		languagemodule.click();
	}
	public boolean languagesetting() {
		return languageSetting.isEnabled();
	}
}
