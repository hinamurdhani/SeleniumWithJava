package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef {

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.print("hello user_is_on_login_pag");
	}

	@When("^user enter login name and password$")
	public void user_enter_login_name_and_password() {
		System.out.print("hello user_enter_login_name_and_password");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() {
		System.out.print("hello clicks_on_login_button");
	}

	@And("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() {
		System.out.print("hello user_is_navigated_to_home_page");
	}

}
