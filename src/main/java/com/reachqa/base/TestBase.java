package com.reachqa.base;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.reachqa.Keyword;

public class TestBase {

	RemoteWebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		Keyword.openbrowser("Chrome");
		Config conf = new Config();
		System.out.println("Launching url: "+conf.getAppUrl());
		Keyword.launchUrl(conf.getAppUrl());
		
		
	}
	
	@AfterClass
	public void teardow() throws Exception {
	Keyword.driver.close();
	}

}
