package com.amazonV1.TestCases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazonV1.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String userEmail=readconfig.getUserEmail();
	public String userpass=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	public static WebDriverWait wait;
	

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger =Logger.getLogger("ecommerce");
		logger.info("chrome starting");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome")) {
			logger.info("chrome starting");
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}else if (br.equals("msedge")) {
			logger.info("msedge starting");
			System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		logger.info("url entered");
	}
/**
	@AfterClass
	public void teardown() {

		driver.quit();	
	}**/



	public static void CaptureScreenShot(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File SOURCE=ts.getScreenshotAs(OutputType.FILE);
		File TARGET =new File("./screenshots"+tname+ ".png");
		FileUtils.copyFile(SOURCE, TARGET);
		System.out.println("Screenshot taken");
			
	}

	
}



