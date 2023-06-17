package Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends TestBase {
	
	LoginObjects lo ;
	
	@Given("User Launches the application")
	public void user_launches_the_application() {
		intilize();
	}

	@When("User tries to Login")
	public void user_tries_to_login() {
	lo = new LoginObjects();
	lo.loginvalidation();
	}

	@Then("Validate whether user is giving proper credentials")
	public void validate_whether_user_is_giving_proper_credentials() {
		lo.propercredentials();
	}

	@And("USer navigates to home page successfuly")
	public void u_ser_navigates_to_home_page_successfuly() {
		lo.successvaliation();
	}
	
	@And("Closes the browser")
	public void closes_the_browser() {
	   lo.teardown();
	}

	

}
