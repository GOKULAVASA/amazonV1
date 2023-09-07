package com.amazonV1.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.amazonV1.PageObjects.FilterandSortingPage;
import com.amazonV1.PageObjects.SearchPage;

public class TC_FilterandsortingTest_006 extends TC_SearcgBoxTest_004 {
	@Test(priority=1)
	public void applyingFiltersANDsort() {
		FilterandSortingPage Fp=new FilterandSortingPage(driver);
		logger.info("iterating starts");
		Fp.BeforePricingFilter();
	
		logger.info("above list are the product list before sorting higt to low");
		Fp.sortbtn();
		Fp.Hightolow();
		logger.info("sort btn clicked");
		Fp.afterSortingprice();
		logger.info("list are the product list after sorting higt to low");
	}


@Test(priority=2)
public void filteringProduct() {
	FilterandSortingPage Fp=new FilterandSortingPage(driver);
	logger.info("sotring starts");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Fp.checkbox1();
	Fp.reviewRating();
	Fp.minPriceRange("10000");
	Fp.maxPriceRange("30000");
	Fp.applyfilters();
	//Fp.alldicscount();
	Fp.payondelivery();
	//Fp.material();
	//Fp.offers();
	Fp.ratingandPricingverification();
}
}
