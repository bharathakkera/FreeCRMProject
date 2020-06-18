package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	//PageFactory or Object Repository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginBtn;	

	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement crmLogo;
	
	//Initializing the page Object or OR;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	//Returns HomePage object
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
		
	}
}
