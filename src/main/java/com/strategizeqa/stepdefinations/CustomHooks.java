package com.strategizeqa.stepdefinations;

import com.strategizeqa.Keyword;
import com.strategizeqa.base.Config;
import com.strategizeqa.helper.LoginHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CustomHooks {
	
	@Before(order = 1)
	public void setup() {
	    Config conf = new Config();
	    Keyword.openbrowser("Chrome");
	    Keyword.launchUrl(conf.getAppUrl());
	    LoginHelper.setDriver(Keyword.getDriver());
	}

	@Before(order = 2)
	public void login() {
	    LoginHelper loginhelp = new LoginHelper();
	    loginhelp.login("myUserId", "myPassword");
	}

	@After
	public void tearDown() {
	    Keyword.closeBrowser();
	}

}
