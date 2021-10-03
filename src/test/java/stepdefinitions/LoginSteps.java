package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is on Application landing page")
	public void user_is_on_application_landing_page() {
	   System.out.println("........user is on landing page ......."); 
	}

	@When("User clicks on Sig in button")
	public void user_clicks_on_sig_in_button() {
	    
	}

	@Then("User is displayed on login screen")
	public void user_is_displayed_on_login_screen() {
	    
	}

	@When("User enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	    
	}

	@When("User enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	    
	}

	@When("User clicks Sign in button")
	public void user_clicks_sign_in_button() {
	    
	}

	@Then("User gets login failed error message")
	public void user_gets_login_failed_error_message() {
	    
	}


}
