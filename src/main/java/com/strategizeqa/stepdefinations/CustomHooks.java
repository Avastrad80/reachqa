package com.strategizeqa.stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;

import com.strategizeqa.Keyword;
import com.strategizeqa.base.Config;
import com.strategizeqa.pages.LoginToApplication;
import com.strategizeqa.utility.PropDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CustomHooks {
	
	@Before(order = 1)
	public void setup() throws IOException, InterruptedException {
	    Config conf = new Config();
	    Keyword.openbrowser("Chrome");
	    Keyword.launchUrl(conf.getAppUrl());
	    LoginToApplication loa = new LoginToApplication();
		loa.enterUserName(PropDemo.valueFromProp("stage.username"));
		loa.clickContiune();
		loa.enterPassword(PropDemo.valueFromProp("stage.password"));
		loa.loginBtn();
		Keyword.wait(7500);
		
	}

	@After
	public void tearDown() {
	    Keyword.closeBrowser();
	}

}
