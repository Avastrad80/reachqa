package com.strategizeqa.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strategizeqa.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locations {
	private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;
    
	@FindBy(xpath = "//a[@id='locations']")
	private WebElement locations;

    @FindBy(css = "input[type='text']")
    private WebElement location;
    
    @FindBy(css = "h1.accordion-title[text()='Location Overview']")
    private WebElement locationOverView;

    @FindBy(xpath = "//h1[normalize-space()='Driver Population Stats']")
    private WebElement driverPopulationStats;

    @FindBy(xpath = "//h1[normalize-space()='Competition Stats']")
    private WebElement competitionStats;

    @FindBy(xpath = "//h1[normalize-space()='Driver Market Stats']")
    private WebElement driverMarketStats;

    @FindBy(xpath = "button[aria-label='clear icon']")
    private WebElement clear;
    
    private final String pageLoadedText = "Randall Reilly, past 12 months";
    private final String pageUrl = "/market/locations";

    public Locations() {
    	PageFactory.initElements(Keyword.driver, this);
    }

    public Locations(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Locations(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Locations(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }
    
	public void clickOnLocations() {
		Keyword.fWaitForvisibilityOfElementLocated(locations);
		locations.click();
		
	}
	
	public void click() {
		location.click();
	}

	public void enterLocation(String locality) throws InterruptedException {
		Keyword.fWaitForvisibilityOfElementLocated(location);
		location.sendKeys(locality);
		Thread.sleep(10000);
	}
	public void selectLocationAndProvince(String locality,String province) throws InterruptedException
	{
		List<WebElement> listOfLocat = Keyword.driver.findElements(By.xpath("//div[@role='listbox']/div"));
		for(int i = 1; i < listOfLocat.size();i++)
		{
			if((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" +i+ "]/div/div/div[1]")).getText().contains(locality)) &&
			 (Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" +i+ "]/div/div/div[2]")).getText().equals(province))) 
			{
//				System.out.println((Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div[1]")).getText() + 
//						(Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div["+i+"]/div/div/div/div[2]")).getText())));
				Keyword.driver.findElement(By.xpath("//div[@role='listbox']/div[" +i+ "]/div/div/div[1]")).click();
				break;
			}
		}
		Thread.sleep(5000);
	}
	
    public void clicklocationOverView() {
    	Keyword.fWaitForvisibilityOfElementLocated(locationOverView);
    	locationOverView.click();
    }

    public void clickdriverPopulationStats() {
    	Keyword.fWaitForvisibilityOfElementLocated(driverPopulationStats);
    	driverPopulationStats.click();
    }

    public void clickcompetitionStats() {
    	Keyword.fWaitForvisibilityOfElementLocated(competitionStats);
    	competitionStats.click();
    }

    public void clickdriverMarketStats() {
    	Keyword.fWaitForvisibilityOfElementLocated(driverMarketStats);
    	driverMarketStats.click();
    }
	
    public void clickClearButton() throws InterruptedException {
    	Keyword.fWaitForvisibilityOfElementLocated(clear);
    	Thread.sleep(5000);
        clear.click();
    }

}