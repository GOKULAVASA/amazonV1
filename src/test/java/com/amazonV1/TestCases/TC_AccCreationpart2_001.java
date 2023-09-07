package com.amazonV1.TestCases;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.amazonV1.PageObjects.OTPverificationPage;

public class TC_AccCreationpart2_001 extends TC_AccCreatingPart1_001 {
@Test
	public void OTPPositive() {
		OTPverificationPage acc=new OTPverificationPage(driver);
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the OTP received on your test phone: ");
		    String enteredOTP = scanner.nextLine();
		     acc.OTPP(enteredOTP);
		     
		}
		    logger.info("otp entered");
		      acc.createACCOUNT();
		logger.info("create account ok clicked");
	}

	
}
