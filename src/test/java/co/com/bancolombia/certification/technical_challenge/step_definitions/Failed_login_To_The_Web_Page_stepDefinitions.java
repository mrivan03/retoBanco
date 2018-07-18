package co.com.bancolombia.certification.technical_challenge.step_definitions;

import java.util.List;

import co.com.bancolombia.certification.technical_challenge.interactions.loginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Failed_login_To_The_Web_Page_stepDefinitions {

	@Steps
	loginSteps LoginSteps;

	@Given("^I want a Failed login$")
	public void I_want_a_Failed_login() throws Throwable {
		LoginSteps.OpenPage();
	}

	@When("^Input wrong data$")
	public void Input_wrong_data(List<String> Data) throws Throwable {
		LoginSteps.InputEmailStep(Data.get(2));
		LoginSteps.InputPasswordStep(Data.get(3));
		LoginSteps.Login();
	}

	@Then("^Successful Failed login$")
	public void Successful_Failed_login() throws Throwable {
		LoginSteps.FailedLoging();
	}

}
