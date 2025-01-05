package com.itview.selenium_itview_cucumber;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"Feature"},
		glue= {"com.itview.selenium_itview_cucumber"},
		plugin= {"pretty","html:target/cucumber-report.html"}
		)



public class TestRunner {

}
