package com.strategizeqa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

public class Keyword {

	private static String xpath = "xpath";
	private static String linkText = "linkText";
	private static String className = "className";

	private Keyword() {
		throw new IllegalStateException("Utility class");
	}

	// This field is not final because it needs to be initialized at runtime.
	// Modifying its value directly can cause unexpected behavior and should be
	// avoided.
	public static RemoteWebDriver driver = null;

	/**
	 * This keyword will launch specified browser, if no browser name is specified
	 * then it will launch Chrome browser by default This keyword is capable for
	 * cross browser
	 * 
	 * @param browserName to launch
	 */

	public static void openbrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.setExperimentalOption("excludeSwitches", new String[] { "enable-automation", "disable-infobars" });
			driver = new ChromeDriver(option);
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		} else if (browserName.isEmpty()) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}

	// Launch URL
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// Get Page Title
	public static String getPageTitle() {
		return driver.getTitle();
	}

	// Scroll Window
	public static void scrollWindow(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0], arguments[1])", x, y);
		// driver.executeScript("window.scrollBy("+x+","+y+")"); // String Concatenation
	}

	// Fluent Wait
	public static void waitForvisibilityOfElementLocated(By element) {
		// Applied Fluent Wait
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
		// Wait Till the expected condition is present on the DOM
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		wait.until(ExpectedConditions.elementToBeSelected(element));

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
		} else if (locatorType.equalsIgnoreCase("Css")) {
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
		} else if (locatorType.equalsIgnoreCase("css")) {
			return driver.findElements(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("linkText")) {
			return driver.findElements(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("class")) {
			return driver.findElements(By.className(locatorValue));
		} else {
			return new ArrayList<>(); // or throw an exception if appropriate
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

	public static Object getDriver() {
		return null;
	}



}