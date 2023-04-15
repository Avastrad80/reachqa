package com.strategizeqa.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Cometition {
	
	private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(2) div div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement postingDate;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(3) div div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement jobType;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(3) div div.accordion-panel div.panel-content div.content div div:nth-of-type(1) div.accordion-panel header.panel-header a.panel-header-icon")
    private WebElement arrowdropup3;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(3) div div.accordion-panel div.panel-content div.content div div:nth-of-type(2) div.accordion-panel.not-expanded header.panel-header a.panel-header-icon")
    private WebElement arrowdropup4;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(3) div div.accordion-panel div.panel-content div.content div div:nth-of-type(3) div.accordion-panel.not-expanded header.panel-header a.panel-header-icon")
    private WebElement arrowdropup5;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(3) div div.accordion-panel div.panel-content div.content div div:nth-of-type(4) div.accordion-panel.not-expanded header.panel-header a.panel-header-icon")
    private WebElement arrowdropup6;

    @FindBy(id = "Job Postings")
    private WebElement articlejobPostings1;

    @FindBy(css = "button.md-list-item-button.md-list-item-container.md-button-clean")
    private WebElement articlejobPostings2;

    @FindBy(id = "competition")
    private WebElement competition;

    @FindBy(id = "start")
    private WebElement dateFrom;

    @FindBy(id = "end")
    private WebElement dateTo1;

    @FindBy(id = "input-333")
    private WebElement dateTo2;

    @FindBy(name = "radio-263")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul1;

    @FindBy(name = "radio-291")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul10;

    @FindBy(name = "radio-298")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul11;

    @FindBy(name = "radio-298")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul12;

    @FindBy(name = "radio-305")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul13;

    @FindBy(name = "radio-305")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul14;

    @FindBy(name = "radio-312") // Company Driver include
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul15;

    @FindBy(name = "radio-312") // Company Driver exclude
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul16;

    @FindBy(name = "radio-319")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul17;

    @FindBy(name = "radio-319")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul18;

    @FindBy(name = "radio-326")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul19;

    @FindBy(name = "radio-263")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul2;

    @FindBy(name = "radio-326")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul20;

    @FindBy(name = "radio-270")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul3;

    @FindBy(name = "radio-270")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul4;

    @FindBy(name = "radio-277")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul5;

    @FindBy(name = "radio-277")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul6;

    @FindBy(name = "radio-284")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul7;

    @FindBy(name = "radio-284")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul8;

    @FindBy(name = "radio-291")
    private List<WebElement> flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul9;

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "true";

    private final String flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaulValue = "false";

    @FindBy(id = "help")
    private WebElement helpIcon;

    @FindBy(css = "#app div.md-theme-light div.md-app.md-app-internal-drawer.md-layout-column.md-theme-light main.md-app-container.md-flex.md-layout-row.md-theme-light.md-scrollbar div:nth-of-type(1) div.md-toolbar.md-transparent.md-theme-light.md-elevation-0 div.md-toolbar-section-end button.md-button.md-icon-button.md-dense.md-theme-light")
    private WebElement keyboardarrowleft;

    @FindBy(css = "button.md-button.md-icon-button.md-dense.arrow-icon.md-theme-light")
    private WebElement keyboardarrowright;

    @FindBy(name = "radio-139")
    private List<WebElement> lastMonth;

    private final String lastMonthValue = "[object Object]";

    @FindBy(id = "input-341")
    private WebElement locationSearch;

    @FindBy(id = "locations")
    private WebElement locations;

    @FindBy(id = "market")
    private WebElement marketTrends;

    @FindBy(name = "radio-163")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked1;

    @FindBy(name = "radio-191")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked10;

    @FindBy(name = "radio-163")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked2;

    @FindBy(name = "radio-170")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked3;

    @FindBy(name = "radio-170")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked4;

    @FindBy(name = "radio-177")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked5;

    @FindBy(name = "radio-177")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked6;

    @FindBy(name = "radio-184")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked7;

    @FindBy(name = "radio-184")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked8;

    @FindBy(name = "radio-191")
    private List<WebElement> owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked9;

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "true";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "false";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "true";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "false";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "true";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "false";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "true";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "false";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "true";

    private final String owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonuncheckedValue = "false";

    private final String pageLoadedText = "";

    private final String pageUrl = "/competition/job-postings";

    @FindBy(name = "radio-139")
    private List<WebElement> past12Months;

    private final String past12MonthsValue = "[object Object]";

    @FindBy(name = "radio-139")
    private List<WebElement> past3Months;

    private final String past3MonthsValue = "[object Object]";

    @FindBy(name = "radio-139")
    private List<WebElement> past6Months;

    private final String past6MonthsValue = "[object Object]";

    @FindBy(name = "radio-139")
    private List<WebElement> prior30Days;

    private final String prior30DaysValue = "[object Object]";

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(1) div:nth-of-type(4) div:nth-of-type(2) span:nth-of-type(1) button.v-btn.v-btn--is-elevated.v-btn--has-bg.theme--light.v-size--default.primary-run-search-button")
    private WebElement search1;

    @FindBy(css = "#app div.v-application--wrap div.compitition-page-content div:nth-of-type(2) div.top-section div:nth-of-type(2) div.location div:nth-of-type(2) span:nth-of-type(1) button.primary-run-search-button.v-btn.v-btn--is-elevated.v-btn--has-bg.theme--light.v-size--default.primary-run-search-button")
    private WebElement search2;

    @FindBy(name = "radio-232")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam1;

    @FindBy(name = "radio-232")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam2;

    @FindBy(name = "radio-239")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam3;

    @FindBy(name = "radio-239")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam4;

    @FindBy(name = "radio-246")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam5;

    @FindBy(name = "radio-246")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam6;

    @FindBy(name = "radio-253")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam7;

    @FindBy(name = "radio-253")
    private List<WebElement> soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam8;

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "true";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "false";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "true";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "false";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "true";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "false";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "true";

    private final String soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteamValue = "false";

    @FindBy(name = "radio-201")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling1;

    @FindBy(name = "radio-201")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling2;

    @FindBy(name = "radio-208")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling3;

    @FindBy(name = "radio-208")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling4;

    @FindBy(name = "radio-215")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling5;

    @FindBy(name = "radio-215")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling6;

    @FindBy(name = "radio-222")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling7;

    @FindBy(name = "radio-222")
    private List<WebElement> teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling8;

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "true";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "false";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "true";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "false";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "true";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "false";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "true";

    private final String teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWillingValue = "false";

    public Cometition() {
    }

    public Cometition(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Cometition(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Cometition(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickpostingDateLink() {
        postingDate.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickjobTypeLink() {
        jobType.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickArrowdropup3Link() {
        arrowdropup3.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickArrowdropup4Link() {
        arrowdropup4.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickArrowdropup5Link() {
        arrowdropup5.click();
        return this;
    }

    /**
     * Click on Arrowdropup Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickArrowdropup6Link() {
        arrowdropup6.click();
        return this;
    }

    /**
     * Click on Articlejob Postings Button.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickArticlejobPostings1Button() {
        articlejobPostings1.click();
        return this;
    }

    /**
     * Click on Articlejob Postings Button.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickArticlejobPostings2Button() {
        articlejobPostings2.click();
        return this;
    }

    /**
     * Click on Competition Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickCompetitionLink() {
        competition.click();
        return this;
    }

    /**
     * Click on Help Icon Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickHelpIconLink() {
        helpIcon.click();
        return this;
    }

    /**
     * Click on Keyboardarrowleft Button.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickKeyboardarrowleftButton() {
        keyboardarrowleft.click();
        return this;
    }

    /**
     * Click on Keyboardarrowright Button.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickKeyboardarrowrightButton() {
        keyboardarrowright.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Market Trends Link.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickMarketTrendsLink() {
        marketTrends.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickSearch1Button() {
        search1.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the Cometition class instance.
     */
    public Cometition clickSearch2Button() {
        search2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Cometition class instance.
     */
    public Cometition fill() {
        setPrior30DaysRadioButtonField();
        setLastMonthRadioButtonField();
        setPast3MonthsRadioButtonField();
        setPast6MonthsRadioButtonField();
        setPast12MonthsRadioButtonField();
        setDateFromTextField();
        setDateTo1TextField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked1RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked2RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked3RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked4RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked5RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked6RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked7RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked8RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked9RadioButtonField();
        setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked10RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling1RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling2RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling3RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling4RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling5RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling6RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling7RadioButtonField();
        setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling8RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam1RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam2RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam3RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam4RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam5RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam6RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam7RadioButtonField();
        setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam8RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul1RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul2RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul3RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul4RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul5RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul6RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul7RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul8RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul9RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul10RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul11RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul12RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul13RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul14RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul15RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul16RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul17RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul18RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul19RadioButtonField();
        setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul20RadioButtonField();
        setDateTo2TextField();
        setLocationSearchTextField();
        return this;
    }

    /**
     * Set default value to Date From Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setDateFromTextField() {
        return setDateFromTextField(data.get("DATE_FROM"));
    }

    /**
     * Set value to Date From Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setDateFromTextField(String dateFromValue) {
        dateFrom.sendKeys(dateFromValue);
        return this;
    }

    /**
     * Set default value to Date To Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setDateTo1TextField() {
        return setDateTo1TextField(data.get("DATE_TO_1"));
    }

    /**
     * Set value to Date To Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setDateTo1TextField(String dateTo1Value) {
        dateTo1.sendKeys(dateTo1Value);
        return this;
    }

    /**
     * Set default value to Date To Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setDateTo2TextField() {
        return setDateTo2TextField(data.get("DATE_TO_2"));
    }

    /**
     * Set value to Date To Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setDateTo2TextField(String dateTo2Value) {
        dateTo2.sendKeys(dateTo2Value);
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul10RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul10) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul10Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul11RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul11) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul11Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul12RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul12) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul12Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul13RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul13) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul13Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul14RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul14) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul14Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul15RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul15) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul15Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul16RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul16) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul16Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul17RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul17) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul17Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul18RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul18) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul18Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul19RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul19) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul19Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul1RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul1) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul20RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul20) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul20Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul2RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul2) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul3RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul3) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul4RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul4) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul5RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul5) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul5Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul6RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul6) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul6Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul7RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul7) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul7Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul8RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul8) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul8Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedauto Haulerradiobuttonuncheckedradiobuttonuncheckeddoubles Triplesradiobuttonuncheckedradiobuttonuncheckedheavy Haul Specializedradiobuttonuncheckedradiobuttonuncheckedpower Onlyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setFlatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul9RadioButtonField() {
        for (WebElement el : flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul9) {
            if (el.getAttribute("value").equals(flatbedradiobuttonuncheckedradiobuttonuncheckedrefrigeratedradiobuttonuncheckedradiobuttonuncheckedhazmatradiobuttonuncheckedradiobuttonuncheckedtankerradiobuttonuncheckedradiobuttonuncheckedltlradiobuttonuncheckedradiobuttonuncheckedautoHaulerradiobuttonuncheckedradiobuttonuncheckeddoublesTriplesradiobuttonuncheckedradiobuttonuncheckedheavyHaul9Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Last Month Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setLastMonthRadioButtonField() {
        for (WebElement el : lastMonth) {
            if (el.getAttribute("value").equals(lastMonthValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Location Search Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setLocationSearchTextField() {
        return setLocationSearchTextField(data.get("LOCATION_SEARCH"));
    }

    /**
     * Set value to Location Search Text field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setLocationSearchTextField(String locationSearchValue) {
        locationSearch.sendKeys(locationSearchValue);
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked10RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked10) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked10Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked1RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked1) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked2RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked2) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked3RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked3) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked4RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked4) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked5RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked5) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked5Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked6RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked6) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked6Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked7RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked7) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked7Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked8RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked8) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked8Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Owneroperatorradiobuttonuncheckedradiobuttonuncheckedlease Purchaseradiobuttonuncheckedradiobuttonuncheckedstudent Driverradiobuttonuncheckedradiobuttonuncheckedyard Jockeyradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setOwneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked9RadioButtonField() {
        for (WebElement el : owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked9) {
            if (el.getAttribute("value").equals(owneroperatorradiobuttonuncheckedradiobuttonuncheckedleasePurchaseradiobuttonuncheckedradiobuttonuncheckedstudentDriverradiobuttonuncheckedradiobuttonuncheckedyardJockeyradiobuttonuncheckedradiobuttonunchecked9Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Past 12 Months Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setPast12MonthsRadioButtonField() {
        for (WebElement el : past12Months) {
            if (el.getAttribute("value").equals(past12MonthsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Past 3 Months Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setPast3MonthsRadioButtonField() {
        for (WebElement el : past3Months) {
            if (el.getAttribute("value").equals(past3MonthsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Past 6 Months Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setPast6MonthsRadioButtonField() {
        for (WebElement el : past6Months) {
            if (el.getAttribute("value").equals(past6MonthsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Prior 30 Days Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setPrior30DaysRadioButtonField() {
        for (WebElement el : prior30Days) {
            if (el.getAttribute("value").equals(prior30DaysValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam1RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam1) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam2RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam2) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam3RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam3) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam4RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam4) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam5RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam5) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam5Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam6RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam6) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam6Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam7RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam7) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam7Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Solo Or Team Positionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteam Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonuncheckedposting Route Typeincludeexclude Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setSoloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam8RadioButtonField() {
        for (WebElement el : soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam8) {
            if (el.getAttribute("value").equals(soloOrTeamPositionincludeexcludearrowdropupsoloradiobuttonuncheckedradiobuttonuncheckedteamAnyradiobuttonuncheckedradiobuttonuncheckedteam8Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling1RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling1) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling2RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling2) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling3RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling3) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling4RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling4) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling5RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling5) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling5Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling6RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling6) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling6Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling7RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling7) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling7Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Team Anyradiobuttonuncheckedradiobuttonuncheckedteam Establishedradiobuttonuncheckedradiobuttonuncheckedteam Willing To Matchradiobuttonuncheckedradiobuttonunchecked Radio Button field.
     *
     * @return the Cometition class instance.
     */
    public Cometition setTeamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling8RadioButtonField() {
        for (WebElement el : teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling8) {
            if (el.getAttribute("value").equals(teamAnyradiobuttonuncheckedradiobuttonuncheckedteamEstablishedradiobuttonuncheckedradiobuttonuncheckedteamWilling8Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Cometition class instance.
     */
    public Cometition verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the Cometition class instance.
     */
    public Cometition verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}


}
