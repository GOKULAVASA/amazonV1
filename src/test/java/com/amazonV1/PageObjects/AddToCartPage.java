package com.amazonV1.PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddToCartPage {
	WebDriver driver;
	Actions act;
	public AddToCartPage(WebDriver d) {
		driver=d;

		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[contains(@alt,'THE MEN THING Adjustable Vintage Ring for Men, American trending Style - Funky, Punk Gothic Rings for Men & Boy')]")
	WebElement product;

	@FindBy(xpath="//span[@class='a-size-medium a-color-success']")
	WebElement availabilityTEST;

	@FindBy(id="quantity")
	WebElement quantity;

	@FindBy(xpath="(//span[contains(text(),'494.10')])[1]")
	WebElement amoutverify;

	@FindBy(id="add-to-cart-button")
	WebElement addtocart;

	@FindBy(id="nav-cart-count")
	WebElement carticonclicked;

	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement quantityverification;

	@FindBy(xpath="(//span[text()='494.10'])[2]")
	WebElement cartamoutverify;


	public void selectingProduct() {
		product.click();

	}

	public void availibityCheck() {

		String check= availabilityTEST.getText();
		System.out.println(check);
		if(check.equals(" In stock ")) {
			Assert.assertTrue(true);
			System.out.println(check);
		}

	}

	public void quantityselection() {
		Select sel =new Select(quantity);
		sel.selectByVisibleText("1");

	}
	public WebElement amoutverify() {
		WebElement ele= amoutverify;
		return ele;
	
		


	}
	public void addToCart() {
		addtocart.click();
	}

	public void CartIcon() {
		carticonclicked.click();
	}

	public void quantityverified() {
		String quantityinCart=quantityverification.getText();
		System.out.println(quantityinCart);
	}
	public String  cartverification() {
		return 	cartamoutverify.getText();	


	}
}