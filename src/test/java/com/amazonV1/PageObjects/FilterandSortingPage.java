package com.amazonV1.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterandSortingPage {
	private static final int List = 0;
	private static final int WebElement = 0;
	WebDriver driver;
	Actions act;
public FilterandSortingPage(WebDriver d) {
	driver=d;
	
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[@class='a-price-whole']")
List<WebElement> beforePriceFilter;

@FindBy(id="a-autoid-0-announce")
WebElement filterbtn;


@FindBy(id="s-result-sort-select_2")
WebElement sorting;

@FindBy(xpath="//span[@class='a-price-whole']")
List<WebElement> aftersortingHigh2low;   
// filtering elemts starts
@FindBy(xpath="//span[text()='Get It by Tomorrow']")
WebElement checkbox1;


@FindBy(xpath="//li[@id='p_72/1318476031']")
WebElement revStrs;

@FindBy(id="low-price")
WebElement minamount;

@FindBy(id="high-price")
WebElement maxamount;

@FindBy(xpath="//input[@class='a-button-input']")
WebElement clickGO;


@FindBy(xpath="//span[text()='All Discounts']")
WebElement clickdiscounts;


@FindBy(xpath="//span[text()='Eligible for Pay On Delivery']")
WebElement payOnDelivery;


@FindBy(xpath="//span[text()='Rectangular']")
WebElement shape;

@FindBy(xpath="//span[text()='Glass']")
WebElement material;


@FindBy(xpath="//span[text()='10% Off or more']")
WebElement offers;


//sorting and filtring verfication
@FindBy(xpath="//span[@class='a-price-whole']")
List<WebElement> priceElements;


@FindBy(xpath="//span[@class='a-size-base puis-bold-weight-text']")
List<WebElement> ratingElements;

public void BeforePricingFilter() {
	for(WebElement ele:beforePriceFilter) {
		String prices=ele.getText();
		System.out.println(prices);
	}
	
}
public void sortbtn() {
	filterbtn.click();
}
public void Hightolow() {
	sorting.click();
}
public void afterSortingprice() {
	for(WebElement ele:aftersortingHigh2low) {
		String prices=ele.getText();
		System.out.println(prices);
	}
}
//filtering methods
public void checkbox1() {
	checkbox1.click();
}

public void reviewRating() {
	revStrs.click();
}
public void minPriceRange(String minamt) {
	minamount.sendKeys(minamt);
}
public void maxPriceRange(String maxamt) {
	maxamount.sendKeys(maxamt);
}

public void applyfilters() {
	clickGO.click();
}

public void alldicscount() {
	clickdiscounts.click();
}
public void payondelivery() {
	payOnDelivery.click();
}
public void glassShape() {
	shape.click();
}
public void material() {
	material.click();
}
public void offers() {
	offers.click();
}

public void ratingandPricingverification() {
	
	 if (priceElements.size() != ratingElements.size()) {
         System.out.println("Mismatch in the number of prices and ratings.");
         driver.quit();
         return;
     }

     // Iterate through both lists in parallel
     for (int i = 0; i < priceElements.size(); i++) {
         String priceText = priceElements.get(i).getText();
         String ratingText = ratingElements.get(i).getText();
         
         System.out.println("Price: " + priceText);
         System.out.println("Rating: " + ratingText);
         System.out.println(); // Separate each pair of price and rating
         
         // You can perform further actions or assertions here based on price and rating
     }

}
}
