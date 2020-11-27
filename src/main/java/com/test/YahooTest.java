package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","email","browser"})
	public void yahooTest(String url, String email, String browser) {

	if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver" , "/Users/fatih/Webdrivers/chromedriver");
		driver = new ChromeDriver();
	}else {
		System.setProperty("webdriver.gecko.driver", "/Users/fatih/Webdrivers/geckodriver");
		driver = new FirefoxDriver();
		}
		
	driver.get(url);
	driver.findElement(By.id("login-username")).clear();
	driver.findElement(By.id("login-username")).sendKeys(email);
	driver.findElement(By.name("signin")).click();
	
}

}

