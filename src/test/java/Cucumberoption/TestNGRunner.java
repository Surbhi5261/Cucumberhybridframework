package Cucumberoption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",tags="@sanity", monochrome=true,
publish=true,
plugin= {"pretty","html:target/report/cucumber.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:target/cucumber.json","html:target/report/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

	
	}


