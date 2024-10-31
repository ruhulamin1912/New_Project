package com.basepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	static WebDriver driver;
	static String 	browser;	
	public static void BrowserSetting() {		
	//browser = "Chrome";
	browser = "Firefox";	
	}	
	public static void ConfigureBrowser() {	
		if(browser.contains("Chrome")) {
		WebDriverManager.chromedriver().setup(); //Setting Up Webdriver 
		driver = new ChromeDriver();		
		}
		if (browser.contains("Firefox")) {
			driver = new FirefoxDriver();			
		}
	}
	public static void TestRun() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Batch 38 Automation Testing");
		Thread.sleep(4000);
		driver.close();
	}

}
