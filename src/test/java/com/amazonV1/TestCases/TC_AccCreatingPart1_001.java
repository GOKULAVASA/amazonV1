package com.amazonV1.TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazonV1.PageObjects.LoginPage;
import com.amazonV1.PageObjects.createACCTPage;
import com.amazonV1.utilities.XLutils;


public class TC_AccCreatingPart1_001 extends BaseClass{
	
	@Test(priority=0,dataProvider="signUp")
	public void SignUPDDT(String user,String pnum,String email,String pass) throws InterruptedException, IOException {
		logger.info("DDT starting");

		LoginPage si=new LoginPage(driver);
		logger.info("amazon homepage reached");
		si.signUPNavArrow();
		logger.info("navigating to signup tab");
		si.checkingcreatecustTab();
		logger.info("clicking createnew ACC");
		createACCTPage acc=new createACCTPage(driver);
		acc.custName(user);
		logger.info("user name entered");
		acc.ccode();
		logger.info("user country code verified ");
		acc.custNum(pnum);
		logger.info("user num entered");
		acc.custemail(email);
		logger.info("user email entered");
		acc.custpass(pass);
		logger.info("user pass entered");
		acc.cilckOk();
		logger.info("done");
		
	}	


	@DataProvider(name="signUp")

	String[][] getData() throws IOException{
		logger.info("user data retriving from file");
		String path=System.getProperty("user.dir")+"/src/test/java/com/amazonV1/TestData/signUp.xlsx";
		
		int rownum=XLutils.getRowCount(path, "Sheet1");
		int colcount=XLutils.getCellCount(path, "Sheet1",1);
		String signupdata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++){
			for (int j=0;j<colcount;j++) {
				signupdata[i-1][j]=XLutils.getCellData(path, "Sheet1", i, j);
			}
			logger.info("user data retriving done");

		}
		return signupdata;
	}
}
