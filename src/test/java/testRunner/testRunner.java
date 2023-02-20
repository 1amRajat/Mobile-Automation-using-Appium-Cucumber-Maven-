package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Mobileautomation.feature",
				glue ="stepDefinitions"
                 ,monochrome=true,stepNotifications = true,publish=true
                 ,plugin= {"pretty","html:target/cucumber.html",
                     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                 }
)

public class testRunner {

}
