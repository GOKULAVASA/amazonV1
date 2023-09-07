package com.amazonV1.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.amazonV1.PageObjects.ProductDisplayedPage;

public class TC_ProductDisplayedVerification_005 extends TC_SearcgBoxTest_004{
	@Test(priority=1)
	public void RightProductDisplayed() throws InterruptedException {
		ProductDisplayedPage pd=new ProductDisplayedPage(driver);
		Thread.sleep(5000);
		logger.info("product verfication starts");
		pd.productDisplayed();
		logger.info("right product is displayed ");
	}

}
