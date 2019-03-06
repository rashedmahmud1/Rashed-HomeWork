package com.tt.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		features = {"Features"},
		glue = {"com.tt.Steps"},
		tags = {"@UserAccess"}
		)
public class testNGTestrunner extends AbstractTestNGCucumberTests{
	
}
	
	
