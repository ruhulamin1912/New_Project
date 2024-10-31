package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryClass {
	
	static WebDriver driver;
	public PageFactoryClass(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}



/////////////

	
	@FindBy(xpath ="//*[@class='fa fa-lock']")
	private WebElement Signin; 
	
	@FindBy(xpath ="(//*[@name='email'])[1]")
	private WebElement Email; 
	
	@FindBy(xpath ="//*[@name='password']")
	private WebElement Password; 
	
	@FindBy(xpath ="(//*[@class='btn btn-default'])[1]")
	private WebElement Submit;

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	public static void main(String[] args) {
		
		PageFactoryClass PF = new PageFactoryClass(driver);
		PF.Email.click();

			
			
		
	}

}






