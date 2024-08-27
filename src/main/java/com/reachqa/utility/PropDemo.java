package com.reachqa.utility;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import com.reachqa.Keyword;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

public class PropDemo {

	private static final Logger LOG = Logger.getLogger(PropDemo.class);

	public static String valueFromProp(String key) throws IOException {
		String base = System.getProperty("user.dir"); // Current working directory path
		String filePath = base + "/src/main/resources/Application.properties"; // Corrected file name
		LOG.debug("Attempting to load properties file from: " + filePath); // Add debug log
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static void login() throws IOException {
		Keyword.openbrowser("Chrome");
		Keyword.driver.get(PropDemo.valueFromProp("stage.url"));
		Keyword.driver.findElement(By.xpath("//input[@type='email']"))
				.sendKeys(PropDemo.valueFromProp("stage.username"));
		Keyword.driver.findElement(By.xpath("//button[@value='continue']")).click();
		Keyword.driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys(PropDemo.valueFromProp("stage.password"));
		Keyword.driver.findElement(By.xpath("//button[@value='login']")).click();
		LOG.info("Logged to Reach Staging Webapplication");
	}

	public static void verifyLocators() throws InterruptedException, IOException, AWTException {
		try {

			long startTime = System.currentTimeMillis(); // Start time

			login();
			Thread.sleep(1000);

			WebDriverWait wait = new WebDriverWait(Keyword.driver, Duration.ofSeconds(60));

			// Create New Campaign "Add Campaign" button
			WebElement addCampaignButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.id("add-campaign-button")));
			addCampaignButton.click();
			Thread.sleep(1000);

			// Campaign Info Form - Locate the input field and click on Search Company text.
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@id='default']/div[1]/div[1]/div[1]/input[2]")));
			WebElement companySearchInput = Keyword.driver
					.findElement(By.xpath("//div[@id='default']/div[1]/div[1]/div[1]/input[2]"));
			companySearchInput.click();
			Actions actions = new Actions(Keyword.driver);
			actions.sendKeys("ADP").perform(); // Typing to trigger dropdown

			// Locate the dropdown menu
			WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@class='fields-wrapper pt-5 mb-10']/div[1]/div[2]/div[1]")));

			// Locate all option elements within the dropdown menu
			List<WebElement> dropdownOptions = dropdownMenu
					.findElements(By.xpath("//div[@class='fields-wrapper pt-5 mb-10']/div[1]/div[2]/div[1]"));

			// Loop through the dropdown options and click on the desired one "ADP"
			for (WebElement option : dropdownOptions) {
				String optionText = option.getText();
				if (optionText.contains("Always")) {
					option.click(); // Click the option
					break; // Exit the loop after clicking the desired option
				}
			}
			// Starting the timer before locating the element
			long locatorStartTime = System.currentTimeMillis();

			// Adding a 5000ms wait before the element interaction (as per your code)
			Thread.sleep(2000);

			// Locate the input field for agency
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@id='default']/div[1]/div[2]/div[1]/input[2]")));
			long agencySearchInputVisibleTime = System.currentTimeMillis();
			System.out.println("Time taken for agency search input to become visible: "
					+ (agencySearchInputVisibleTime - locatorStartTime) + " ms");

			WebElement agencySearchInput = Keyword.driver
					.findElement(By.xpath("//div[@id='default']/div[1]/div[2]/div[1]/input[2]"));
			agencySearchInput.click();
			Actions action = new Actions(Keyword.driver);
			action.sendKeys("Direct").perform(); // Typing to trigger dropdown

			// Starting the timer for the dropdown menu
			long dropdownStartTime = System.currentTimeMillis();

			// Locate the dropdown menu
			WebElement dropdownMenuAgency = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[@id='default']/div[1]/div[2]/div[2]/div[1]")));
			long dropdownMenuVisibleTime = System.currentTimeMillis();
			System.out.println("Time taken for dropdown menu to become visible: "
					+ (dropdownMenuVisibleTime - dropdownStartTime) + " ms");

			// Rest of your code for selecting options in the dropdown
			List<WebElement> dropdownOptionsAgency = dropdownMenuAgency
					.findElements(By.xpath("//div[@id='default']/div[1]/div[2]/div[2]/div[1]"));

			for (WebElement option : dropdownOptionsAgency) {
				String optionText = option.getText();
				if (optionText.contains("Direct (Randall-Reilly)")) {
					option.click();
					break;
				}
			}

			Thread.sleep(500);
			WebElement WebsiteTraffic = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Website Traffic']")));
			WebsiteTraffic.click();
			Thread.sleep(500);
			Keyword.fWaitForvisibilityOfElementLocated(Keyword.driver.findElement(By.xpath("//input[@id='Clicks']")));
			Keyword.driver.findElement(By.xpath("//input[@id='Clicks']")).click();

			Thread.sleep(500);
			Keyword.fWaitForvisibilityOfElementLocated(
					Keyword.driver.findElement(By.xpath("//input[@name='goal_value']")));
			WebElement goalvalue = Keyword.driver.findElement(By.xpath("//input[@name='goal_value']"));
			goalvalue.sendKeys("150");

			// Scroll to the phone call settings form Scroll to the desired height
			Keyword.scrollToHeight(600); // Adjust this value as needed
			WebElement campaignMessagingAutomation = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//input[@value='Warm Up Text + Long App Text + Phone Call']")));
			campaignMessagingAutomation.click();
			Thread.sleep(500);

			/*
			 * WebElement campaign_Notes =
			 * Keyword.driver.findElement(By.xpath("//textarea[@id='campaign_notes']"));
			 * campaign_Notes.sendKeys("Text for Campaign Notes"); Thread.sleep(500);
			 */

			// Budget & Run Dates Form
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[2]")).click();
			Thread.sleep(1000);
			WebElement monthlyNetBudgetInput = Keyword.driver
					.findElement(By.xpath("//div[@id='budget']//input[@class='input-text']"));
			monthlyNetBudgetInput.sendKeys("10000");
			Thread.sleep(1000);
			WebElement desiredStartDateInput = Keyword.driver.findElement(By.xpath("//input[@type='date']"));
			Keyword.setDesiredStartDate(desiredStartDateInput);
			Thread.sleep(1000);
			Keyword.driver.findElement(By.xpath("//input[@value='total']")).click();
			Thread.sleep(500);
			Keyword.driver.findElement(By.xpath(
					"//div[@class='form-field' and .//h4[contains(text(), 'Auto-Renew')]]//input[@type='radio' and @value='1']"))
					.click();
			Thread.sleep(500);
			// Find the Budget and Run Dates Notes textarea and interact with it
			/*
			 * WebElement budgetAndRunDatesNotesTextarea = Keyword.driver
			 * .findElement(By.xpath("//textarea[@id='budget_and_run_dates_notes']"));
			 * budgetAndRunDatesNotesTextarea.
			 * sendKeys("These are some notes for the budget and run dates.");
			 */
			// Audiance Target Form
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[3]")).click();
			Thread.sleep(1000);
			Keyword.driver.findElement(By.xpath("//div[@id='audience']/div[1]/div[1]/div/label[12]")).click();
			Thread.sleep(500);
			Keyword.driver.findElement(By.xpath("//*[@id=\"audience\"]/div[1]/div[4]/div/label[2]")).click();
			Thread.sleep(500);

			// Find the "Years" input element and send the value
			WebElement yearsInput = Keyword.driver.findElement(By.id("years"));
			yearsInput.clear(); // Clear existing value if any
			yearsInput.sendKeys("1"); // Send the desired value
			Thread.sleep(2000);

			// Find the "Months" input element and send the value
			WebElement monthsInput = Keyword.driver.findElement(By.id("months"));
			monthsInput.clear(); // Clear existing value if any
			monthsInput.sendKeys("6"); // Send the desired value
			Thread.sleep(500);

			/*
			 * Keyword.scrollToHeight(100); WebElement textarea =
			 * Keyword.driver.findElement(By.xpath(
			 * "//textarea[@id='audience_targeting_notes']"));
			 * textarea.sendKeys("Your text here"); Thread.sleep(2000);
			 */

			// Location Targeting Form
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[4]")).click();
			Thread.sleep(1000);
			Keyword.scrollToHeight(0);
			Keyword.driver.findElement(By.xpath("//div[@id='states']/div[1]/label[5]/input")).click();
			Thread.sleep(500);
			/*
			 * Keyword.driver.findElement(By.xpath(
			 * "//div[@id='states']/div[1]/label[27]/input")).click(); Thread.sleep(2000);
			 * Keyword.driver.findElement(By.xpath(
			 * "//div[@id='states']/div[1]/label[42]/input")).click(); Thread.sleep(2000);
			 */

			// Pay
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[5]")).click();
			Thread.sleep(1000);
			Keyword.driver.findElement(By.xpath("//input[@name='payFixed']")).click();
			WebElement payFixed = Keyword.driver.findElement(By.xpath("//input[@name='payFixed']"));
			// Example value, you can set this dynamically
			int payValue = 650; // Replace with the actual value you want to enter
			payFixed.sendKeys(String.valueOf(payValue));
			Thread.sleep(500);
			// Locate the dropdown for pay period
			Select payPeriodSelect = new Select(Keyword.driver.findElement(By.id("payPeriodFixed")));

			// Conditional selection based on the pay value
			if (payValue >= 0 && payValue <= 249) {
				payPeriodSelect.selectByVisibleText("Mile");
			} else if (payValue >= 250 && payValue <= 500) {
				payPeriodSelect.selectByVisibleText("Hour");
			} else if (payValue >= 501 && payValue <= 750) {
				payPeriodSelect.selectByVisibleText("Day");
			} else if (payValue >= 751 && payValue <= 10000) {
				payPeriodSelect.selectByVisibleText("Month");
			} else if (payValue > 10000) {
				payPeriodSelect.selectByVisibleText("Year");
			}

			/*
			 * WebElement pay_Textarea = Keyword.driver.findElement(By.id("pay-notes"));
			 * pay_Textarea.sendKeys("Your Pay text here"); Thread.sleep(500);
			 */

			// Landing Page
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[6]")).click();
			Thread.sleep(1000);

			// Send text to the "benefits" text box
			WebElement benefitsTextBox = Keyword.driver.findElement(By.xpath("//textarea[@id='benefits']"));
			benefitsTextBox.sendKeys("Text for benefits");
			Thread.sleep(500);

			// Send text to the "requirements" text box
			WebElement requirementsTextBox = Keyword.driver.findElement(By.xpath("//textarea[@id='requirements']"));
			requirementsTextBox.sendKeys("Text for requirements");
			Thread.sleep(500);
			/*
			 * // Send text to the "company_overview" text box WebElement
			 * companyOverviewTextBox = Keyword.driver
			 * .findElement(By.xpath("//textarea[@id='company_overview']"));
			 * companyOverviewTextBox.sendKeys("Text for company overview");
			 * Thread.sleep(500);
			 */

			// Creative Form
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[7]")).click();
			Thread.sleep(1000);
			// Contract
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[10]")).click();
			Thread.sleep(500);
			// Setup Notes
			Keyword.driver.findElement(By.xpath("//ul[@id='form-menu']/li[11]")).click();
			Thread.sleep(500);

			// Wait until the "Submit Campaign" button is clickable, then click it
			WebElement submitButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit Campaign']")));
			submitButton.click();
			Thread.sleep(1000);

			// Calculate the time duration for campaign creation
			long endTime = System.currentTimeMillis();  // End time after campaign creation
			long timeTakenInMillis = endTime - startTime;
			long timeTakenInSeconds = timeTakenInMillis / 1000;
			
			System.out.println("Total time taken for campaign creation: " + timeTakenInSeconds + " seconds");

	        // Check if the campaign is created in 60 seconds or less
	        if (timeTakenInSeconds <= 60) {
	            System.out.println("Campaign created within " + timeTakenInSeconds + " seconds.");
	        } else {
	            System.out.println("Campaign took longer than 60 seconds.");
	        }

			// Handle success message or pop-up
			try {
				WebElement successMessage = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Success')]")));
				System.out.println("Success message is displayed: " + successMessage.getText());
			} catch (TimeoutException e) {
				System.out.println("Success message is not displayed.");
			}

			// Take a screenshot
			Keyword.screenshot("C:\\Screenshots\\");
			Thread.sleep(500);

			// Close the success dialog if needed
			try {
				WebElement closeButton = wait.until(
						ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close this dialog']")));
				closeButton.click();
			} catch (TimeoutException e) {
				System.out.println("Close button not found or dialog did not appear.");
			}

			Keyword.driver.close();

		} catch (Exception e) {
			// Print the exception message
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		verifyLocators();
	}
}