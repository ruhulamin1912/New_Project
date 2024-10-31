package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {
	
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 //WebDriverManager.firefoxdriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		
	
		 

		 
		 
		 
		 
		 
		// WebDriver driver = new FirefoxDriver();
		/*
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 */

	
	}

}
