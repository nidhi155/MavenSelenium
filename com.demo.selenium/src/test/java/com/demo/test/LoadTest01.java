package com.demo.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoadTest01 {
	private WebDriver driver;
	String URL = "http://google.com";
  @Test
  public void verifySearchButton() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.google.com");

      String search_text = "Google Search";
      WebElement search_button = driver.findElement(By.name("btnK"));

      String text = search_button.getAttribute("value");

      Assert.assertEquals(text, search_text, "Text not found!");
  }
  @BeforeClass
  public void startChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium4Java & drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  }

  @AfterClass
  public void closeDriver() {
		System.out.print("\nLoad Test 1..close browser");
		driver.quit();
	}

}
