package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/registration.feature"},
                glue = {"stepdefinitions"},
                //tags = "@All",
                plugin = {"pretty",
                		"json:target/MyReports/report.json",
                		 "junit:target/MyReports/report.xml"
                		},
                monochrome = true ,
                dryRun = false
)
public class UserRegTest {
	

}
