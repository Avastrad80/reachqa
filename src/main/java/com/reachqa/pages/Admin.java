package com.reachqa.pages;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "#company-table-pagination ul.pagination.b-pagination li:nth-of-type(3) button.page-link")
	private WebElement addCompanyRequestPage1;

	@FindBy(css = "#company-table-pagination ul.pagination.b-pagination li:nth-of-type(4) button.page-link")
	private WebElement addCompanyRequestPage2;

	@FindBy(css = "#app div.admin-grid div:nth-of-type(7) ul.pagination.b-pagination li:nth-of-type(3) button.page-link")
	private WebElement notificationpagination;

	@FindBy(css = "#company-table-pagination ul.pagination.b-pagination li:nth-of-type(5) button.page-link")
	private WebElement addCompanyRequestPage3;

	@FindBy(css = "#company-table-pagination ul.pagination.b-pagination li:nth-of-type(6) button.page-link")
	private WebElement addCompanyRequestPage4;

	@FindBy(css = "#app div.admin-grid div:nth-of-type(2) button.green-button.v-btn.v-btn--is-elevated.v-btn--has-bg.theme--light.v-size--default")
	private WebElement addCompanyRequest;

	@FindBy(css = "#app div.admin-grid div:nth-of-type(5) button.green-button.v-btn.v-btn--is-elevated.v-btn--has-bg.theme--light.v-size--default")
	private WebElement addNotification;

	@FindBy(css = "#pages-table tbody tr:nth-of-type(1) td:nth-of-type(22) button:nth-of-type(2)")
	private WebElement contentcopy1;

	@FindBy(css = "#pages-table tbody tr:nth-of-type(1) td:nth-of-type(22) button:nth-of-type(3)")
	private WebElement delete1;

	@FindBy(css = "#pages-table tbody tr:nth-of-type(1) td:nth-of-type(4) button.btn.btn-outline-primary.btn-sm")
	private WebElement showRecipientDetails1;

	@FindBy(css = "#pages-table tbody tr:nth-of-type(1) td:nth-of-type(22) button:nth-of-type(1)")
	private WebElement update1;

	private final String pageLoadedText = "com/cmp/Transco-Lines,-Inc-2/jobs They pay $200k+ for Teams and we are not showing that in the \"advertised_pay_benefits\" results when comparing to 4 other fleets";

	private final String pageUrl = "/admin";

	public Admin() {
	}

	public Admin(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public Admin(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public Admin(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on 1 Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin click1Button1() {
		addCompanyRequestPage1.click();
		return this;
	}

	/**
	 * Click on 1 Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin click2Button1() {
		notificationpagination.click();
		return this;
	}

	/**
	 * Click on Add Company Request Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickAddCompanyRequestButton() {
		addCompanyRequest.click();
		return this;
	}

	/**
	 * Click on Add Notification Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickAddNotificationButton() {
		addNotification.click();
		return this;
	}

	/**
	 * Click on 2 Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickButton2() {
		addCompanyRequestPage2.click();
		return this;
	}

	/**
	 * Click on 3 Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickButton3() {
		addCompanyRequestPage3.click();
		return this;
	}

	/**
	 * Click on 4 Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickButton4() {
		addCompanyRequestPage4.click();
		return this;
	}

	/**
	 * Click on Delete Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickDelete1Button() {
		delete1.click();
		return this;
	}

	/**
	 * Click on Show Recipient Details Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickShowRecipientDetails1Button() {
		showRecipientDetails1.click();
		return this;
	}

	/**
	 * Click on Update Button.
	 *
	 * @return the Admin class instance.
	 */
	public Admin clickUpdate1Button() {
		update1.click();
		return this;
	}

}
