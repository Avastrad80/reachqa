package com.katampu22a.stepdefinations;

import com.katampu22a.pages.BestCarsUnderPage;
import com.katampu22a.pages.HomePage;
import com.katampu22a.Keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	@Given("Open Browser and launch Url")
	public void openBrowserandLaunchUrl() {
		Keyword.openbrowser("Chrome");
		Keyword.launchUrl("https://www.carwale.com");
	}
	
	@When("Clicked on Under 5 lakh")
	public void clickOnUnder5Lkh(){
		HomePage homepage = new HomePage();
		homepage.clickOnUnder5LakhFilter();
	}

	@Then("List Of Cars Has Price Less Than 5 lakh")
	public void assertThatTheListOfCarsHasPricedThan5lakh() {
		BestCarsUnderPage bestCars = new BestCarsUnderPage();
		bestCars.assertThatPricesAreUnder5Lakh();

	}
}
