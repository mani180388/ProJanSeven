package com.straive.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	      features = {"C:\\Users\\Peter Praveen\\eclipse-workspace\\CheapAir_WebApp_Junit\\src\\test\\resources\\Features"},
	      glue = {"com.straive.stepdefinition"},
	      monochrome = true,
	      dryRun = false,
	    		  plugin= {"html:Reports/HtmlReports.html", "json:Reports/jsonReports.json"
							,"rerun:Rerun/failedTest.txt"}
	      )


public class CucumberRunnerTests {
	
}