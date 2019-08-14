package com.Se.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class SeTestRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(

			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucmber-report.html/",
					"json:target/cucumber-reports/cucumber-report.json/","junit:target/cucumber-reports/junit-report.xml"},
			dryRun=false,
			features ={"src/test/resources/features"},
			glue ="com.Test.EO",tags={"~@avoid"})
	
	public class edgeopsApiTestRunner extends AbstractTestNGCucumberTests {


	}


}
