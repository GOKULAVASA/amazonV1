package com.amazonV1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayedPage {

	WebDriver driver;
	Actions act;
public ProductDisplayedPage(WebDriver d) {
	driver=d;
	
	PageFactory.initElements(driver,this);
}
	
@FindBy(xpath="//span[text()='Men Oversized Sunglasses']")
WebElement searchDisplayed;
	
public void productDisplayed() {
	searchDisplayed.isDisplayed();
	
}
}
