package com.strategizeqa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.strategizeqa.Keyword;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompetitionPage {

	private Map<String, String> data;
	private WebDriver driver;
	private JavascriptExecutor jsExecutor;
	// private int timeout = 15;
	private static final Logger LOG = Logger.getLogger(CompetitionPage.class);

	/**
	 * Navigate to Competition Page By making the variable private, it can only be
	 * accessed within the class where it is declared, which is a common practice in
	 * object-oriented programming to ensure data encapsulation and improve code
	 * maintainability. This means that other classes cannot directly access or
	 * modify this variable, which can prevent unintended changes to the variable's
	 * value and ensure better control over the variable's usage.
	 * 
	 * @author Arun
	 */

	@FindBy(id = "competition")
	private WebElement competition;

	/**
	 * Filter to select the Timeframe
	 * 
	 * @author Arun
	 */
	@FindBy(name = "Prior 30 days")
	private WebElement prior30Days;

	@FindBy(xpath = "//label[text()='Last Month']")
	private WebElement lastMonth;

	@FindBy(xpath = "//label[text()='Past 3 Months']")
	private WebElement past3Months;

	@FindBy(xpath = "//label[text()='Past 6 Months']")
	private WebElement past6Months;

	@FindBy(xpath = "//label[text()='Past 12 Months']")
	private WebElement past12Months;

	@FindBy(xpath = "//input[@id='start' and @placeholder='MM/DD/YYYY']")
	private WebElement dateFrom;

	@FindBy(xpath = "//input[@id='end' and @placeholder='MM/DD/YYYY']")
	private WebElement dateTo;

	@FindBy(xpath = "//div[@role='radiogroup']")
	private WebElement radioGroupTimeFrame;

	/**
	 * Drop down arrows Time Frame, Job Type, Posting Driver Type, Solo or Team
	 * Position, Posting Route Type, Posting Haul Type.
	 */

	@FindBy(xpath = "//div[@class='posting-date-filter']//div//i[@class='md-icon md-icon-font md-light md-theme-light'][normalize-space()='arrow_drop_up']")
	private WebElement timedramedropdownrrow;

	@FindBy(xpath = "//h5[normalize-space()='Job Type']")
	private WebElement jobtypedropdownarrow;

	@FindBy(css = "div[class='with-include-exclude'] div[class='accordion-panel'] i[class='md-icon md-icon-font md-light md-theme-light']")
	private WebElement postingdrivertype;

	@FindBy(xpath = "//div[@class='job-type-sub-heading']//child::div[text()='Solo or Team Position']")
	private WebElement clickOnSoloOrTeam;

	@FindBy(xpath = "//div[@class='job-type-sub-heading']//child::div[text()='Posting Route Type']")
	private WebElement postingRouteType;

	@FindBy(xpath = "//div[@class='job-type-sub-heading']//child::div[text()='Posting Haul Type']")
	private WebElement postingHaulType;

	/**
	 * Posting Driver Type locators
	 * 
	 * @author Arun
	 */

	@FindBy(xpath = "//label[text()='Company Driver']")
	private WebElement companyDriver;

	@FindBy(xpath = "//label[text()='Owner-Operator']")
	private WebElement ownerOperator;

	@FindBy(xpath = "//label[text()='Lease Purchase']")
	private WebElement leasePurchase;

	@FindBy(xpath = "//label[text()='Student Driver']")
	private WebElement studentDriver;

	@FindBy(xpath = "//label[text()='Yard Jockey']")
	private WebElement yardJockey;

	/**
	 * Solo Or Team Position Filter Checked : Solor, Team(Any) To check radio
	 * buttons checked or unchecked
	 * 
	 * @author Arun
	 */

	@FindBy(xpath = "//label[text()='Solo']")
	private WebElement solo;

	@FindBy(xpath = "//label[text()='Team']")
	private WebElement team;

	/**
	 * Posting Route Type Local, Regional, Over The Road, Dedicated Check Radio
	 * Button
	 * 
	 * @author Arun
	 */
	@FindBy(xpath = "//label[text()='Local']")
	private WebElement local;

	@FindBy(xpath = "//label[text()='Regional']")
	private WebElement regional;

	@FindBy(xpath = "//label[text()='Over the Road']")
	private WebElement overTheRoad;

	@FindBy(xpath = "//label[text()='Dedicated']")
	private WebElement dedicated;

	/**
	 * Posting Haul Type: Dry Van, FlatBed, Refrigerated, Hazmat, Tanker, LTL, Auto
	 * Hauler, Doubles / Triples, Heavy Haul / Specialized, Power Only
	 * 
	 * 
	 * @author Arun
	 */
	@FindBy(xpath = "//label[text()='Dry Van']")
	private WebElement dryVan;

	@FindBy(xpath = "//label[text()='Flatbed']")
	private WebElement flatBed;

	@FindBy(xpath = "//label[text()='Refrigerated']")
	private WebElement refrigerated;

	@FindBy(xpath = "//label[text()='Hazmat']")
	private WebElement hazmat;

	@FindBy(xpath = "//label[text()='Tanker']")
	private WebElement tanker;

	@FindBy(xpath = "//label[text()='LTL']")
	private WebElement lTL;

	@FindBy(xpath = "//label[text()='Auto Hauler']")
	private WebElement autoHauler;

	@FindBy(xpath = "//label[text()='Doubles / Triples']")
	private WebElement doublesTriples;

	@FindBy(xpath = "//input[@name='Heavy Haul / Specialized']")
	private WebElement heavyHaulSpecialized;

	@FindBy(xpath = "//label[text()='Power Only']")
	private WebElement powerOnly;

//	@FindBy(xpath = "//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary-run-search-button']//span[@class='v-btn__content'][normalize-space()='Search']")
	@FindBy(css = "button[class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary-run-search-button'] span[class='v-btn__content']")
	private WebElement filterSearchButton;

	/**
	 * To click on Location Search and search the location and click on search
	 * Button
	 * 
	 * @author Arun
	 */
	@FindBy(css = "input[type='text']")
	private WebElement locationSearch;

	@FindBy(xpath = "//span[text()='Search ']")
	private WebElement locationSearchButton;

	@FindBy(xpath = "//span[text()='Update Search']")
	private WebElement locationUpdateSearchButton;

	@FindBy(xpath = "//span[normalize-space()='Clear All Filters']")
	private WebElement clearAllFilters;

	@FindBy(xpath = "//i[@class='v-icon notranslate close-icon ml-2 material-icons theme--light']")
	private WebElement clickOnXToClearFilter;

	@FindBy(xpath = "//div[@id='location_item0']//div[@class='v-list-item__content']//div//div[@class='v-list-item__subtitle location_type'][normalize-space()='state']")
	private WebElement clickonstate;

	/**
	 * To click on Search By Radius and functionality of search by radius
	 * functionality
	 * 
	 * @author Arun
	 */
	@FindBy(css = "input[placeholder='Search']")
	private WebElement locationInput;

	@FindBy(css = "ul.suggestions")
	private WebElement suggestionsDropdown;

	@FindBy(id = "radius-input")
	private WebElement clickOnRadiusSelectionText;

	@FindBy(css = "input[placeholder='Search']")
	private WebElement radiusLocation;

//	@FindBy(xpath="//i[@class='md-icon md-icon-font icon md-theme-light']")
	@FindBy(xpath = "//i[text()='done']")
//	@FindBy(css = "#top-button-bar button.md-button")
	private WebElement radiusGreenCheck;
	
    @FindBy(xpath = "//div[@class='info-editing-container']//h6[@data-v-71c40464]/b[@data-v-71c40464]")
    private WebElement infoHeading;

	@FindBy(xpath = "//div[text()='Accept']")
	private WebElement buttonAccept;

	@FindBy(xpath = "//i[normalize-space()='delete']")
	private WebElement deleteRadiusLocation;

	@FindBy(xpath = "//i[normalize-space()='edit']")
	private WebElement radiusEdit;

	@FindBy(xpath = "//i[normalize-space()='travel_explore']")
	private WebElement showOnMapRadius;

	/**
	 * Update Data, by selecting Yearly, Weekly, Hourly, and by CPM Yearly, Weekly,
	 * Hourly, CPM
	 * 
	 * @author Arun
	 */

	@FindBy(xpath = "//span[contains(text(),'Update Data')]")
	private WebElement clickOnUpdateData;

	@FindBy(xpath = "//input[@value='Yearly']")
	private WebElement wageTimeFrameYearly;

	@FindBy(xpath = "//input[@value='Weekly']")
	private WebElement wageTimeFrameWeekly;

	@FindBy(xpath = "//input[@value='Hourly']")
	private WebElement wageTimeFrameHourly;

	@FindBy(xpath = "//div[@class='v-input v-input--is-label-active v-input--is-dirty theme--light v-input--selection-controls v-input--radio-group v-input--radio-group--row']//div[@class='v-input--selection-controls__ripple primary--text']")
	private WebElement wageTimeFrameCPM;

	/**
	 * Click on Filter button in Advertised Wage Ranges by Company section to sort
	 * by Max, Min and company Name
	 * 
	 * @author Arun
	 */

	@FindBy(xpath = "//button[@aria-label='filter the data']")
	private WebElement companyNameSort;

	@FindBy(xpath = "//div[contains(text(),'Sort by Max')]")
	private WebElement sortByMax;

	@FindBy(xpath = "//div[contains(text(),'Sort by Min')]")
	private WebElement sortByMin;

	@FindBy(css = "body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > main:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3)")
	private WebElement sortByCompnayName;

	@FindBy(xpath = "//button[@aria-label='Current Page, Page 1']")
	private WebElement wageRangesPage1;

	@FindBy(css = "#app div:nth-of-type(1) div.compitition-page-content div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) div.v-card.v-sheet.theme--light.elevation-2 div.container div:nth-of-type(2) div:nth-of-type(5) nav ul.v-pagination.theme--light li:nth-of-type(3) button.v-pagination__item")
	private WebElement wageRangesPage2;

	@FindBy(css = "#app div:nth-of-type(1) div.compitition-page-content div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) div.v-card.v-sheet.theme--light.elevation-2 div.container div:nth-of-type(2) div:nth-of-type(5) nav ul.v-pagination.theme--light li:nth-of-type(4) button.v-pagination__item")
	private WebElement wageRangesPage3;

	@FindBy(css = "button[aria-label='Goto Page 4']")
	private WebElement wageRangesPage4;

	@FindBy(css = "#app div:nth-of-type(1) div.compitition-page-content div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) div.v-card.v-sheet.theme--light.elevation-2 div.container div:nth-of-type(2) div:nth-of-type(5) nav ul.v-pagination.theme--light li:nth-of-type(6) button.v-pagination__item")
	private WebElement wageRangesPage5;

	@FindBy(css = "#app div:nth-of-type(1) div.compitition-page-content div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) div.v-card.v-sheet.theme--light.elevation-2 div.container div:nth-of-type(2) div:nth-of-type(5) nav ul.v-pagination.theme--light li:nth-of-type(7) button.v-pagination__item")
	private WebElement wageRangesPage6;

	@FindBy(xpath = "//div[@role='radiogroup']")
	private List<WebElement> radioButtons;

	@FindBy(xpath = "//div[@class='compitition-page-content']")
	private WebElement entirePage;

	@FindBy(xpath = "//div[@class='search-toolbar sidebar-container md-scrollbar']")
	private WebElement filterElement;

	public void setJsExecutor(JavascriptExecutor jsExecutor) {
		this.jsExecutor = jsExecutor;
	}

	/**
	 * Initilize driver
	 */

	public CompetitionPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public CompetitionPage(WebDriver driver) {
		this();
		this.driver = Keyword.driver;
		 jsExecutor = Keyword.driver;
		// Initialize the JavascriptExecutor
		if (driver instanceof JavascriptExecutor) {
            jsExecutor = (JavascriptExecutor) driver;
        } else {
            throw new IllegalStateException("This driver does not support Javascript execution.");
        }
	}

	public CompetitionPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	/*
	 * public CompetitionPage(WebDriver driver, Map<String, String> data, int 
	 */

	/**
	 * Navigate to Cometition Page Header.
	 * 
	 * @return
	 */
	public void clickCompetitionLink() {
		Keyword.fWaitForvisibilityOfElementLocated(competition);
		competition.click();
	}

	/**
	 * Method for selecting Time Frame (Need to add calender selction) Created
	 * another method and used switch to case to select all the options like, Prior
	 * 30 Days, Last Month, Prior 3 months, prior 6 months, prior, 12 months.
	 * selectDateRange - method name
	 */

	public void clickSelectTimeFrame() {
		Keyword.fWaitForvisibilityOfElementLocated(radioGroupTimeFrame);
		radioGroupTimeFrame.click();
	}

	/**
	 * Drop Down methods
	 */
	public void timeFrameDropDown() {
		timedramedropdownrrow.click();
	}

	public void jobTypeDropDown() {
		jobtypedropdownarrow.click();
	}

	public void postingdrivertypeDropDown() {
		postingdrivertype.click();
	}

	public void clickSoloOrTeamDropDownArrow() {
		clickOnSoloOrTeam.click();
	}

	public void clickPostingRouteTypeDropDown() {
		postingRouteType.click();
	}

	public void clickpostingHaulTypeDropDown() {
		postingHaulType.click();
	}

	/**
	 * Search Buttons
	 */
	public void clickFilterSearchButton() {
		filterSearchButton.click();
	}

	public void clickSearchLocationButton() {
		Keyword.fWaitForvisibilityOfElementLocated(locationSearchButton);
		locationSearchButton.click();
		Keyword.wait(5000);
	}

	public void clickUpdateSearchButton() {
		Keyword.fWaitForvisibilityOfElementLocated(locationUpdateSearchButton);
		locationUpdateSearchButton.click();
	}

	/**
	 * Radius Functionality
	 */

	public void clickRadius() {
		if (jsExecutor != null) {
			jsExecutor.executeScript("let div_wrapper = document.getElementsByClassName('location-search-radius')[0];"
					+ "let search_radius = div_wrapper.getElementsByTagName('p')[0];" + "search_radius.click();");
		} else {
			throw new IllegalStateException("Please check Exception");
		}
	}

	public void enterRadius(String radius) {
		Keyword.fWaitForvisibilityOfElementLocated(clickOnRadiusSelectionText);
		clickOnRadiusSelectionText.sendKeys(Keys.CONTROL + "a");
		clickOnRadiusSelectionText.sendKeys(Keys.DELETE);
		clickOnRadiusSelectionText.sendKeys(radius);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterRadiusLocation(String locality) {
		locationInput.sendKeys(locality);
	}

	public void selectRadiusLocation(String locality, String province) {
		Keyword.wait(5000);
		String suggestionXPath = String.format(".//li/a/div/div[contains(., '%s') and contains(., '%s')]", locality,
				province);
		Keyword.wait(10000);
		WebElement suggestionElement = suggestionsDropdown.findElement(By.xpath(suggestionXPath));
		Keyword.wait(5000);
		suggestionElement.click();
	}

	public void clickGreenCheckMark() {
		Keyword.wait(5000);
		radiusGreenCheck.click();
	}
	
    public String getSelectedCountyText() {
        return infoHeading.getText();
    }

	public void clickAcceptButton() {
		Keyword.wait(5000);
		buttonAccept.click();
	}

	public void deleteRadiusLocation() {
		deleteRadiusLocation.click();
	}

	public void editRadius(String radius) {
		radiusEdit.click();
		Keyword.fWaitForvisibilityOfElementLocated(radiusEdit);
		radiusEdit.sendKeys(Keys.CONTROL + "a");
		radiusEdit.sendKeys(Keys.DELETE);
		radiusEdit.sendKeys(radius);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void travelExplore() {
		showOnMapRadius.click();
	}

	public void clickonstatesubtitle() {
		Keyword.fWaitForvisibilityOfElementLocated(clickonstate);
		clickonstate.click();
	}

	/**
	 * Must Include Radio buttons to all elements Posting Driver Type
	 */

	public void clickCompanyDriver() {
		companyDriver.click();
	}

	public void clickOwnerOperator() {
		ownerOperator.click();
	}

	public void clickLeasePurchase() {
		leasePurchase.click();
	}

	public void clickStudentDriver() {
		studentDriver.click();
	}

	public void clickYardJockey() {
		yardJockey.click();
	}

	/**
	 * Solo or Team Position
	 */
	public void clickSolo() {
		solo.click();
	}

	public void clickTeam() {
		team.click();
	}

	/**
	 * Posting Route Type
	 */
	public void clickLocal() {
		local.click();
	}

	public void clickRegional() {
		regional.click();
	}

	public void clickOverTheRoad() {
		overTheRoad.click();
	}

	public void clickDedicated() {
		dedicated.click();
	}

	/**
	 * Posting Haul Type
	 */
	public void clickDryVan() {
		dryVan.click();
	}

	public void clickFlatBed() {
		flatBed.click();
	}

	public void clickRefrigerated() {
		refrigerated.click();
	}

	public void clickHazmat() {
		hazmat.click();
	}

	public void clickTanker() {
		tanker.click();
	}

	public void clickLTL() {
		lTL.click();
	}

	public void clickAutoHauler() {
		autoHauler.click();
	}

	public void clickDoublesTriples() {
		doublesTriples.click();
	}

	public void clickHeavyHaulSpecialized() {
		heavyHaulSpecialized.click();
	}

	public void clickPowerOnly() {
		powerOnly.click();
	}

	// Location search
	public void locationSearchTextField() {
		locationSearch.click();
	}

	public void clearFilters() {
		clearAllFilters.click();
	}

	public void clearSingleFilter() {
		clickOnXToClearFilter.click();
	}

	public void timeFrameYearly() throws AWTException {
		Robot robot = new Robot();
		robot.mouseWheel(1000);
		Keyword.wait(5000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) Keyword.driver;
		if (jsExecutor != null) {
			jsExecutor.executeScript("let xpath = \"//label[text()='Yearly']\";"
					+ "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
					+ "let yearlyRadioButton = result.singleNodeValue;"
					+ "if (yearlyRadioButton) { yearlyRadioButton.click(); }");
		} else {
			throw new IllegalStateException("JavascriptExecutor is not initialized");
		}
	}

	public void timeFrameWeekly() throws AWTException {
		Robot robot = new Robot();
		robot.mouseWheel(1000);
		Keyword.wait(5000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) Keyword.driver;
		if (jsExecutor != null) {
			jsExecutor.executeScript("let xpath = \"//label[text()='Weekly']\";"
					+ "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
					+ "let weeklyRadioButton = result.singleNodeValue;"
					+ "if (weeklyRadioButton) { weeklyRadioButton.click(); }");
		} else {
			throw new IllegalStateException("JavascriptExecutor is not initialized");
		}
		Keyword.wait(5000);
	}

	public void timeFrameHourly() throws AWTException {
		Robot robot = new Robot();
		robot.mouseWheel(1000);
		Keyword.wait(5000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) Keyword.driver;
		if (jsExecutor != null) {
			jsExecutor.executeScript("let xpath = \"//label[text()='Hourly']\";"
					+ "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
					+ "let hourlyRadioButton = result.singleNodeValue;"
					+ "if (hourlyRadioButton) { hourlyRadioButton.click(); }");
		} else {
			throw new IllegalStateException("JavascriptExecutor is not initialized");
		}
		Keyword.wait(5000);
	}

	public void timeFrameCPM() throws AWTException {
		Robot robot = new Robot();
		robot.mouseWheel(1000);
		Keyword.wait(5000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) Keyword.driver;
		if (jsExecutor != null) {
			jsExecutor.executeScript("let xpath = \"//label[text()='CPM']\";"
					+ "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
					+ "let cpmRadioButton = result.singleNodeValue;"
					+ "if (cpmRadioButton) { cpmRadioButton.click(); }");
		} else {
			throw new IllegalStateException("JavascriptExecutor is not initialized");
		}
		Keyword.wait(5000);
	}

	public void sortCompanyNames() {
		companyNameSort.click();
	}

	public void sortMaxCompany() {
		sortByMax.click();
	}

	public void sortMinCompany() {
		sortByMin.click();
	}

	public void companyName() {
		sortByCompnayName.click();
	}

	/**
	 * Methods to click on page numbers in Advertise wage Range section
	 */
	public void clickpage1() {
		wageRangesPage1.click();
	}

	public void clickPage2() {
		wageRangesPage2.click();
	}

	public void clickPage3() {
		wageRangesPage3.click();
	}

	public void clickPage4() {
		wageRangesPage4.click();
	}

	public void clickPage5() {
		wageRangesPage5.click();
	}

	public void clickPage6() {
		wageRangesPage6.click();
	}

	public void clickUpdateDataButton() {
		clickOnUpdateData.click();
	}

	public CompetitionPage setDateFromTextField() {
		return setDateFromTextField(data.get("DATE_FROM"));
	}

	public CompetitionPage setDateToTextField() {
		return setDateToTextField(data.get("DATE_TO"));
	}

	public CompetitionPage setDateFromTextField(String dateFromValue) {
//		Keyword.fWaitForvisibilityOfElementLocated(dateFrom);
		Keyword.wait(5000);
		dateFrom.click();
		dateFrom.sendKeys(dateFromValue);
		return this;
	}

	public CompetitionPage setDateToTextField(String dateToValue) {
//		Keyword.fWaitForvisibilityOfElementLocated(dateTo);
		Keyword.wait(5000);
		dateTo.click();
		dateTo.sendKeys(dateToValue);
		return this;
	}

	public void setLastMonthRadioButtonField() {
		lastMonth.click();
	}

	public void enterLocation(String locality) throws InterruptedException {
		Keyword.fWaitForvisibilityOfElementLocated(locationSearch);
		locationSearch.sendKeys(locality);
		Thread.sleep(10000);
	}

//	To select the Location and State
	public void selectLocationAndProvince(String locality, String province) throws InterruptedException {
		List<WebElement> listOfLocat = Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div"));
		for (int i = 1; i < listOfLocat.size(); i++) {
			if ((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[1]")).getText()
					.contains(locality))
					&& (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[2]"))
							.getText().equals(province))) {
//				System.out.println((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div[1]")).getText() + 
//						(Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div/div[2]")).getText())));
				Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[1]")).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

//	To Select location with MSA
	public void selectLocationAndMSA(String locality, String province) throws InterruptedException {
		List<WebElement> listOfLocat = Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div"));
		for (int i = 1; i < listOfLocat.size(); i++) {
			if ((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[1]")).getText()
					.contains(locality))
					&& (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[2]"))
							.getText().equals(province))) {
//			System.out.println((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div[1]")).getText() + 
//					(Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div/div[2]")).getText())));
				Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[1]")).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

	// Location and City
	public void selectLocationAndCity(String locality, String city) throws InterruptedException {
		List<WebElement> listOfLocat = Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div"));
		for (int i = 1; i < listOfLocat.size(); i++) {
			if ((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[1]")).getText()
					.contains(locality))
					&& (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div/div[2]"))
							.getText().equals(city))) {
//				System.out.println((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div[1]")).getText() + 
//						(Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div/div[2]")).getText())));
				Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i + "]/div/div/div[1]")).click();
				break;
			}
		}
		Thread.sleep(5000);
	}

	public void click() {
		locationSearch.click();
	}

	public void selectDateRange(String option, String button) {
		radioGroupTimeFrame.click();
		WebElement dateRangeOption = null;
		switch (option) {
		case "Prior 30 Days":
			dateRangeOption = prior30Days;
			break;
		case "Last Month":
			dateRangeOption = lastMonth;
			break;
		case "Past 3 Months":
			dateRangeOption = past3Months;
			break;
		case "Past 6 Months":
			dateRangeOption = past6Months;
			break;
		case "Past 12 Months":
			dateRangeOption = past12Months;
			break;
		default:
			throw new IllegalArgumentException("Invalid date range option: " + option);
		}
		dateRangeOption.click();
	}

	public static void screenshot(String filePath, int scenarioNumber) {
		// Capture the entire page screenshot
		Keyword.wait(10000);
		File srcFile = ((TakesScreenshot) Keyword.driver).getScreenshotAs(OutputType.FILE);
		try {
			// Create the file name using the scenario number and timestamp
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmm");
			String timestamp = dateFormat.format(new Date());
			String screenshotPath = "C:\\Users\\Arun\\Downloads\\ScreenShot\\Strategize_QA\\";
			String fileName = screenshotPath + "Scenario_" + scenarioNumber + "_" + timestamp + ".png";
			FileUtils.copyFile(srcFile, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void scrollWindow(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
	}

	public static void scrollAndClick(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		jsExecutor.executeScript("arguments[0].click();", element);
	}

}