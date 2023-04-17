package com.strategizeqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class SearchCarFunctionality {

	@BeforeMethod
	public static void toLaunchChrome() {

		Keyword.openbrowser("Chrome");
	}

	@Test
	public void testSearchCars() throws InterruptedException {
		// Launch ChromeDriver to the url
		Keyword.launchUrl("https://www.carwale.com");
		
		//Enter Text in search filed.
		Keyword.enterText("css", "input[placeholder=\"Type to select car name\"]", "Hyundai Creta");

		Thread.sleep(2000);
		// Press Enter Key
		Keyword.pressEnterKey();

		// Validating the Actual and Expected result.
		String expectedTitle = "Hyundai Creta Price, Images, Colours & Reviews-Carwale";
		String actualTitle = expectedTitle;
		Keyword.assertPageTitle(expectedTitle);
		// Assertion used to make sure the actual and expected result are same.
		Assert.assertEquals(actualTitle, expectedTitle, "Search results page not displayed");
		System.out.println(actualTitle);

		Thread.sleep(3000);
	}

	@Test
	public void selectVersionOfSelectedCar() throws InterruptedException {

		Keyword.launchUrl("https://www.carwale.com");
		Keyword.enterText("css", "input[placeholder=\"Type to select car name\"]", "Hyundai Creta");
		Thread.sleep(2000);
		Keyword.pressEnterKey();
		Thread.sleep(5000);
		
		
		By selectCarVersion = By.xpath("//div[text()=\"Version\"]");
		Keyword.waitForvisibilityOfElementLocated(selectCarVersion);
		Keyword.clickOn("");
		Thread.sleep(5000);
	}
	
	@Test
	public void testGetDealerQuotes() throws InterruptedException {
		
		Keyword.launchUrl("https://www.carwale.com");
		Keyword.enterText("css", "input[placeholder=\"Type to select car name\"]", "Hyundai Creta");
		Thread.sleep(2000);
		Keyword.pressEnterKey();
		Thread.sleep(5000);
		Keyword.scrollWindow(0,200);
		
		
        // Click on the "Get Dealer Quotes" button
        Keyword.clickOn("Xpath", "//span[text()=\"Get March Offers\"]");
        Thread.sleep(2000);

    }
	
	@Test
    public void searchUsedCar() {
        // Navigate to CarWale homepage
    	Keyword.launchUrl("https://www.carwale.com");

        // Click on "Used Cars" link in the top navigation menu
        WebElement usedCarsLink = Keyword.getWebElement("linkText", "Used Cars");
        usedCarsLink.click();

        // Wait for the page to load and the search filters to be visible
        
		/*
		 * By usedCarsList; Keyword.waitForvisibilityOfElementLocated(usedCarsList);
		 */

        // Select "Make" as "Maruti Suzuki"
        WebElement makeDropdown = Keyword.getWebElement("id","makeId");
        Select makeSelect = new Select(makeDropdown);
        makeSelect.selectByVisibleText("Maruti Suzuki");

        // Select "Model" as "Swift"
        WebElement modelDropdown = Keyword.getWebElement("id", "modelId");
        Select modelSelect = new Select(modelDropdown);
        modelSelect.selectByVisibleText("Swift");

        // Select "City" as "Bangalore"
        WebElement cityDropdown = Keyword.getWebElement("id", "cityId");
        Select citySelect = new Select(cityDropdown);
        citySelect.selectByVisibleText("Bangalore");

        // Click on "Find Cars" button
        WebElement findCarsButton = Keyword.getWebElement("xpath", "//button[text()='Find Cars']");
        findCarsButton.click();

        // Wait for the search results to load
       // Keyword.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-page__result")));


        // Verify that the search results display the correct information
        WebElement searchResults = Keyword.getWebElement("className","search-page__result");
        assert(searchResults.isDisplayed());

        // Verify that the search results display at least one car
        WebElement searchResultCount = Keyword.getWebElement("className","search-result-count");
        assert(Integer.parseInt(searchResultCount.getText().replaceAll("[^0-9]+", "")) > 0);
    }

	@AfterTest
	public void closechome() {
		Keyword.closeBrowser();
	}

}
