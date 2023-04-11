package com.katampu22a;

import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.katampu22a.base.TestBase;
import com.katampu22a.pages.BestCarsUnderPage;
import com.katampu22a.pages.HomePage;
import com.katampu22a.utility.PropUtil;


public class HomePageTest extends TestBase {

	@Test(description = "Click on Cars under 5 lakh and then verify that all resulting cars should have price less or equal to 5 lakh")
	public void verifyListOfCarsHavingPriceSmallerOrEqualToSearchPrice() {

		// Launch ChromeDriver to thxpu,,e url
		Keyword.launchUrl("https://www.carwale.com");

		// Scroll down the window by 500 pixels
		Keyword.scrollWindow(0, 500);

		// Properties file for all locators.
		PropUtil or = new PropUtil();

		// Find the element containing the css selector
		By under5Lakh = By.cssSelector("");

		// Applied Fluent Wait
		Keyword.waitForvisibilityOfElementLocated(under5Lakh);

		// Once the webelement is present on the DOM, then click on the webelement.
		Keyword.clickOn(or.element("homepage_under5lakhfilter"));

		// Find the element containing the css selector and get the price and validate
		// if the values are expected.
		List<String> prices = Keyword.getListOfTexts("CssSelector", or.element("filterpage_prices"));

		for (String price : prices) {
			price = price.replaceAll("[^0-9\\.]", ""); // Regular expression
			System.out.println("Filtered Price: " + price);
			float priceValue = Float.parseFloat(price);
			Assert.assertTrue(priceValue <= 5.00f, "Price is Greater Than 5 Lakh: " + priceValue);

		}
	}

	@Test
	public void verifyThatOnSearchOfCarPriceShouldBeDisplayed() {
		HomePage homePage = new HomePage();
		homePage.enterCarNameToSearch("Creta");
	}

	@Test
	public void verifyListOfCarsHavingPriceSmallerOrEqualToSearchPrice2() {
		HomePage home = new HomePage();
		home.clickOnUnder5LakhFilter();
		BestCarsUnderPage bestCarPage = new BestCarsUnderPage();
		bestCarPage.assertThatPricesAreUnder5Lakh();

	}

}
