package com.strategizeqa.stepdefinations;

import com.strategizeqa.pages.Locations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocationsSteps {
	private Locations locations = new Locations();

    @Given("I am on the Locations page")
    public void navigatetoLocationsPage() {
    	locations.clickOnLocations();
//        locations = new Locations();
    }
    
	@When("I enter {string} in location input box")
	public void i_enter_in_location_input_box(String string) throws InterruptedException {
		locations.click();
//		locations.clickClearButton();
		locations.enterLocation(string);
	}

	@When("I select {string} and {string}")
	public void i_select_and(String string, String string1) throws InterruptedException {
		locations.selectLocationAndProvince(string, string1);
	}
	
	@Then("I should be able to see location highlighted on map")
	public void i_should_be_able_to_see_location_highlighted_on_map() throws InterruptedException {
		System.out.println("Location");
		Thread.sleep(5000);
	}

    @Then("I should be able to click on Location Overview")
    public void clickLocationOverview() {
        locations.clicklocationOverView();
    }

    @And("I should be able to click on Driver Population Stats")
    public void clickDriverPopulationStats() {
        locations.clickdriverPopulationStats();
    }

    @And("I should be able to click on Competition Stats link")
    public void clickCompetitionStats() {
        locations.clickcompetitionStats();
    }

    @And("I should be able to click on Driver Market Stats link")
    public void clickDriverMarketStats() {
        locations.clickdriverMarketStats();
    }

//    @And("I click on the Clear button")
//    public void clickClearButton() {
//        locations.clickClearButton();
//    }

}
