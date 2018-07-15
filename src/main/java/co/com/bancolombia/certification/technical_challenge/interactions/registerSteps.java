package co.com.bancolombia.certification.technical_challenge.interactions;

import co.com.bancolombia.certification.technical_challenge.user_interface.TheNinjaStoreRegisterPage;
import net.thucydides.core.annotations.Step;

public class registerSteps {

	TheNinjaStoreRegisterPage theNinjaStoreRegisterPage;

	@Step
	public void OpenPage() {
		theNinjaStoreRegisterPage.open();
	}

	@Step
	public void FirstName(String FirsName) {
		theNinjaStoreRegisterPage.InputFirsName(FirsName);
	}

	@Step
	public void LastName(String Lastname) {
		theNinjaStoreRegisterPage.InputLastname(Lastname);
	}

	@Step
	public void Email(String BoxEmail) {
		theNinjaStoreRegisterPage.InputBoxEmail(BoxEmail);
	}

	@Step
	public void Telephone(String Telephone) {
		theNinjaStoreRegisterPage.InputTelephone(Telephone);
	}

	@Step
	public void Password(String Password) {
		theNinjaStoreRegisterPage.InputPassword(Password);
	}

	@Step
	public void PasswordConfirm(String Confirm) {
		theNinjaStoreRegisterPage.InputConfirm(Confirm);
	}

	@Step
	public void PrivacyPolicy() {
		theNinjaStoreRegisterPage.SelectTerminosCondiciones();
	}

	@Step
	public void Register() {
		theNinjaStoreRegisterPage.PressButtonContinuar();
	}
	
	@Step
	public void ConfirmRegister() {
		theNinjaStoreRegisterPage.PressButtonConfirmRegister();;
	}

}
