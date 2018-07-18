package co.com.bancolombia.certification.technical_challenge.user_interface;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/login")
public class TheNinjaStoreLoginPage extends PageObject {

	@FindBy(id = "input-email")
	private WebElement TextBoxInputEmail;

	@FindBy(id = "input-password")
	private WebElement TextBoxInputPassword;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement ButtonLogin;

	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[1]")
	private WebElement MyAccountButton;

	@FindBy(xpath = "//*[@id=\"account-login\"]/div[1]")
	private WebElement FailedLogingText;

	public void InputEmail(String Email) {
		TextBoxInputEmail.sendKeys(Email);
	}

	public void InputPassword(String Password) {
		TextBoxInputPassword.sendKeys(Password);
	}

	public void Login() {
		ButtonLogin.click();
	}

	public void MyAccount() {
		MyAccountButton.click();
	}

	public void FailedLoging() {
		FailedLogingText.getText();
	}

}
