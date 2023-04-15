package com.strategizeqa.pages;

import java.util.Map;
import org.openqa.selenium.support.FindBy;

import com.strategizeqa.Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarketTrends {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;
	
	@FindBy(css = "#market")
	private WebElement marketTrends;

	@FindBy(css = "#locations")
	private WebElement locations;

	@FindBy(css = "#competition")
	private WebElement competition;

	@FindBy(css = "a#help > i.md-icon")
	private WebElement helpIcon;

	@FindBy(css = "div.md-button-content > span:first-of-type")
	private WebElement admin;

	@FindBy(css = "div.md-button-content > span:last-of-type")
	private WebElement logout;

	@FindBy(css = "#driver-type-select")
	private WebElement driverType;

	@FindBy(css = "#input-81")
	private WebElement timeframe;

	@FindBy(css = "button.green-button")
	private WebElement runSearch;

	@FindBy(xpath = "//div[contains(text(),'Prior 3 months')]")
	private WebElement prior3months;

	@FindBy(xpath = "//div[contains(text(),'Prior 6 months')]")
	private WebElement prior6months;

	@FindBy(xpath = "//div[contains(text(),'Prior 12 months')]")
	private WebElement prior12months;

	@FindBy(css = ".formdate:nth-child(1)>.formdate-input-month")
	private WebElement inputmonth;

	@FindBy(css = ".formdate:nth-child(1)>.formdate-input-year")
	private WebElement inputyear;

	@FindBy(css = ".formdate.disable > .formdate-input-month[aria-labelledby=\"To Month Input\"]")
	private WebElement toinputmonth;

	@FindBy(css = ".formdate.disable > .formdate-input-year[aria-labelledby=\"To Year Input\"]")
	private WebElement toinputyear;

	@FindBy(xpath = "//i[contains(text(),'keyboard_arrow_right')]")
	private WebElement keyboardarrowleft;

	@FindBy(xpath = "//i[contains(text(),'keyboard_arrow_right')]")
	private WebElement keyboardarrowright;

	public MarketTrends() {
	}

	public MarketTrends(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public MarketTrends(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public MarketTrends(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}
	


	/**
	 * Click on Competition Link.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickCompetitionLink() {
		competition.click();
		return this;
	}

	/**
	 * Click on Help Icon Link.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickHelpIconLink() {
		helpIcon.click();
		return this;
	}

	/**
	 * Click on Keyboardarrowleft Button.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickKeyboardarrowleftButton() {
		keyboardarrowleft.click();
		return this;
	}

	/**
	 * Click on Keyboardarrowright Button.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickKeyboardarrowrightButton() {
		keyboardarrowright.click();
		return this;
	}

	/**
	 * Click on Locations Link.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickLocationsLink() {
		locations.click();
		return this;
	}

	/**
	 * Click on Market Trends Link.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickMarketTrendsLink() {
		marketTrends.click();
		return this;
	}

	/**
	 * Click on Run Search Button.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends clickRunSearchButton() {
		runSearch.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends fill() {
		setDriverTypeTextField();
		setTimeframeTextField();
		return this;
	}

	/**
	 * Set default value to Driver Type Text field.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends setDriverTypeTextField() {
		return setDriverTypeTextField(data.get("DRIVER_TYPE"));
	}

	/**
	 * Set value to Driver Type Text field.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends setDriverTypeTextField(String driverTypeValue) {
		driverType.sendKeys(driverTypeValue);
		return this;
	}

	/**
	 * Set default value to Timeframe Text field.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends setTimeframeTextField() {
		return setTimeframeTextField(data.get("TIMEFRAME"));
	}

	/**
	 * Set value to Timeframe Text field.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends setTimeframeTextField(String timeframeValue) {
		timeframe.sendKeys(timeframeValue);
		return this;
	}

	/**
	 * Verify that current page URL matches the expected URL.
	 *
	 * @return the MarketTrends class instance.
	 */
	public MarketTrends verifyPageUrl() {
		Keyword.getPageTitle();
		return this;
	}
}
