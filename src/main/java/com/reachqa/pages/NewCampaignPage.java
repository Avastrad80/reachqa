package com.reachqa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.reachqa.Keyword;

import io.cucumber.core.filter.Filters;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.manager.SeleniumManagerJsonOutput.Result;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewCampaignPage {

	private Map<String, String> data;
	// private int timeout = 15;
	private WebDriver driver;
	private JavascriptExecutor jsExecutor;

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

	@FindBy(id = "add-campaign-button")
	private WebElement newcampaign;

	/**
	 * Campaign Info
	 * 
	 * @author Arun
	 */
	@FindBy(xpath = "//input[@id='company-search']")
	private WebElement company;

	@FindBy(xpath = "//input[@id='agency-search']")
	private WebElement agency;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement campaignName;

	@FindBy(xpath = "//input[@value='Lead Generation']")
	private WebElement leadGeneration;

	@FindBy(xpath = "//input[@value='Website Traffic']")
	private WebElement websiteTraffic;

	@FindBy(xpath = "//input[@value='Branding']")
	private WebElement branding;

	@FindBy(xpath = "//input[@id='Phone Calls']")
	private WebElement phoneCalls;

	@FindBy(xpath = "//input[@id='Short Forms']")
	private WebElement shortForms;

	@FindBy(xpath = "//input[@id='Clicks']")
	private WebElement clicks;

	@FindBy(xpath = "//input[@id='Impressions']")
	private WebElement impressions;

	@FindBy(xpath = "//input[@id='Video Views']")
	private WebElement videoViews;

	@FindBy(xpath = "//input[@name='revenue_per_hire']")
	private WebElement revenuePerHire;

	@FindBy(xpath = "//input[@name='goal_value']")
	private WebElement goalValue;

	@FindBy(xpath = "//input[@value='Landing page built by Randall Reilly']")
	private WebElement trafficDestination;

	@FindBy(xpath = "//input[@value='Client/agency owned website']")
	private WebElement clientAgency;

	@FindBy(xpath = "//input[@placeholder='Ex: www.custom-website.com']")
	private WebElement clientAgencyLink;

	@FindBy(xpath = "//input[@value='Landing Page']")
	private WebElement landingPage;

	@FindBy(xpath = "//input[@value='Creatives']")
	private WebElement creatives;

	@FindBy(xpath = "//input[@value='Ad Copy']")
	private WebElement adCopy;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement realTimeConnectYes;

	@FindBy(xpath = "//input[@value='0']")
	private WebElement realTimeConnectNo;

	@FindBy(xpath = "//textarea[@id='campaign_notes']")
	private WebElement notesTextArea;

	/**
	 * Drop down arrows Time Frame, Job Type, Posting Driver Type, Solo or Team
	 * Position, Posting Route Type, Posting Haul Type.
	 */

	/*
	 * 
	 * public NewCampaignPage() { PageFactory.initElements(Keyword.driver, this); }
	 * 
	 * public NewCampaignPage(WebDriver driver) { this.driver = driver; }
	 * 
	 * 
	 * public NewCampaignPage(WebDriver driver, Map<String, String> data) {
	 * this(driver); this.data = data; }
	 * 
	 * /* public CompetitionPage(WebDriver driver, Map<String, String> data, int
	 * timeout) { this(driver, data); this.timeout = timeout; }
	 * 
	 * public void clickCompetitionLink() { Keyword.wait(5000);
	 * Keyword.fWaitForvisibilityOfElementLocated(newcampaign); newcampaign.click();
	 * }
	 * 
	 * public String getAdvertisedSalaryDistributionChartTitleText() { return
	 * advertisedSalaryTitle.getText(); }
	 * 
	 * public void clickSelectTimeFrame() {
	 * Keyword.fWaitForvisibilityOfElementLocated(radioGroupTimeFrame);
	 * radioGroupTimeFrame.click(); }
	 * 
	 * public void selectDateRange(String option, String button) {
	 * radioGroupTimeFrame.click(); WebElement dateRangeOption = null; switch
	 * (option) { case "Prior 30 Days": dateRangeOption = prior30Days; break; case
	 * "Last Month": dateRangeOption = lastMonth; break; case "Past 3 Months":
	 * dateRangeOption = past3Months; break; case "Past 6 Months": dateRangeOption =
	 * past6Months; break; case "Past 12 Months": dateRangeOption = past12Months;
	 * break; default: throw new
	 * IllegalArgumentException("Invalid date range option: " + option); }
	 * dateRangeOption.click(); }
	 * 
	 * 
	 *//**
		 * Drop Down methods
		 */
	/*
	 * public void timeFrameDropDown() { timedramedropdownrrow.click(); }
	 * 
	 * public void jobTypeDropDown() { jobtypedropdownarrow.click(); }
	 * 
	 * public void postingdrivertypeDropDown() { postingdrivertype.click(); }
	 * 
	 * public void clickSoloOrTeamDropDownArrow() { clickOnSoloOrTeam.click(); }
	 * 
	 * public void clickPostingRouteTypeDropDown() { postingRouteType.click(); }
	 * 
	 * public void clickpostingHaulTypeDropDown() { postingHaulType.click(); }
	 * 
	 *//**
		 * Search Buttons
		 */
	/*
	 * public void clickFilterSearchButton() { filterSearchButton.click(); }
	 * 
	 * public void clickSearchLocationButton() {
	 * Keyword.fWaitForvisibilityOfElementLocated(locationSearchButton);
	 * locationSearchButton.click(); Keyword.wait(5000); }
	 * 
	 * public void clickUpdateSearchButton() {
	 * Keyword.fWaitForvisibilityOfElementLocated(locationUpdateSearchButton);
	 * locationUpdateSearchButton.click(); }
	 * 
	 *//**
		 * Radius Functionality
		 */
	/*
	 * 
	 * public void clickRadius() { if (jsExecutor != null) { jsExecutor.
	 * executeScript("let div_wrapper = document.getElementsByClassName('location-search-radius')[0];"
	 * + "let search_radius = div_wrapper.getElementsByTagName('p')[0];" +
	 * "search_radius.click();"); } else { throw new
	 * IllegalStateException("Please check Exception"); } }
	 * 
	 * public void enterRadius(String radius) {
	 * Keyword.fWaitForvisibilityOfElementLocated(clickOnRadiusSelectionText);
	 * clickOnRadiusSelectionText.sendKeys(Keys.CONTROL + "a");
	 * clickOnRadiusSelectionText.sendKeys(Keys.DELETE);
	 * clickOnRadiusSelectionText.sendKeys(radius); try { Thread.sleep(2000); }
	 * catch (InterruptedException e) { e.printStackTrace(); } }
	 * 
	 * public void enterRadiusLocation(String locality) {
	 * locationInput.sendKeys(locality); }
	 * 
	 * public void selectRadiusLocation(String locality, String province) {
	 * Keyword.wait(5000); String suggestionXPath =
	 * String.format(".//li/a/div/div[contains(., '%s') and contains(., '%s')]",
	 * locality, province); Keyword.wait(10000); WebElement suggestionElement =
	 * suggestionsDropdown.findElement(By.xpath(suggestionXPath));
	 * Keyword.wait(5000); suggestionElement.click(); }
	 * 
	 * public void clickGreenCheckMark() { Keyword.wait(5000);
	 * radiusGreenCheck.click(); }
	 * 
	 * public String getSelectedCountyText() { return infoHeading.getText(); }
	 * 
	 * public void clickAcceptButton() { Keyword.wait(5000); buttonAccept.click(); }
	 * 
	 * public void deleteRadiusLocation() { deleteRadiusLocation.click(); }
	 * 
	 * public void editRadius(String radius) { radiusEdit.click();
	 * Keyword.fWaitForvisibilityOfElementLocated(radiusEdit);
	 * radiusEdit.sendKeys(Keys.CONTROL + "a"); radiusEdit.sendKeys(Keys.DELETE);
	 * radiusEdit.sendKeys(radius); try { Thread.sleep(2000); } catch
	 * (InterruptedException e) {
	 * 
	 * e.printStackTrace(); } }
	 * 
	 * public void travelExplore() { showOnMapRadius.click(); }
	 * 
	 *//**
		 * Must Include Radio buttons to all elements Posting Driver Type
		 */
	/*
	 * 
	 * public void selectJobType(String jobType) { // Select the desired job type
	 * from the dropdown. if (jobType.equals("Company Driver")) {
	 * driver.findElement(By.xpath("//label[text()='Company Driver']")).click(); }
	 * else if (jobType.equals("Owner-Operator")) {
	 * driver.findElement(By.xpath("//label[text()='Owner-Operator']")).click(); }
	 * else if (jobType.equals("Lease Purchase")) {
	 * driver.findElement(By.xpath("//label[text()='Lease Purchase']")).click(); }
	 * else if (jobType.equals("Student Driver")) {
	 * driver.findElement(By.xpath("//label[text()='Student Driver']")).click(); }
	 * else if (jobType.equals("Yard Jockey")) {
	 * driver.findElement(By.xpath("//label[text()='Yard Jockey']")).click(); } }
	 * 
	 *//**
		 * Solo or Team Position
		 */
	/*
	 * public void selectSoloOrTeam(String soloOrTeam) { Keyword.wait(2500); //
	 * Select the desired solo or team option. if (soloOrTeam.equals("Solo")) {
	 * driver.findElement(By.xpath("//label[text()='Solo']")).click(); } else if
	 * (soloOrTeam.equals("Team")) {
	 * driver.findElement(By.xpath("//label[text()='Team']")).click(); } }
	 * 
	 *//**
		 * Posting Route Type
		 */
	/*
	 * public void selectRouteType(String routeType) { // Select the desired route
	 * type. if (routeType.equals("Local")) { local.click(); } else if
	 * (routeType.equals("Regional")) { regional.click(); } else if
	 * (routeType.equals("Over the Road")) { overTheRoad.click(); } else if
	 * (routeType.equals("Dedicated")) { dedicated.click(); } }
	 * 
	 *//**
		 * Posting Haul Type
		 */
	/*
	 * public void selectHaulType(String haulType) { // Select the desired haul
	 * type. if (haulType.equals("Dry Van")) { dryVan.click(); } else if
	 * (haulType.equals("Flatbed")) { flatBed.click(); } else if
	 * (haulType.equals("Refrigerated")) { refrigerated.click(); } else if
	 * (haulType.equals("Hazmat")) { hazmat.click(); } else if
	 * (haulType.equals("Tanker")) { tanker.click(); } else if
	 * (haulType.equals("LTL")) { lTL.click(); } else if
	 * (haulType.equals("Auto Hauler")) { autoHauler.click(); } else if
	 * (haulType.equals("Doubles / Triples")) { doublesTriples.click(); } else if
	 * (haulType.equals("Heavy Haul / Specialized")) { heavyHaulSpecialized.click();
	 * } else if (haulType.equals("Power Only")) { powerOnly.click(); } }
	 * 
	 * // Location search public void locationSearchTextField() {
	 * locationSearch.click(); }
	 * 
	 * public void clearFilters() { clearAllFilters.click(); }
	 * 
	 * public void clearSingleFilter() { clickOnXToClearFilter.click(); }
	 * 
	 *//**
		 * advertised-salary-distribution
		 * 
		 * @throws AWTException
		 */
	/*
	 * public void timeFrameYearly() throws AWTException { Robot robot = new
	 * Robot(); robot.mouseWheel(1000); Keyword.wait(5000); JavascriptExecutor
	 * jsExecutor = (JavascriptExecutor) Keyword.driver; if (jsExecutor != null) {
	 * jsExecutor.executeScript("let xpath = \"//label[text()='Yearly']\";" +
	 * "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
	 * + "let yearlyRadioButton = result.singleNodeValue;" +
	 * "if (yearlyRadioButton) { yearlyRadioButton.click(); }"); } else { throw new
	 * IllegalStateException("JavascriptExecutor is not initialized"); } }
	 * 
	 * public void timeFrameWeekly() throws AWTException { Robot robot = new
	 * Robot(); robot.mouseWheel(1000); Keyword.wait(5000); JavascriptExecutor
	 * jsExecutor = (JavascriptExecutor) Keyword.driver; if (jsExecutor != null) {
	 * jsExecutor.executeScript("let xpath = \"//label[text()='Weekly']\";" +
	 * "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
	 * + "let weeklyRadioButton = result.singleNodeValue;" +
	 * "if (weeklyRadioButton) { weeklyRadioButton.click(); }"); } else { throw new
	 * IllegalStateException("JavascriptExecutor is not initialized"); }
	 * Keyword.wait(5000); }
	 * 
	 * public void timeFrameHourly() throws AWTException { Robot robot = new
	 * Robot(); robot.mouseWheel(1000); Keyword.wait(5000); JavascriptExecutor
	 * jsExecutor = (JavascriptExecutor) Keyword.driver; if (jsExecutor != null) {
	 * jsExecutor.executeScript("let xpath = \"//label[text()='Hourly']\";" +
	 * "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
	 * + "let hourlyRadioButton = result.singleNodeValue;" +
	 * "if (hourlyRadioButton) { hourlyRadioButton.click(); }"); } else { throw new
	 * IllegalStateException("JavascriptExecutor is not initialized"); }
	 * Keyword.wait(5000); }
	 * 
	 * public void timeFrameCPM() throws AWTException { Robot robot = new Robot();
	 * robot.mouseWheel(1000); Keyword.wait(5000); JavascriptExecutor jsExecutor =
	 * (JavascriptExecutor) Keyword.driver; if (jsExecutor != null) {
	 * jsExecutor.executeScript("let xpath = \"//label[text()='CPM']\";" +
	 * "let result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null);"
	 * + "let cpmRadioButton = result.singleNodeValue;" +
	 * "if (cpmRadioButton) { cpmRadioButton.click(); }"); } else { throw new
	 * IllegalStateException("JavascriptExecutor is not initialized"); }
	 * Keyword.wait(5000); }
	 * 
	 * public void sortCompanyNames() { companyNameSort.click(); }
	 * 
	 * public void sortMaxCompany() { sortByMax.click(); }
	 * 
	 * public void sortMinCompany() { sortByMin.click(); }
	 * 
	 * public void companyName() { sortByCompnayName.click(); }
	 * 
	 *//**
		 * Methods to click on page numbers in Advertise wage Range section
		 *//*
			 * public void clickpage1() { wageRangesPage1.click(); }
			 * 
			 * public void clickPage2() { wageRangesPage2.click(); }
			 * 
			 * public void clickPage3() { wageRangesPage3.click(); }
			 * 
			 * public void clickPage4() { wageRangesPage4.click(); }
			 * 
			 * public void clickPage5() { wageRangesPage5.click(); }
			 * 
			 * public void clickPage6() { wageRangesPage6.click(); }
			 * 
			 * public void clickUpdateDataButton() { clickOnUpdateData.click(); }
			 * 
			 * public NewCampaignPage setDateFromTextField() { return
			 * setDateFromTextField(data.get("DATE_FROM")); }
			 * 
			 * public NewCampaignPage setDateToTextField() { return
			 * setDateToTextField(data.get("DATE_TO")); }
			 * 
			 * public NewCampaignPage setDateFromTextField(String dateFromValue) {
			 * 
			 * Keyword.wait(5000); dateFrom.click(); dateFrom.sendKeys(dateFromValue);
			 * return this; }
			 * 
			 * public NewCampaignPage setDateToTextField(String dateToValue) {
			 * 
			 * Keyword.wait(5000); dateTo.click(); dateTo.sendKeys(dateToValue); return
			 * this; }
			 * 
			 * public void setLastMonthRadioButtonField() { lastMonth.click(); }
			 * 
			 * public void enterLocation(String locality) throws InterruptedException {
			 * Keyword.fWaitForvisibilityOfElementLocated(locationSearch);
			 * locationSearch.sendKeys(locality); Thread.sleep(10000); }
			 * 
			 * // To select the Location and State public void
			 * selectLocationAndProvince(String locality, String province) throws
			 * InterruptedException { List<WebElement> listOfLocat =
			 * Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div")); for (int
			 * i = 1; i < listOfLocat.size(); i++) { if
			 * ((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[1]")).getText() .contains(locality)) &&
			 * (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[2]")) .getText().equals(province))) {
			 * Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[1]")).click(); break; } } Thread.sleep(5000); }
			 * 
			 * // To Select location with MSA public void selectLocationAndMSA(String
			 * locality, String province) throws InterruptedException { List<WebElement>
			 * listOfLocat =
			 * Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div")); for (int
			 * i = 1; i < listOfLocat.size(); i++) { if
			 * ((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[1]")).getText() .contains(locality)) &&
			 * (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[2]")) .getText().equals(province))) {
			 * 
			 * Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[1]")).click(); break; } } Thread.sleep(5000); }
			 * 
			 * // Location and City public void selectLocationAndCity(String locality,
			 * String city) throws InterruptedException { List<WebElement> listOfLocat =
			 * Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div")); for (int
			 * i = 1; i < listOfLocat.size(); i++) { if
			 * ((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[1]")).getText() .contains(locality)) &&
			 * (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div/div[2]")) .getText().equals(city))) {
			 * 
			 * Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" + i +
			 * "]/div/div/div[1]")).click(); break; } } Thread.sleep(5000); }
			 * 
			 * public void click() { locationSearch.click(); }
			 * 
			 * 
			 * public static void screenshot(String filePath, int scenarioNumber) { //
			 * Capture the entire page screenshot Keyword.wait(10000); File srcFile =
			 * ((TakesScreenshot) Keyword.driver).getScreenshotAs(OutputType.FILE); try { //
			 * Create the file name using the scenario number and timestamp SimpleDateFormat
			 * dateFormat = new SimpleDateFormat("ddMMyyyy_HHmm"); String timestamp =
			 * dateFormat.format(new Date()); String screenshotPath =
			 * "C:\\Users\\Arun\\Downloads\\ScreenShot\\Strategize_QA\\"; String fileName =
			 * screenshotPath + "Scenario_" + scenarioNumber + "_" + timestamp + ".png";
			 * FileUtils.copyFile(srcFile, new File(fileName)); } catch (IOException e) {
			 * e.printStackTrace(); } }
			 * 
			 * public static void scrollWindow(WebDriver driver, int x, int y) {
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(" + x + ", " + y + ");"); }
			 * 
			 * public static void scrollAndClick(WebDriver driver, WebElement element) {
			 * JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			 * jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			 * jsExecutor.executeScript("arguments[0].click();", element); }
			 * 
			 * public boolean isTimeFrameOptionVisible(String optionText) { WebElement
			 * option = driver.findElement(By.xpath("//your/xpath/here")); // Replace with
			 * actual XPath return option.isDisplayed(); }
			 * 
			 * // Method to verify if the competition page is loaded public boolean
			 * isCompetitionPageLoaded() { // Implement logic to verify page load using
			 * expected elements or conditions // For example, you can check if a specific
			 * element is present on the page WebElement pageTitle =
			 * driver.findElement(By.xpath("//h1[contains(text(),'Competition Page')]")); //
			 * Replace with actual XPath return pageTitle.isDisplayed(); }
			 * 
			 * // Method to get the Filters object representing the filter section public
			 * Filters getFilters() { // Assuming you have a Filters class representing the
			 * filter section // You can create an instance of the Filters class and return
			 * it return new Filters(null); }
			 * 
			 * // Method to get the Result object representing the result section public
			 * Result getResult() { // Assuming you have a Result class representing the
			 * result section // You can create an instance of the Result class and return
			 * it return new Result();
			 */
}
