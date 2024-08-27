package com.reachqa.pages;


import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reachqa.Keyword;

public class LoginToApplication {
	
	private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

	@FindBy(xpath = "//button[@value='continue']")
	private WebElement contiuneBtn;

    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    private WebElement forgotPassword;
    
	@FindBy(xpath = "//input[@type='email']")
    private WebElement logInToYourAccount;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement enterPassword;

	@FindBy(xpath = "//button[@value='login']")
    private WebElement loginBtn;

    public LoginToApplication() {
    	PageFactory.initElements(Keyword.driver, this);
    }

    public LoginToApplication(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public LoginToApplication(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public LoginToApplication(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }
    
	public LoginToApplication enterUserName(String userName) {
		logInToYourAccount.sendKeys(userName);
		return this;
	}
	
	public LoginToApplication clickContiune() {
		contiuneBtn.click();
		return this;
	}
	
	public LoginToApplication enterPassword(String password) {
		enterPassword.sendKeys(password);
		return this;
	}
	
	public LoginToApplication loginBtn() {
		loginBtn.click();
		return this;
	}

    public LoginToApplication clickForgotPasswordLink() {
        forgotPassword.click();
        return this;
    }


}


