package com.amazonV1.TestCases;

import static org.testng.Assert.assertTrue;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonV1.PageObjects.SearchPage;

public class TC_SearcgBoxTest_004 extends BaseClass {
@Test(priority=0)
	public void sortproduct() {
		SearchPage sp=new SearchPage(driver);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the product to search  :");
		String product=scanner.nextLine();
		sp.searchproduct(product);
		WebElement text=sp.serchverify();
		System.out.println("product is showing in the search result");
		if(text.isDisplayed()) {
			Assert.assertTrue(true);
			logger.info("verified searched result matched with entered keyword");
		}else {
			Assert.assertTrue(false);
			logger.info(" searched result doesn't matched with entered keyword");
		}

}



}
