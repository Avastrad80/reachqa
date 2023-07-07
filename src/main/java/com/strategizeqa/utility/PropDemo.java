package com.strategizeqa.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.strategizeqa.Keyword;

public class PropDemo {
	
	private static final Logger LOG = Logger.getLogger(PropDemo.class);

	public static String valueFromProp(String key) throws IOException {
		String base = System.getProperty("user.dir"); // Current working directory path
		FileInputStream fis = new FileInputStream(base + "/src/main/resources/Application.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static void login() throws IOException {
		Keyword.openbrowser("Chrome");
		Keyword.driver.get(PropDemo.valueFromProp("stage.url"));
		Keyword.driver.findElement(By.xpath("//input[@type='email']"))
				.sendKeys(PropDemo.valueFromProp("stage.username"));
		Keyword.driver.findElement(By.xpath("//button[@value='continue']")).click();
		Keyword.driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys(PropDemo.valueFromProp("stage.password"));
		Keyword.driver.findElement(By.xpath("//button[@value='login']")).click();
		LOG.info("Logged in to Staging");
	}

	public static void verifyLocators() throws InterruptedException, IOException, AWTException {
		login();
		Thread.sleep(5000);
		// Click on Location Radio Button
		Keyword.driver.findElement(By.id("competition")).click();
		Keyword.driver.findElement(By.name("Prior 30 days")).click();
        // Create an instance of the JavascriptExecutor interface
        // Execute JavaScript code
        // Example 1: Scroll to the bottom of the page
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Keyword.driver;
        jsExecutor.executeScript("let div_wrapper = document.getElementsByClassName('location-search-radius')[0];"
                + "let search_radius = div_wrapper.getElementsByTagName('p')[0];"
                + "search_radius.click();");
        
        Keyword.driver.findElement(By.id("radius-input")).sendKeys(Keys.CONTROL + "a");
    	Keyword.driver.findElement(By.id("radius-input")).sendKeys(Keys.DELETE);
    	Thread.sleep(2000);
    	Keyword.enterText("id", "radius-input", "100");
    	Keyword.driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
    	try {
    		WebElement locationSearch = Keyword.driver.findElement(By.cssSelector("input[placeholder='Search']"));
    		locationSearch.sendKeys("Texas, United States");
    		LOG.info("Selected Desired Location");
    	}catch (NoSuchElementException e) {
    		LOG.error("Element not found: " + e.getMessage());
    	}
    	
    	Thread.sleep(5000);
    	Keyword.driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys(Keys.TAB);
//    	Thread.sleep(15000);
//    	Keyword.driver.findElement(By.cssSelector("div#top-button-bar button")).click();
//    	try {
//    		WebElement checkMark = Keyword.driver.findElement(By.className("v-icon notranslate icon mdi mdi-check theme--light"));
//    		checkMark.click();
//    		LOG.info("Clicked On Green Check Mark");
//    	} catch (NoSuchElementException e) {
//    		LOG.error("Element not found: " + e.getMessage());
//    	}
//    	
    	Keyword.driver.findElement(By.xpath("//i[@class='v-icon notranslate icon mdi mdi-check theme--light']")).click();
    	Thread.sleep(2000);
    	try {
    	    WebElement acceptButton = Keyword.driver.findElement(By.xpath("//div[text()='Accept']"));
    	    acceptButton.click();
    	    LOG.info("Clicked on the 'Accept' button.");
    	} catch (NoSuchElementException e) {
    	    LOG.error("Element not found: " + e.getMessage());
    	}


//    	try {
//            WebElement button = Keyword.driver.findElement(By.cssSelector("button.v-btn.v-btn--icon.v-btn--round.theme--light.v-size--default"));
//            button.click();
//            LOG.info("Clicked on Edit Radius button");
//        } catch (NoSuchElementException e) {
//            LOG.info("Not able to click on Edit Radius button");
//        }
//    	
//    	LOG.info("Clicked on Edit sign to edit the Radius");
//    	Thread.sleep(5000);
//        Keyword.driver.findElement(By.id("radius-input")).sendKeys(Keys.CONTROL + "a");
//    	Keyword.driver.findElement(By.id("radius-input")).sendKeys(Keys.DELETE);
//    	Thread.sleep(2000);
//    	Keyword.enterText("id", "radius-input", "500");
//    	Keyword.driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
//    	Keyword.driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("California City, California, United States");
//    	Keyword.driver.findElement(By.xpath("//i[text()='done']")).click();
//    	Thread.sleep(5000);
//    	Keyword.driver.findElement(By.xpath("//i[normalize-space()='delete']")).click();
//    	Keyword.driver.findElement(By.xpath("//div[text()='Cancel']")).click();

    	Thread.sleep(5000);
    	Robot robot = new Robot();
    	robot.mouseWheel(2000);
    	jsExecutor.executeScript("let xpath = \"//label[text()='Weekly']\";"
    		    + "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
    		    + "let weeklyRadioButton = result.singleNodeValue;"
    		    + "if (weeklyRadioButton) { weeklyRadioButton.click(); }");

    	Thread.sleep(5000);
    	Keyword.driver.findElement(By.xpath("//button[@aria-label='filter the data']")).click();

    	


    	Thread.sleep(10000);
    	Keyword.screenshot("C:\\Screenshots\\");
    	Thread.sleep(5000);
        Keyword.driver.close();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		verifyLocators();
	}
}
