package com.strategizeqa.stepdefinations;

import org.testng.Assert;

import com.strategizeqa.Keyword;
import com.strategizeqa.pages.MarketTrends;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MarketTrendsStep {

	MarketTrends marketTrends = new MarketTrends();

	@Given("I am on the market trends page")
	public void marketTrendsPage() {
		marketTrends.clickMarketTrendsLink();
	}

	@When("I click on DriverType drop down list")
	public void driverTypeList() {
		marketTrends.clickDriverTypeList();
	}

	@And("I select the driver type field as {string}")
	public void drivertype(String driverType) {
		if (driverType.equals("Overall")) {
			marketTrends.clickOverall();
		} else if (driverType.equals("Company Driver")) {
			marketTrends.clickCompanyDriver();
		} else if (driverType.equals("Owner Operator")) {
			marketTrends.clickOwnerOperator();
		} else if (driverType.equals("Student")) {
			marketTrends.clickStudent();
		} else if (driverType.equals("Team")) {
			marketTrends.clickTeam();
		} else if (driverType.equals("Other")) {
			marketTrends.clickOther();
		}

//		marketTrends.clickOverall();
	}

	@Then("I click on TimeFrame DropDown")
	public void selectTimeFrame() {
		marketTrends.clickTimeFrameDropDown();

	}

	@And("I select the timeframe field to \"Prior 3 months\"")
	public void timeFrame3months() {
		marketTrends.selectPrior3months();
	}

	@And("I select the timeframe field to \"Prior 6 months\"")
	public void timeFrame6months() {
		marketTrends.selectPrior6months();
	}

	@And("I select the timeframe field to \"Prior 12 months\"")
	public void timeFrame12months() {
		marketTrends.selectPrior12months();
	}

	@Then("Click on RunSearch Button")
	public void runSearch() {
		marketTrends.clickRunSearchButton();
		Assert.assertEquals(Keyword.driver.getTitle(), "Stratas | Strategize");
	}

	@Then("Click on Location page")
	public void clickonlocationpage() {
		marketTrends.clickLocationLink();
	}

	@Then("Click on Competition Page")
	public void clickonCompetitionpage() {
		marketTrends.clickCompetitionLink();

	}
	

}
