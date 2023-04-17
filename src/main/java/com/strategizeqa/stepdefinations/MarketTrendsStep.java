package com.strategizeqa.stepdefinations;


import java.util.List;

import org.openqa.selenium.WebElement;

import com.strategizeqa.Keyword;
import com.strategizeqa.pages.MarketTrends;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MarketTrendsStep {
	
	
	
	@Given("I am on the market trends page")
	public void marketTrendsPage() {
		MarketTrends mt = new MarketTrends();
		mt.clickMarketTrendsLink();
		Keyword.wait(2000);
	}
	
	@When("I set the driver type field to \"Overall\"")
	public void driverType() {
		MarketTrends mt = new MarketTrends();
		Keyword.wait(3000);
		mt.clickDriverType();
		
		//  mt.clickMarketTrendsLink() .clickDriverType()
		  //.selectDropdownOptionByIndex(2); // select the 3rd option in the dropdown
		 		
		Keyword.wait(2000);
	}

	
	@And("I set the timeframe field to \"Prior 3 months\"")
	public void timeFrame3months() {
		MarketTrends mt = new MarketTrends();
		Keyword.wait(2000);
		mt.click3months();
		Keyword.wait(1000);
	}
	
	@And("I set the timeframe field to \"Prior 6 months\"")
	public void timeFrame6months() {
		MarketTrends mt = new MarketTrends();
		mt.click6months();
		Keyword.wait(1000);
	}
	
	@And("I set the timeframe field to \"Prior 12 months\"")
	public void timeFrame12months() {
		MarketTrends mt = new MarketTrends();
		mt.click12months();
		Keyword.wait(1000);
	}
	
	@Then("Click on RunSearch Button")
	public void runSearch() throws InterruptedException {
		MarketTrends mt = new MarketTrends();
		mt.clickRunSearchButton();
		Keyword.wait(1000);
	}

	
	@Then("Click on Location page")
	public void clickonlocationpage() {
		MarketTrends mt = new MarketTrends();
		mt.clickLocationLink();
		Keyword.wait(2000);
		
	}
	
	@Then("Click on Competition Page")
	public void clickonCompetitionpage() {
		MarketTrends mt = new MarketTrends();
		mt.clickCompetitionLink();
		Keyword.wait(2000);
		
	}
	
	@Then("Get the page Title")
	public void getpagetitle() {
		MarketTrends mt = new MarketTrends();
		mt.verifyPageUrl();
	}
	


}
