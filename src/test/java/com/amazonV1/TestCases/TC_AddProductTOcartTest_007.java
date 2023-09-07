package com.amazonV1.TestCases;
import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonV1.PageObjects.AddToCartPage;

public class TC_AddProductTOcartTest_007  extends TC_SearcgBoxTest_004{
	@Test(priority=1)

	public void addingtocart() throws InterruptedException {

		AddToCartPage ap=new AddToCartPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ap.selectingProduct();
		logger.info("selected");
		Set<String>win=driver.getWindowHandles();
		System.out.println(win);
		for(String winHandle :win){
			driver.switchTo().window(winHandle);
		}
		logger.info("window id ");
		ap.availibityCheck();
		logger.info("product is available");
		ap.quantityselection();
		Thread.sleep(5000);
		WebElement element=ap.amoutverify();
		String amount1=element.getText();
		System.out.println(amount1);

		logger.info("analyse amt");
		logger.info("quantity selected");
		ap.addToCart();
		logger.info("added to cart btn is clicked ");
		ap.CartIcon();
		ap.quantityverified();
		logger.info("qunatity is verified in the cart");
		Thread.sleep(5000);
		String amount2=ap.cartverification();
		System.out.println(amount2);
	
		if(amount2.equals("  494.10")) {
			logger.info("verifies product price same like in cart prize");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}


}

