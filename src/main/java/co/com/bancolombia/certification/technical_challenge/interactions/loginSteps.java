package co.com.bancolombia.certification.technical_challenge.interactions;

import co.com.bancolombia.certification.technical_challenge.user_interface.TheNinjaStoreLoginPage;
import net.thucydides.core.annotations.Step;

public class loginSteps {

	TheNinjaStoreLoginPage theNinjaStoreLoginPage;

	@Step
	public void OpenPage() {
		theNinjaStoreLoginPage.open();
	}

	@Step
	public void InputEmailStep(String users) {
		theNinjaStoreLoginPage.InputEmail(users);
	}

	@Step
	public void InputPasswordStep(String password) {
		theNinjaStoreLoginPage.InputPassword(password);
	}

	@Step
	public void Login() {
		theNinjaStoreLoginPage.Login();
	}
	
	@Step
	public void MyAccount() {
		theNinjaStoreLoginPage.MyAccount();
	}

}
