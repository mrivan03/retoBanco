package co.com.bancolombia.certification.technical_challenge.step_definitions;

import java.util.List;

import co.com.bancolombia.certification.technical_challenge.interactions.loginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Log_In_To_The_Web_Page_stepDefinitions {

	@Steps
	loginSteps LoginSteps;

	@Given("^I am a user of The Ninja Store$")
	public void I_am_a_user_of_The_Ninja_Store() throws Throwable {
		LoginSteps.OpenPage();
	}

	@When("^Input my login data$")
	public void Input_my_login_data(List<String> Data) throws Throwable {
		LoginSteps.InputEmailStep(Data.get(2));
		LoginSteps.InputPasswordStep(Data.get(3));
		LoginSteps.Login();
	}

	@Then("^Successful login$")
	public void Successful_login() throws Throwable {
		LoginSteps.MyAccount();
	}

}
