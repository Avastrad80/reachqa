package com.strategizeqa.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHelper {
	
	public WebDriver driver;
	


    public void login(String userId, String password) {
        // locate the username and password fields
        WebElement usernameField = driver.findElement(By.cssSelector("#Username"));
        WebElement passwordField = driver.findElement(By.cssSelector("#Password"));

        // enter the user ID and password
        usernameField.sendKeys(userId);
        passwordField.sendKeys(password);

        // submit the form
        passwordField.submit();
    }



	public static void setDriver(Object driver2) {
		
	}
}
