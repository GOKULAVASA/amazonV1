package com.amazonV1.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	Actions act;
public SearchPage(WebDriver d) {
	driver=d;
	
	PageFactory.initElements(driver,this);
}
	

	
	@FindBy(id="twotabsearchtextbox")
WebElement searchbox;
	
	
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
WebElement searchkeywordverification;
	
	public void searchproduct(String pname) {
		act=new Actions(driver);
		searchbox.sendKeys(pname,Keys.ENTER);
		
	}
	public WebElement  serchverify() {
		WebElement element =searchkeywordverification;
	   
		return element;
	}
	
}