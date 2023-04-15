package com.strategizeqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = "com/strategizeqa/stepdefinations")
public class TestRunner  extends AbstractTestNGCucumberTests{

}
