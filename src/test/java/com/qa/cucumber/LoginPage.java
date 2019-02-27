package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "email")
	private WebElement emailAddress;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login_button;

	@FindBy(id = "error-message")
	private WebElement login_status;
	// reset password message
	@FindBy(id = "")
	private WebElement reset_pass_message;

	// reset password link
	@FindBy(id = "forgotten_password")
	private WebElement forgot_pass;
	
	public void userLogin(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		login_button.click();
	}

	public boolean login_successful() {
		if (login_status.getText().contains("invalid")) {
			return false;
		}
		else {
			return true;
		}
	}
	public String login_status_message() {
		return login_status.getText();
	}
	public String reset_password_message() {
		return reset_pass_message.getText();
	}

}
