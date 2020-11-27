package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		

		System.setProperty("webdriver.chrome.driver" , "/Users/fatih/Webdrivers/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/fatih/Webdrivers/geckodriver");
		//driver = new FirefoxDriver();

			driver = new ChromeDriver();
			
			
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
		}
			
	@Test (priority=1, groups="Title")
	public void googleTitleTest() {
	
	driver.get("http://www.google.com");
	String title=driver.getTitle();
	System.out.println("The title is : " + title);
}
	@Test
	public void googleLogoTest() {
		
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	//*[@id="gb"]/div/div[1]/div/div[1]/a
	
	@AfterMethod
	public void close() {
		
		driver.close();
	}
	}
	
	
	

