package cucumberTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id ="password")
	private WebElement password;
	
	//reset password message
	@FindBy(id="")
	private WebElement reset_pass_message;
	
	//reset password link
	@FindBy(id="forgotten_password")
	private WebElement forgot_pass;
	
	@FindBy(id="login_button")
	private WebElement login_button;
	
	//simulate login with an account
	public void userLogin(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		password.submit();
	}
	
	public String reset_password_message() {
		return reset_pass_message.getText();
	}
	

}
