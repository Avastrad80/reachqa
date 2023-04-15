package com.strategizeqa.stepdefinations;


import com.strategizeqa.pages.MarketTrends;
import io.cucumber.java.en.And;


public class MarketTrendsStep {
	


	
	@And("Click on Locations")
	public void locations() {
		MarketTrends mt = new MarketTrends();
		mt.clickLocationsLink();
	}
	
	@And("Click on Competition")
	public void competition() {
		MarketTrends mt = new MarketTrends();
		mt.clickCompetitionLink();
	}

	


}
