package co.com.bancolombia.certification.technical_challenge.step_definitions;

import java.util.List;

import co.com.bancolombia.certification.technical_challenge.interactions.registerSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Register_To_The_Web_Page_stepDefinitions {
	
	@Steps
	registerSteps RegisterSteps;

	@Given("^I want be a user of The Ninja Store$")
	public void I_want_be_a_user_of_The_Ninja_Store() throws Throwable {
		RegisterSteps.OpenPage();
	}

	@When("^Input my register data$")
	public void Input_my_register_data(List<String> Data) throws Throwable {
		RegisterSteps.FirstName(Data.get(5));
		RegisterSteps.LastName(Data.get(6));
		RegisterSteps.Email(Data.get(7));
		RegisterSteps.Telephone(Data.get(8));
		RegisterSteps.Password(Data.get(9));
		RegisterSteps.PasswordConfirm(Data.get(9));
		RegisterSteps.PrivacyPolicy();
		RegisterSteps.Register();
	}

	@Then("^Successful Register$")
	public void Successful_login() throws Throwable {
		RegisterSteps.ConfirmRegister();		
	}

}
