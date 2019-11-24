package com.demo.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoadTest02 {
	private WebDriver driver;
	String URL = "http://google.com";
	
	 @BeforeClass
	  public void startChrome() {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium4Java & drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  }
	 @Test
	 public void verifyGooglePageTittle02() {
			driver.navigate().to(URL);
			String getTitle = driver.getTitle();
			Assert.assertEquals(getTitle, "Google");
		}

	  @AfterClass
	  public void closeDriver() {
			System.out.print("\nRun Load Test 2..");
			driver.quit();
		}


}
