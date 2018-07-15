package co.com.bancolombia.certification.technical_challenge.interactions;

import co.com.bancolombia.certification.technical_challenge.user_interface.TheNinjaStoreHomePage;
import net.thucydides.core.annotations.Step;

public class loginSteps {

	TheNinjaStoreHomePage theNinjaStoreHomePage;

	@Step
	public void OpenPage() {
		theNinjaStoreHomePage.open();
	}

	@Step
	public void InputEmailStep(String users) {
		theNinjaStoreHomePage.InputEmail(users);
	}

	@Step
	public void InputPasswordStep(String password) {
		theNinjaStoreHomePage.InputPassword(password);
	}

	@Step
	public void Login() {
		theNinjaStoreHomePage.Login();
	}
	
	@Step
	public void MyAccount() {
		theNinjaStoreHomePage.MyAccount();
	}

}
