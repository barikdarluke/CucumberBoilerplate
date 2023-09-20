package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("is on login page")
	public void is_on_login_page() {
	    System.out.println("Inside on the Login page");
	}

	@When("user click enter username and password")
	public void user_click_enter_username_and_password() {
		 System.out.println("Inside step for username and password");
	}

	@And("click on the login button")
	public void click_on_the_login_button() {
		 System.out.println("Inside click login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		 System.out.println("Inside navigate to homepage");
	}




}
