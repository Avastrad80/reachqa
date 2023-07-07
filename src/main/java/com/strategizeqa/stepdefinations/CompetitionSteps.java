package com.strategizeqa.stepdefinations;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import com.strategizeqa.Keyword;
import com.strategizeqa.pages.CompetitionPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompetitionSteps {

	
	private CompetitionPage competitionPage = new CompetitionPage();
	private static final Logger LOG = Logger.getLogger(CompetitionSteps.class);
	
	// Navigate to competition page
	@Given("I am on the competition page")
	public void navigateTocompetitionPage() {
		competitionPage.clickCompetitionLink();
	}

	// Enter Location Name
	@When("I enter location as {string} in location input box")
	public void i_enter_in_location_input_box(String string) throws InterruptedException {
		competitionPage.click();
//		locations.clickClearButton();
		competitionPage.enterLocation(string);
	}

	// select Location and state
	@When("I select {string} location and {string} state")
	public void i_select_and(String string, String string1) throws InterruptedException {
		competitionPage.selectLocationAndProvince(string, string1);
	}

	// select Location and MSA
	@When("I select {string} location and {string} as msa")
	public void i_select_and_msa(String string, String string1) throws InterruptedException {
		competitionPage.selectLocationAndProvince(string, string1);
	}

	// select Location and city
	@When("I select {string} location and {string} as city")
	public void i_select_and_city(String string, String string1) throws InterruptedException {
		competitionPage.selectLocationAndCity(string, string1);
	}

	// Select TimeFrame
	@And("I select {string} timeframe")
	public void select_timeframe(String option) {
		competitionPage.selectDateRange(option, "Search");
	}

	// Select Date Range
	@When("I set the date range from {string} to {string}")
	public void set_date_range(String fromDate, String toDate) {
		competitionPage.setDateFromTextField(fromDate);
		competitionPage.setDateToTextField(toDate);
	}

	// Drop down selection
	@Then("I click on Timeframe filter to hide Posting Date")
	public void clickTimeFrame() {
		competitionPage.timeFrameDropDown();
	}

	// Hide All Job Type Filters
	@Then("I click on Job Type  filter to hide all job type filters")
	public void clickJobType() {
		competitionPage.jobTypeDropDown();
	}

	/**
	 * Posting Driver Type {Company Driver, Owner-Operator, Lease Purchase, Student Driver, Yard Jockey}
	 * 
	 */
	@Then("I click on posting driver Header")
	public void clickPostingDriverType() {
		competitionPage.postingdrivertypeDropDown();
	}
	
	@When("I select Posting Driver Type as Company Driver")
	public void clickCompanyDriver() {
		competitionPage.clickCompanyDriver();
	}

	@And("I select Posting Driver Type as Owner Operator")
	public void clickOwnerOperator() {
		competitionPage.clickOwnerOperator();
	}

	@And("I select Posting Driver Type as Student Driver")
	public void clickStudentDriver() {
		competitionPage.clickStudentDriver();
	}

	@And("I select Posting Driver Type as Lease Purchase")
	public void clickLeasePurchase() {
		competitionPage.clickLeasePurchase();
	}

	@And("I select Posting Driver Type as Yard Jockey")
	public void clickYardJockey() {
		competitionPage.clickYardJockey();
	}

	/**
	 * Solo Or Team Position{ Solo, Team}
	 * 
	 */
	@Then("I click on Solo Team Header")
	public void clickSoloOrTeam() {
		competitionPage.clickSoloOrTeamDropDownArrow();
	}
	
	@And("I select Solo or Team Position as Solo")
	public void clickSolo() {
		competitionPage.clickSolo();
	}

	@And("I select Solo or Team Position as Team")
	public void clickTeam() {
		competitionPage.clickTeam();
	}

	/**
	 * Posting Route Type{Local, Regional, Over the Road, Dedicated}
	 * 
	 */
	@Then("I click on Posting Route Type Drop Down")
	public void clickPostingRouteType() {
		competitionPage.clickPostingRouteTypeDropDown();
	}
	
	@When("I select Posting Route Type as Local")
	public void clickLocal() {
		competitionPage.clickLocal();
	}

	@When("I select Posting Route Type as Regional")
	public void clickRegional() {
		competitionPage.clickRegional();
	}

	@When("I select Posting Route Type as Over The Road")
	public void clickOverTheRoad() {
		competitionPage.clickOverTheRoad();
	}

	@When("I select Posting Route Type as Dedicated")
	public void clickDedicated() {
		competitionPage.clickDedicated();
	}

	/**
	 * Posting Haul Type
	 * {Dry Van, Flat bed, Refrigerated, Hazmat, Tanker, LTL, Auto Hauler, Doubles / Triples, Heavy Haul / Specialized, Power Only}
	 * 
	 */
	@Then("I click on Posting Haul Type Header")
	public void clickPostingHaulType() {
		competitionPage.clickpostingHaulTypeDropDown();
	}
	
	@When("I select Haul Type as Dry Van")
	public void clickDryVan() {
		competitionPage.clickDryVan();
	}

	@When("I select Haul Type as Flatbed")
	public void clickFlatBed() {
		competitionPage.clickFlatBed();
	}

	@When("I select Haul Type as Refrigerated")
	public void clickRefrigerated() {
		competitionPage.clickRefrigerated();
	}

	@When("I select Haul Type as Hazmat")
	public void clickHazmat() {
		competitionPage.clickHazmat();
	}

	@When("I select Haul Type as Tanker")
	public void clickTanker() {
		competitionPage.clickTanker();
	}

	@When("I select Haul Type as LTL")
	public void clickLTL() {
		competitionPage.clickLTL();
	}

	@When("I select Haul Type as Auto Hauler")
	public void clickAutoHauler() {
		competitionPage.clickAutoHauler();
	}

	@When("I select Haul Type as Doubles Triples")
	public void clickDoublesTriples() {
		competitionPage.clickDoublesTriples();
	}

	@When("I select Haul Type as Heavy Haul Specialized")
	public void clickHeavyHaulSpecialized() {
		competitionPage.clickHeavyHaulSpecialized();
	}

	@When("I select Haul Type as Power Only")
	public void clickPowerOnly() {
		competitionPage.clickPowerOnly();
	}

	/**
	 * Search Text box, Click on Search button, Update Search Button, Clear All
	 * Filters, Clear single Filter, Search By Radius functionality.
	 */
	@And("I click on Search Button")
	public void searchLocation() {
		competitionPage.clickSearchLocationButton();
	}

	@Then("I click on Update Search Button")
	public void updateSearchLocation() {
		competitionPage.clickUpdateSearchButton();
	}

	@When("I click on the location search field")
	public void clickLocationSearchTextField() {
		competitionPage.locationSearchTextField();
	}

	@Then("I click  Clear All Filters")
	public void clearAllFilters() {
		competitionPage.clearFilters();
	}

	@When("I clear a {string} filter")
	public void clickOnXToClearFilter() {
		competitionPage.clearSingleFilter();
	}

	/**
	 * Search By Radius
	 */
	@And("I click on the search by radius")
	public void clickOnSearchRadiusButton() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) Keyword.driver;
		competitionPage.setJsExecutor(jsExecutor);
		competitionPage.clickRadius();
	}

	@When("I enter in radius location as {string} in location input box")
	public void whenIEnterInRadiusLocation(String locality) {
		competitionPage.enterRadiusLocation(locality);
	}

	@And("I select radius {string} location and {string}")
	public void andISelectRadiusLocationAndProvince(String locality, String province) {
		competitionPage.selectRadiusLocation(locality, province);
	}

	@And("I enter the radius {string} miles")
	public void i_enter_the_radius_miles(String radius) {
		competitionPage.enterRadius(radius);
	}

	@And("I click the green check mark")
	public void clickGreenCheckMark() {
		competitionPage.clickGreenCheckMark();
	}

	@And("I click the accept button")
	public void clickAcceptButton() {
		competitionPage.clickAcceptButton();
	}
	
	@Then("I verify that at least one county is selected")
	public void verifyAtLeastOneCountySelected() {
	    String countyText = competitionPage.getSelectedCountyText();
	    String[] parts = countyText.split(" ");
	    int selectedCount = Integer.parseInt(parts[0]);
	    Assert.assertTrue("No counties are selected", selectedCount >= 1);
	}

	@And("I delete the radius location")
	public void deleteRadiusLocation() {
		competitionPage.deleteRadiusLocation();
	}

	@And("I edit the radius {string} miles")
	public void editRadius(String radius) {
		competitionPage.editRadius(radius);
	}

	@And("I travel and explore")
	public void travelExplore() {
		competitionPage.travelExplore();
	}

	@And("I click on subtitle {string}")
	public void subtitlestate() {
		competitionPage.clickonstatesubtitle();
	}

	/**
	 * Select Time Frame from Advertised Salary Distribution
	 * 
	 * @param timeFrame
	 */

	@When("I select Wage Timeframe Selector as Yearly")
	public void timeFrameYearly() throws AWTException {
		competitionPage.timeFrameYearly();
	}

	@When("I select Wage Timeframe Selector as Weekly")
	public void selectWageTimeframeSelectorAsWeekly() throws AWTException {
		competitionPage.timeFrameWeekly();
	}

	@When("I select Wage Timeframe Selector as Hourly")
	public void timeFrameHourly() throws AWTException {
		competitionPage.timeFrameHourly();
	}

	@When("I select Wage Timeframe Selector as CPM")
	public void timeFrameCPM() throws AWTException {
		competitionPage.timeFrameCPM();
	}

	/**
	 * Sort by Max, Min, Company Name in Advertised Wage Ranges by Company
	 */
	@When("I click on the sort by company names button")
	public void clickOnSortByCompanyNamesButton() {
		competitionPage.sortCompanyNames();
	}

	@When("I click on the sort by max button")
	public void clickOnSortByMaxButton() {
		competitionPage.sortMaxCompany();
	}

	@When("I click on the sort by min button")
	public void clickOnSortByMinButton() {
		competitionPage.sortMinCompany();
	}

	@When("I click on the company name button")
	public void clickOnCompanyNameButton() {
		competitionPage.companyName();
	}
	
	@Then("I clear by defualt filter Last Month")
	public void clicxfilter() {
		competitionPage.clearSingleFilter();
	}
	
	@Then("I take a screenshot for Scenario {int}")
	public void takeScreenshotForScenario(int scenarioNumber) {
	    LOG.info("Capturing screenshot for Scenario " + scenarioNumber + "...");
	    String filePath = "C:\\Users\\Arun\\Downloads\\ScreenShot\\Strategize_QA";
	    competitionPage.screenshot(filePath, scenarioNumber);
	    LOG.info("Screenshot captured and saved for Scenario " + scenarioNumber + ".");
	}





}
