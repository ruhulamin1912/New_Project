package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBroswerWithMethod {
	
	
	static WebDriver driver;
	static String browser;
	
	
	
	public static void BrowserSetting(){
		
		browser="Chrome";
	}
	
	public static void BrowserConfigration(){
		
	
		if (browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	public static void TestCaseRun(){
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https:www.google.com");
		 System.out.println("Give me the title : " +driver.getTitle());
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Facebook");
		 try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 driver.close();
		
	}
	
	public static void main(String[] args){
		BrowserSetting();
		BrowserConfigration();
		TestCaseRun();
	}
}
