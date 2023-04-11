package com.katampu22a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.katampu22a.Keyword;

public class HomePage {

	// By using FindBy annotation, it automatically gets Initialize
	// *Marker annotation to be applied to WebElements to indicate that it never changes (that is, that the same instance in the DOM will always be used)
	@CacheLookup
	@FindBy(css = "span[data-unique-key=\"new\"]")
	public WebElement newUsedToggle;  // Using @CacheLookup annotation indicates that, the element will be not changed and it will be fixed in the dom as well 

	
	@FindBy(css = "input[placeholder=\"Type to select car name\"]")
	public WebElement typeCarNameTxBx;
	
	
	@FindBy(css = "a[href='/new/best-cars-under-5-lakh/']")
	public WebElement under5lakhFilter;

	
	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void enterCarNameToSearch(String carName) {
		typeCarNameTxBx.sendKeys(carName);
	}

	public void clickOnNewUsedToggle() {
		newUsedToggle.click();
	}
	
	public void clickOnUnder5LakhFilter(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Keyword.scrollWindow(0, 300);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		under5lakhFilter.click();
	}

}
