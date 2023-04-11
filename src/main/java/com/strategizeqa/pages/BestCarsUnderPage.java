package com.katampu22a.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.katampu22a.Keyword;

public class BestCarsUnderPage {

	@FindBy(css = "span.o-Hyyko.o-cyHybq.o-eZTujG.o-eqqVmt")
	public List<WebElement> priceList;

	public BestCarsUnderPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public List<Float> getCarPrices() {
		List<Float> prices = new ArrayList<>();
		for (WebElement priceElement : priceList) {
			String priceTxt = priceElement.getText();
			priceTxt = priceTxt.replaceAll("[^0-9\\.]", "");
			float price = Float.valueOf(priceTxt);
			prices.add(price);
		}
		return prices;
	}

	public void assertThatPricesAreUnder5Lakh() {
		List<Float> prices = getCarPrices();
		for (float price : prices) {
			Assert.assertTrue(price < 5.00f, "Price is Greater than 5 lakh: " + price);
			System.out.println(price);
		}
	}

}
