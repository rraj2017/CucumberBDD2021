package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/Search.feature"},
                glue = {"stepdefinitions","hooks"},
                plugin = {"pretty"},
                tags ="@Smoke or @Regression",
                monochrome = true
)
public class AmazonTest {
	

}
