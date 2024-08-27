package com.reachqa;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Map;
import java.util.HashMap;

public class Keyword {

	private static String xpath = "xpath";
	private static String linkText = "linkText";
	private static String className = "className";
	
	private Keyword() {
		throw new IllegalStateException("Utility class");
	}
	public static WebDriver driver = null;


	/**
	 * This keyword will launch specified browser, if no browser name is specifiedthen it will launch Chrome browser by default This keyword is capable for cross browser
	 * 
	 * @param browserName to launch
	 */

	public static WebDriver openbrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().clearDriverCache();
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<>();
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        option.setExperimentalOption("prefs", prefs);
			option.addArguments("--disable-notifications", "--password-store=basic", "--disable-save-password");
    		option.setExperimentalOption("excludeSwitches", new String[] { "enable-automation", "disable-infobars" });
			option.setCapability("goog:chromeOptions", "--cdp-version=120");
			option.addArguments("--disable-popup-blocking");

			driver = new ChromeDriver(option);
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		} else if (browserName.isEmpty()) {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	// Launch URL
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// Get Page Title
	public static String getPageTitle() {
		return driver.getTitle();
	}

	// Method for scrolling the window by x and y coordinates
	public static void scrollWindow(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
	}

	// Method for scrolling the entire page and filter element by x and y coordinates
	public static void scrollWindow(WebDriver driver, WebElement entirePage, WebElement filterElement, int x, int y) {
		// Scroll to the entire page first
		scrollWindow(driver, x, y);

		// Scroll to the filter element
		Actions actions = new Actions(driver);
		actions.moveToElement(entirePage).moveToElement(filterElement).click().build().perform();
		scrollWindow(driver, x, y);
	}

	public static void fWaitForvisibilityOfElementLocated(WebElement element) {
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	// Wait for the element to be clickable, then click it
	public static void clickWhenClickable(By locator, int timeoutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	    element.click();
	}

	public static void wait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// To click on web element
	public static void clickOn(String locatorType, String locatorValue) {

		getWebElement(locatorType, locatorValue);
	}

	// Press Enter Key
	public static void pressEnterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	// Get element using locators
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase(xpath)) {
			return driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase(linkText)) {
			return driver.findElement(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase(className)) {
			return driver.findElement(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(locatorValue));

		} else {
			return driver.findElement(By.id("123"));
		}
	}

	public static void screenshot(String filePath) {
	    // Capture the entire page screenshot
	    File srcFile = ((TakesScreenshot) Keyword.driver).getScreenshotAs(OutputType.FILE);

	    try {
	        // Create the file name using the scenario number and timestamp
	        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmm");
	        String timestamp = dateFormat.format(new Date());
	        String screenshotPath = "C:\\Users\\Arun\\Downloads\\ScreenShot\\";
	        String fileName = screenshotPath + "Testing_Locators" + "_" + timestamp + ".png";
	        FileUtils.copyFile(srcFile, new File(fileName));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	// Close Browser
	public static void closeBrowser() {
		driver.close();
	}

	// Enter Text
	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		WebElement element = getWebElement(locatorType, locatorValue);
		try {
			element.sendKeys(textToEnter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Get List of Texts using locator
	public static List<String> getListOfTexts(String locatorType, String locatorValue) {
		List<String> textList = new ArrayList<>();
		List<WebElement> list = null;
		if (locatorType.equalsIgnoreCase(xpath)) {
			list = driver.findElements(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("CssSelector")) {
			list = driver.findElements(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("Id")) {
			list = driver.findElements(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase(linkText)) {
			list = driver.findElements(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase(className)) {
			list = driver.findElements(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			list = driver.findElements(By.name(locatorValue));
		}

		for (WebElement listItem : list) {
			textList.add(listItem.getText());
		}
		return textList;

	}

	// Find list of elemetn using locator
	public static List<WebElement> findElements(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElements(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("Css")) {
			return driver.findElements(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase(xpath)) {
			return driver.findElements(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase(linkText)) {
			return driver.findElements(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase(className)) {
			return driver.findElements(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElements(By.name(locatorValue));
		} else {
			return driver.findElements(By.id("123"));
		}
	}

	// Get web elements
	public static List<WebElement> getWebElements(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElements(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElements(By.name(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElements(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("cssSelector")) {
			return driver.findElements(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("linkText")) {
			return driver.findElements(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("partialLinkText")) {
			return driver.findElements(By.partialLinkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("tagName")) {
			return driver.findElements(By.tagName(locatorValue));
		} else if (locatorType.equalsIgnoreCase("className")) {
			return driver.findElements(By.className(locatorValue));
		} else {
			throw new NoSuchElementException("Invalid locator type: " + locatorType);
		}
	}

	public static List<String> getTextFromListOfElements(String locatorType, String locatorValue) {
		List<WebElement> elements = getWebElements(locatorType, locatorValue);
		List<String> texts = new ArrayList<>();
		for (WebElement element : elements) {
			texts.add(element.getText());
		}

		return texts;
	}

	// Method Overloading
	public static void clickOn(String locator) {
		String[] parts = locator.split("##"); // used ## as a separator. used split method to separate locator and type
		String locatorType = parts[0];
		String locatorValue = parts[1];
		clickOn(locatorType, locatorValue);
	}

	// Method Overloading, same name but work different.
	public static void clickOn(WebElement element) {
		element.click();
	}

	public static void clickOn(By by) {
		driver.findElement(by).click();

	}

	public static void assertPageTitle(String expectedTitle) {
		String actual = getPageTitle();
		Assert.assertEquals(actual, expectedTitle);
	}

    // Method to wait for element to be clickable
	public static WebElement waitForElementClickable(By locator, int timeoutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	    return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	// Method to scroll to an element
	public static void scrollToElement(WebElement element) {
	    try {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	        Thread.sleep(5000); // Add a delay to wait for scrolling to finish, if necessary
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	// Method to scroll to a specific height
	public static void scrollToHeight(int height) {
	    try {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollTo(0, arguments[0]);", height);
	        Thread.sleep(5000); // Add a delay to wait for scrolling to finish, if necessary
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	// Method to scroll to an element using JavaScript
    public static void scrollIntoViewIfNeeded(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", element);
    }

    // Method to click on an element after scrolling to it
    public static void clickOnAfterScrolling(String locatorType, String locatorValue) {
        WebElement element = getWebElement(locatorType, locatorValue);
        scrollIntoViewIfNeeded(element);
        clickOn(locatorType, locatorValue);
    }

    // Overloaded method to click on an element after scrolling to it
    public static void clickOnAfterScrolling(WebElement element) {
        scrollIntoViewIfNeeded(element);
        clickOn(element);
    }
    
 // Method to calculate the date 15 days ahead from today in dd-MM-yyyy format
    public static String getDate15DaysAhead() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateAfter15Days = currentDate.plusDays(15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Updated format
        return dateAfter15Days.format(formatter);
    }
    
 // Method to set the desired start date
    public static void setDesiredStartDate(WebElement dateInput) {
        String date15DaysAhead = getDate15DaysAhead();
        dateInput.clear(); // Clear the field before sending the date
        dateInput.sendKeys(date15DaysAhead);
    }


}