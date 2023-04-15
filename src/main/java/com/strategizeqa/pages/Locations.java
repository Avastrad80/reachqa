package com.strategizeqa.pages;

import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locations {
	private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#app div.v-application--wrap div.locations-grid div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(1) div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement locationOverView;

    @FindBy(css = "#app div.v-application--wrap div.locations-grid div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement driverPopulationStats;

    @FindBy(css = "#app div.v-application--wrap div.locations-grid div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement competitionStats;

    @FindBy(css = "#app div.v-application--wrap div.locations-grid div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(4) div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement driverMarketStats;

    @FindBy(css = "button.v-icon.notranslate.v-icon--link.material-icons.theme--light")
    private WebElement clear;


    @FindBy(css = "a.mapbox-improve-map")
    private WebElement improveThisMap;

    @FindBy(id = "input-137")
    private WebElement location;

    @FindBy(id = "locations")
    private WebElement locations;


    @FindBy(css = "a[title='OpenStreetMap']")
    private WebElement openstreetmap;

    private final String pageLoadedText = "Randall Reilly, past 12 months";

    private final String pageUrl = "/market/locations";

    @FindBy(id = "Locations")
    private WebElement placelocations1;

    @FindBy(css = "button.md-list-item-button.md-list-item-container.md-button-clean")
    private WebElement placelocations2;

    @FindBy(id = "__BVID__149")
    private WebElement showMap;

    public Locations() {
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

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickArrowdropup1Link() {
    	locationOverView.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickArrowdropup2Link() {
    	driverPopulationStats.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickArrowdropup3Link() {
    	competitionStats.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickArrowdropup4Link() {
    	driverMarketStats.click();
        return this;
    }

    /**
     * Click on Clear Button.
     *
     * @return the Locations class instance.
     */
    public Locations clickClearButton() {
        clear.click();
        return this;
    }



    /**
     * Click on Improve This Map Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickImproveThisMapLink() {
        improveThisMap.click();
        return this;
    }



    /**
     * Click on Locations Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickLocationsLink() {
        locations.click();
        return this;
    }


    /**
     * Click on Openstreetmap Link.
     *
     * @return the Locations class instance.
     */
    public Locations clickOpenstreetmapLink() {
        openstreetmap.click();
        return this;
    }

    /**
     * Click on Placelocations Button.
     *
     * @return the Locations class instance.
     */
    public Locations clickPlacelocations1Button() {
        placelocations1.click();
        return this;
    }

    /**
     * Click on Placelocations Button.
     *
     * @return the Locations class instance.
     */
    public Locations clickPlacelocations2Button() {
        placelocations2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Locations class instance.
     */
    public Locations fill() {
        setLocationTextField();
        setShowMapCheckboxField();
        return this;
    }

    /**
     * Set default value to Location Text field.
     *
     * @return the Locations class instance.
     */
    public Locations setLocationTextField() {
        return setLocationTextField(data.get("LOCATION"));
    }

    /**
     * Set value to Location Text field.
     *
     * @return the Locations class instance.
     */
    public Locations setLocationTextField(String locationValue) {
        location.sendKeys(locationValue);
        return this;
    }

    /**
     * Set Show Map Checkbox field.
     *
     * @return the Locations class instance.
     */
    public Locations setShowMapCheckboxField() {
        if (!showMap.isSelected()) {
            showMap.click();
        }
        return this;
    }

    /**
     * Unset Show Map Checkbox field.
     *
     * @return the Locations class instance.
     */
    public Locations unsetShowMapCheckboxField() {
        if (showMap.isSelected()) {
            showMap.click();
        }
        return this;
    }

}




