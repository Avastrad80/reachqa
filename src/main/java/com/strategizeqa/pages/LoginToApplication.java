package com.strategizeqa.pages;


import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginToApplication {
	
	private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

	@FindBy(css = ".btnGreen")
	private WebElement contiune;

    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    private WebElement forgotPassword;
    
	@FindBy(css = "#Username")
    private WebElement logInToYourAccount;
	
	@FindBy(css = "#Password")
	private WebElement password;

	@FindBy(css = "#loginButton")
    private WebElement login;


    public LoginToApplication() {
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
    
	public LoginToApplication enterUserName() {
		logInToYourAccount.sendKeys("arun@webmatrixcorp.com");
		return this;
	}
	
	public LoginToApplication clickContiune() {
		contiune.click();
		return this;
	}
	
	public LoginToApplication enterPassword() {
		password.sendKeys("Password@2023");
		return this;
	}
	
	public LoginToApplication login() {
		login.click();
		return this;
	}

    public LoginToApplication clickForgotPasswordLink() {
        forgotPassword.click();
        return this;
    }


   // public LoginToApplication fill() {
    //    setLogInToYourAccountEmailField();
     //   return this;
   // }


//    public LoginToApplication setLogInToYourAccountEmailField() {
    //    return setLogInToYourAccountEmailField(data.get("LOG_IN_TO_YOUR_ACCOUNT"));
  //  }


	/*
	 * public LoginToApplication setLogInToYourAccountEmailField(String
	 * logInToYourAccountValue) {
	 * logInToYourAccount.sendKeys(logInToYourAccountValue); return this; }
	 */




}


