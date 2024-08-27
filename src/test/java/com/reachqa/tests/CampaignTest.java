package com.reachqa.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.reachqa.Keyword;
import com.reachqa.base.Config;

public class CampaignTest {

	private WebDriver driver;
    private WebDriverWait wait;
    private Config config;

    @BeforeClass
    public void setUp() {
        // Initialize the Config class
        config = new Config();
        
        // Initialize the WebDriver using the browser name from properties
        String browserName = "Chrome"; // You can also fetch this from properties if needed
        driver = Keyword.openbrowser(browserName);
        
        // Initialize WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Perform login
        login();
    }

    private void login() {
        // Navigate to the login URL
        driver.get(config.getAppUrl());

        // Perform login using credentials from Config
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(config.getUsername());
        driver.findElement(By.xpath("//button[@value='continue']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(config.getPassword());
        driver.findElement(By.xpath("//button[@value='login']")).click();
        
        System.out.println("Logged in to Reach Staging Web application");
    }

    @Test
    public void testCreateCampaign() throws InterruptedException {
        // Create New Campaign "Add Campaign" button
        WebElement addCampaignButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-campaign-button")));
        addCampaignButton.click();
        Thread.sleep(5000);

        // Campaign Info Form - Locate the input field and click on Search Company text
        WebElement companySearchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='default']/div[1]/div[1]/div[1]/input[2]")));
        companySearchInput.click();
        Keyword.scrollIntoViewIfNeeded(companySearchInput);
        companySearchInput.sendKeys("ADP"); // Typing to trigger dropdown
        Thread.sleep(5000);
        
        // Locate the dropdown menu
        WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fields-wrapper pt-5 mb-10']/div[1]/div[2]/div[1]")));
        List<WebElement> dropdownOptions = dropdownMenu.findElements(By.xpath("//div[@class='fields-wrapper pt-5 mb-10']/div[1]/div[2]/div[1]"));

        // Loop through the dropdown options and click on the desired one "Werner Enterprise"
        for (WebElement option : dropdownOptions) {
            if (option.getText().contains("ADP - Always Designing for People")) {
                option.click(); // Click the option
                break; // Exit the loop after clicking the desired option
            }
        }
        
        Thread.sleep(2000);
        // Locate the input field for agency
        WebElement agencySearchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='default']/div[1]/div[2]/div[1]/input[2]")));
        agencySearchInput.click();
        Keyword.scrollIntoViewIfNeeded(agencySearchInput);
        agencySearchInput.sendKeys("Direct"); // Typing to trigger dropdown
        
        WebElement dropdownMenuAgency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='default']/div[1]/div[2]/div[2]/div[1]")));
        List<WebElement> dropdownOptionsAgency = dropdownMenuAgency.findElements(By.xpath("//div[@id='default']/div[1]/div[2]/div[2]/div[1]"));

        // Loop through the dropdown options and click on the desired one ("Direct(Randall-Reilly)")
        for (WebElement option : dropdownOptionsAgency) {
            if (option.getText().contains("Direct (Randall-Reilly)")) {
                option.click();
                break;
            }
        }
        
        Thread.sleep(2000);
        // Checking and setting various form elements
        WebElement websiteTraffic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Website Traffic']")));
        websiteTraffic.click();
        Thread.sleep(500);
        WebElement clicksInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Clicks']")));
        clicksInput.click();
        Thread.sleep(500);
        
        WebElement goalValueInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='goal_value']")));
        goalValueInput.sendKeys("150");
        Thread.sleep(2000);
        // Scroll to the campaign messaging automation section
        Keyword.scrollToHeight(400);
        
        WebElement campaignMessagingAutomation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Warm Up Text + Long App Text + Phone Call']")));
        campaignMessagingAutomation.click();

        // Assertions to check if fields are required
        assertFieldRequired(By.xpath("//input[@name='company']"), "The company field is required.");
        assertFieldRequired(By.xpath("//input[@name='agency']"), "The agency field is required.");
        assertFieldRequired(By.xpath("//input[@name='name']"), "The name field is required.");
        assertFieldRequired(By.xpath("//input[@name='objective']"), "The objective options field is required.");
        assertFieldRequired(By.xpath("//input[@name='campaign_messaging_automation']"), "The campaign messaging automation field is required.");
    }

    private void assertFieldRequired(By fieldLocator, String errorMessage) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldLocator));
        String value = field.getAttribute("value");
        Assert.assertTrue(value.isEmpty(), errorMessage);
    }

    @AfterClass
    public void tearDown() {
        Keyword.closeBrowser();
    }
}