package com.strategizeqa.stepdefinations;

import com.strategizeqa.pages.CompetitionPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompetitionSteps {

	private CompetitionPage competitionpage = new CompetitionPage();

	// Navigate to competition page
	@Given("I am on the competition page")
	public void navigateTocompetitionpage() {
		competitionpage.clickCompetitionLink();
	}

	// Enter Location Name
	@When("I enter location as {string} in location input box")
	public void i_enter_in_location_input_box(String string) throws InterruptedException {
		competitionpage.click();
//		locations.clickClearButton();
		competitionpage.enterLocation(string);
	}

	// select Location and state
	@When("I select {string} location and {string} state")
	public void i_select_and(String string, String string1) throws InterruptedException {
		competitionpage.selectLocationAndProvince(string, string1);
	}

	// select Location and MSA
	@When("I select {string} location and {string} as msa")
	public void i_select_and_msa(String string, String string1) throws InterruptedException {
		competitionpage.selectLocationAndProvince(string, string1);
	}

	// select Location and city
	@When("I select {string} location and {string} as city")
	public void i_select_and_city(String string, String string1) throws InterruptedException {
		competitionpage.selectLocationAndCity(string, string1);
	}

	// select Location and metropolitan area
	@When("I select {string} city and {string} MetroPolitanArea")
	public void i_select_and_metropolitian_area(String string, String string1) throws InterruptedException {
		competitionpage.selectCityAndMetroPolitanArea(string, string1);
	}

	// Select city and state
	@When("I select {string} city and {string} state")
	public void i_select_and_city_state(String string, String string1) throws InterruptedException {
		competitionpage.selectCityAndState(string, string1);
	}

	// Select city and county
	@When("I select {string} city and {string}county")
	public void i_select_and_city_and_county(String string, String string1) throws InterruptedException {
		competitionpage.selectCityAndCounty(string, string1);
	}

	// Select TimeFrame
	@And("I select {string} timeframe")
	public void select_timeframe(String option) {
		competitionpage.selectDateRange(option, "Search");
	}

	// Select Date Range
	@When("I set the date range from {string} to {string}")
	public void set_date_range(String fromDate, String toDate) {
		competitionpage.setDateFromTextField(fromDate);
		competitionpage.setDateToTextField(toDate);
	}

	// Drop down selection
	@Then("I click on Timeframe filter to hide Posting Date")
	public void clickTimeFrame() {
		competitionpage.timeFrameDropDown();
	}

	@Then("I click on Job Type  filter to hide all job type filters")
	public void clickJobType() {
		competitionpage.jobTypeDropDown();
	}

	@Then("I click on posting driver Header")
	public void clickPostingDriverType() {
		competitionpage.postingdrivertypeDropDown();
	}

	@Then("I click on Solo Team Header")
	public void clickSoloOrTeam() {
		competitionpage.clickSoloOrTeamDropDownArrow();
	}

	@Then("I click on Posting Route Type Drop Down")
	public void clickPostingRouteType() {
		competitionpage.clickPostingRouteTypeDropDown();
	}

	@Then("I click on Posting Haul Type Header")
	public void clickPostingHaulType() {
		competitionpage.clickpostingHaulTypeDropDown();
	}

	// Posting Driver Type
	@When("I select Posting Driver Type as Company Driver")
	public void clickCompanyDriver() {
		competitionpage.clickCompanyDriver();
	}

	@And("I select Posting Driver Type as Owner Operator")
	public void clickOwnerOperator() {
		competitionpage.clickOwnerOperator();
	}

	@And("I select Posting Driver Type as Student Driver")
	public void clickStudentDriver() {
		competitionpage.clickStudentDriver();
	}

	@And("I select Posting Driver Type as Lease Purchase")
	public void clickLeasePurchase() {
		competitionpage.clickLeasePurchase();
	}

	@And("I select Posting Driver Type as Yard Jockey")
	public void clickYardJockey() {
		competitionpage.clickYardJockey();
	}

	// Solo or Team Position
	@And("I select Solo or Team Position as Solo")
	public void clickSolo() {
		competitionpage.clickSolo();
	}

	@And("I select Solo or Team Position as Team")
	public void clickTeam() {
		competitionpage.clickTeam();
	}

	// Posting Route Type
	@When("I select Posting Route Type as Local")
	public void clickLocal() {
		competitionpage.clickLocal();
	}

	@When("I select Posting Route Type as Regional")
	public void clickRegional() {
		competitionpage.clickRegional();
	}

	@When("I select Posting Route Type as Over The Road")
	public void clickOverTheRoad() {
		competitionpage.clickOverTheRoad();
	}

	@When("I select Posting Route Type as Dedicated")
	public void clickDedicated() {
		competitionpage.clickDedicated();
	}

	// Posting Haul Type
	@When("I select Haul Type as Dry Van")
	public void clickDryVan() {
		competitionpage.clickDryVan();
	}

	@When("I select Haul Type as Flatbed")
	public void clickFlatBed() {
		competitionpage.clickFlatBed();
	}

	@When("I select Haul Type as Refrigerated")
	public void clickRefrigerated() {
		competitionpage.clickRefrigerated();
	}

	@When("I select Haul Type as Hazmat")
	public void clickHazmat() {
		competitionpage.clickHazmat();
	}

	@When("I select Haul Type as Tanker")
	public void clickTanker() {
		competitionpage.clickTanker();
	}

	@When("I select Haul Type as LTL")
	public void clickLTL() {
		competitionpage.clickLTL();
	}

	@When("I select Haul Type as Auto Hauler")
	public void clickAutoHauler() {
		competitionpage.clickAutoHauler();
	}

	@When("I select Haul Type as Doubles Triples")
	public void clickDoublesTriples() {
		competitionpage.clickDoublesTriples();
	}

	@When("I select Haul Type as Heavy Haul Specialized")
	public void clickHeavyHaulSpecialized() {
		competitionpage.clickHeavyHaulSpecialized();
	}

	@When("I select Haul Type as Power Only")
	public void clickPowerOnly() {
		competitionpage.clickPowerOnly();
	}

	/**
	 * Search Text box, Click on Search button, Update Search Button, Clear All
	 * Filters, Clear single Filter, Search By Radius functionality.
	 */
	@And("I click on Search Button")
	public void searchLocation() {
		competitionpage.clickSearchLocationButton();
	}

	@Then("I click on Update Search Button")
	public void updateSearchLocation() {
		competitionpage.clickUpdateSearchButton();
	}

	@When("I click on the location search field")
	public void clickLocationSearchTextField() {
		competitionpage.locationSearchTextField();
	}

	@When("I clear all filters")
	public void clearAllFilters() {
		competitionpage.clearFilters();
	}

	@When("I clear a {string} filter")
	public void clickOnXToClearFilter() {
		competitionpage.clearSingleFilter();
	}

	@And("I click on the search by radius")
	public void clickOnSearchRadiusButton() {
		competitionpage.clickSearchByRadius();
	}

	@And("I enter the radius {int} miles")
	public void enterRadius() {
		competitionpage.enterRadius();
	}

	// Enter Location Name in radius
	@When("I enter in radius location as {string} in location input box")
	public void i_enter_in_radius_location_input_box(String string) throws InterruptedException {
		competitionpage.click();
		//competitionpage.clickClearButton();
		competitionpage.enterLocation(string);
	}

	// select Location and state radius section
	@When("I select radius {string} location and {string}")
	public void i_select_radius_and(String string, String string1) throws InterruptedException {
		competitionpage.selectLocationAndProvince(string, string1);
	}

	@And("I click the green check mark")
	public void clickGreenCheckMark() {
		competitionpage.clickGreenCheckMark();
	}

	@And("I click the accept button")
	public void clickAcceptButton() {
		competitionpage.clickAcceptButton();
	}

	@And("I delete the radius location")
	public void deleteRadiusLocation() {
		competitionpage.deleteRadiusLocation();
	}

	@And("I edit the radius")
	public void editRadius() {
		competitionpage.editRadius();
	}

	@And("I travel and explore")
	public void travelExplore() {
		competitionpage.travelExplore();
	}

	@And("I click on subtitle {string}")
	public void subtitlestate() {
		competitionpage.clickonstatesubtitle();
	}

	/**
	 * Select Time Frame from Advertised Salary Distribution
	 * 
	 * @param timeFrame
	 */
	@When("I select the {string} time frame")
	public void selectTimeFrame(String timeFrame) {
		if (timeFrame.equalsIgnoreCase("yearly")) {
			competitionpage.timeFrameYearly();
		} else if (timeFrame.equalsIgnoreCase("weekly")) {
			competitionpage.timeFrameWeekly();
		} else if (timeFrame.equalsIgnoreCase("hourly")) {
			competitionpage.timeFrameHourly();
		} else if (timeFrame.equalsIgnoreCase("cpm")) {
			competitionpage.timeFrameCPM();
		}
	}

	@When("I click on Yearly Radio Button")
	public void timeFrameYearly() {
		competitionpage.timeFrameYearly();
	}

	@When("I click on Weekly Radio Button")
	public void timeFrameWeekly() {
		competitionpage.timeFrameWeekly();
	}

	@When("I click on Hourly Radio Button")
	public void timeFrameHourly() {
		competitionpage.timeFrameHourly();
	}

	@When("I click on CPM Radio Button")
	public void timeFrameCPM() {
		competitionpage.timeFrameCPM();
	}

	/**
	 * Sort by Max, Min, Company Name in Advertised Wage Ranges by Company
	 */
	@When("I click on the sort by company names button")
	public void clickOnSortByCompanyNamesButton() {
		competitionpage.sortCompanyNames();
	}

	@When("I click on the sort by max button")
	public void clickOnSortByMaxButton() {
		competitionpage.sortMaxCompany();
	}

	@When("I click on the sort by min button")
	public void clickOnSortByMinButton() {
		competitionpage.sortMinCompany();
	}

	@When("I click on the company name button")
	public void clickOnCompanyNameButton() {
		competitionpage.companyName();
	}

}
