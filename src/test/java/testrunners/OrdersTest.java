package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/order.feature"},
                glue = {"stepdefinitions"},
              //  tags = "",
                plugin = {"pretty"},
                monochrome = true
)
public class OrdersTest {
	

}
