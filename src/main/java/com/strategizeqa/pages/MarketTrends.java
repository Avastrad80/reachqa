package com.strategizeqa.pages;

import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.strategizeqa.Keyword;
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

	@FindBy(xpath = "//div[@class='v-select__slot']")
	private WebElement driverTypeList;

	@FindBy(xpath = "//div[contains(text(),'Overall']")
	private WebElement driverTypeOverAll;

	@FindBy(xpath = "//div[contains(text(),'Company Driver')]")
	private WebElement driverTypeCompanyDriver;
	
	@FindBy(xpath = "(//div[contains(text(),'Owner Operator')]")
	private WebElement driverTypeOwnerOperator;
	
	@FindBy(xpath = "//div[contains(text(),'Student')]")
	private WebElement driverTypeStudent;
	
	@FindBy(xpath = "//div[contains(text(),'Team')]")
	private WebElement driverTypeTeam;
	
	@FindBy(xpath = "//div[contains(text(),'Other')]")
	private WebElement driverTypeOther;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement timeframeDropDown;

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

	public void clickLocationLink() {
		locations.click();

	}

	public void clickCompetitionLink() {
		competition.click();

	}

	public void clickHelpIconLink() {
		helpIcon.click();

	}

	public void clickMarketTrendsLink() {
		Keyword.fWaitForvisibilityOfElementLocated(marketTrends);
		marketTrends.click();
	}

	public void clickDriverTypeList() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeList);
		driverTypeList.click();
	}

	public void clickOverall() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeOverAll);
		driverTypeOverAll.click();
	}

	public void clickCompanyDriver() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeCompanyDriver);
		driverTypeCompanyDriver.click();
	}
	
	public void clickOwnerOperator() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeOwnerOperator);
		driverTypeOwnerOperator.click();
	}

	
	public void clickStudent() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeStudent);
		driverTypeStudent.click();
	}
	
	public void clickTeam() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeTeam);
		driverTypeTeam.click();
	}
	
	public void clickOther() {
		Keyword.fWaitForvisibilityOfElementLocated(driverTypeOther);
		driverTypeOther.click();
	}
	
	
	public void clickTimeFrameDropDown() {
		Keyword.fWaitForvisibilityOfElementLocated(timeframeDropDown);

		timeframeDropDown.click();
	}

	public void selectPrior3months() {
		Keyword.fWaitForvisibilityOfElementLocated(prior3months);
		prior3months.click();
	}

	public void selectPrior6months() {
		Keyword.fWaitForvisibilityOfElementLocated(prior6months);
		prior6months.click();
	}

	public void selectPrior12months() {
		Keyword.fWaitForvisibilityOfElementLocated(prior12months);
		prior12months.click();
	}

	public void clickRunSearchButton() {
		Keyword.fWaitForvisibilityOfElementLocated(runSearch);
		runSearch.click();
	}

}
