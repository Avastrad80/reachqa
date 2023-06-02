package com.strategizeqa.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strategizeqa.Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionMark {
	
	private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#md-input-y4eifv1iu")
    private WebElement emailAddress;

    @FindBy(css = "#md-input-4otigilc")
    private WebElement firstName;

    @FindBy(css = "#md-input-ofxjma25b")
    private WebElement lastName;

    private final String pageLoadedText = "How Can We Help You";

    private final String pageUrl = "/help";

    @FindBy(css = "button.green-button.v-btn.v-btn--is-elevated.v-btn--has-bg.theme--light.v-size--default")
    private WebElement send;

    @FindBy(css = "#md-textarea-0geuwdk6p")
    private WebElement whatCanWeHelpYouWith;

    public QuestionMark() {
    	PageFactory.initElements(Keyword.driver, this);
    }

    public QuestionMark(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public QuestionMark(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public QuestionMark(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Send Button.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark clickSendButton() {
        send.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark fill() {
        setFirstNameTextField();
        setLastNameTextField();
        setEmailAddressTextField();
        setWhatCanWeHelpYouWithTextareaField();
        return this;
    }

    /**
     * Set default value to Email Address Text field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setEmailAddressTextField() {
        return setEmailAddressTextField(data.get("EMAIL_ADDRESS"));
    }

    /**
     * Set value to Email Address Text field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setEmailAddressTextField(String emailAddressValue) {
        emailAddress.sendKeys(emailAddressValue);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setFirstNameTextField() {
        return setFirstNameTextField(data.get("FIRST_NAME"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setFirstNameTextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setLastNameTextField() {
        return setLastNameTextField(data.get("LAST_NAME"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setLastNameTextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set default value to What Can We Help You With Today Textarea field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setWhatCanWeHelpYouWithTextareaField() {
        return setWhatCanWeHelpYouWithTextareaField(data.get("WHAT_CAN_WE_HELP_YOU_WITH"));
    }

    /**
     * Set value to What Can We Help You With Today Textarea field.
     *
     * @return the QuestionMark class instance.
     */
    public QuestionMark setWhatCanWeHelpYouWithTextareaField(String whatCanWeHelpYouWithValue) {
        whatCanWeHelpYouWith.sendKeys(whatCanWeHelpYouWithValue);
        return this;
    }



}
