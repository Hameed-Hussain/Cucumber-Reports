package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Reports.feature"},glue= {"org.step"},plugin= {"json:C:\\Users\\Admin\\eclipse-workspace\\CucumberReports\\target\\Adactin.json"})
public class TestRunner {

	
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\Admin\\eclipse-workspace\\CucumberReports\\target\\Adactin.json");

	}
}
