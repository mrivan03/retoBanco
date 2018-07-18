package co.com.bancolombia.certification.technical_challenge.user_interface;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/register")
public class TheNinjaStoreRegisterPage extends PageObject {

	@FindBy(id = "input-firstname")
	private WebElement TextBoxFirstName;

	@FindBy(id = "input-lastname")
	private WebElement TextBoxLastname;

	@FindBy(id = "input-email")
	private WebElement TextBoxEmail;

	@FindBy(id = "input-telephone")
	private WebElement TextBoxTelephone;

	@FindBy(id = "input-password")
	private WebElement TextBoxPassword;

	@FindBy(id = "input-confirm")
	private WebElement TextBoxConfirm;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	private WebElement checkboxTerminosCondiciones;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	private WebElement ButtonContinuar;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
	private WebElement ButtonConfirmRegister;

	public void InputFirsName(String FirsName) {
		TextBoxFirstName.sendKeys(FirsName);
	}

	public void InputLastname(String Lastname) {
		TextBoxLastname.sendKeys(Lastname);
	}

	public void InputBoxEmail(String BoxEmail) {
		TextBoxEmail.sendKeys(BoxEmail);
	}

	public void InputTelephone(String Telephone) {
		TextBoxTelephone.sendKeys(Telephone);
	}

	public void InputPassword(String Password) {
		TextBoxPassword.sendKeys(Password);
	}

	public void InputConfirm(String Confirm) {
		TextBoxConfirm.sendKeys(Confirm);
	}

	public void SelectTerminosCondiciones() {
		checkboxTerminosCondiciones.click();
	}

	public void PressButtonContinuar() {
		ButtonContinuar.click();
	}

	public void PressButtonConfirmRegister() {
		ButtonConfirmRegister.click();
	}

}
