package com.strategizeqa.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.strategizeqa.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarketTrends {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;
	
	@FindBy(xpath = "//div[@class='md-theme-light']//child::a[1]")
	private WebElement marketTrends;

	@FindBy(xpath = "//div[@class='md-theme-light']//child::a[2]")
	private WebElement locations;

	@FindBy(xpath = "//div[@class='md-theme-light']//child::a[3]")
	private WebElement competition;

	@FindBy(css = "a#help > i.md-icon")
	private WebElement helpIcon;

	@FindBy(css = "div.md-button-content > span:first-of-type")
	private WebElement admin;

	@FindBy(css = "div.md-button-content > span:last-of-type")
	private WebElement logout;

	@FindBy(xpath = "//div[contains(@class,'driver-type')]")
	private WebElement driverType;

	@FindBy(xpath = "//div[text()='Company Driver']")
	private WebElement companyDriver;
	
	@FindBy(css = "#input-81")
	private WebElement timeframe;

	@FindBy(css = "button.green-button")
	private WebElement runSearch;

	@FindBy(css = "div#list-item-360.v-list-item.selectedOption > div.v-list-item__title")
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
		PageFactory.initElements(Keyword.driver, this);
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
	
	public MarketTrends clickLocationLink() {
		locations.click();
		return this;
		
	}
	
	public MarketTrends clickCompetitionLink() {
		competition.click();
		return this;
	}

	public MarketTrends clickHelpIconLink() {
		helpIcon.click();
		return this;
	}

	public MarketTrends clickMarketTrendsLink() {
		marketTrends.click();
		return this;
	}
	
	public MarketTrends clickCompanyDriverlink() {
		companyDriver.click();
		return this; 
	}
	
	public MarketTrends clickDriverType() {
		Keyword.wait(2000);
		driverType.click();
		return this;
	}
	
	public void selectDropdownOptionByIndex(int index) {
	    Select select = new Select(driverType);
	    select.selectByIndex(index);
	}

	
	public String getSelectedDropdownValue() {
	    Select select = new Select(driverType);
	    return select.getFirstSelectedOption().getText();
	}
	
	public void selectDropdownOptionByVisibleText(String visibleText) {
	    Select select = new Select(driverType);
	    select.selectByVisibleText(visibleText);
	}
	

	public MarketTrends click3months() {
		prior3months.click();
		return this;
	}
	
	public MarketTrends click6months() {
		prior6months.click();
		return this;
	}
	
	public MarketTrends click12months() {
		prior12months.click();
		return this;
	}

	public MarketTrends clickRunSearchButton() {
		runSearch.click();
		return this;
	}
	
	public MarketTrends verifyPageUrl() {
		Keyword.getPageTitle();
		return this;
	}
}
