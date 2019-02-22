package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "email")
	private WebElement emailAddress;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"nav-ul\"]/li[7]/a") 
	private WebElement login_link;

	@FindBy()
	private WebElement login_status;
	// reset password message
	@FindBy(id = "")
	private WebElement reset_pass_message;

	// reset password link
	@FindBy(id = "forgotten_password")
	private WebElement forgot_pass;

	@FindBy(partialLinkText = "Cohorts")
	private WebElement trainer_link_cohorts;
	
	@FindBy(partialLinkText = "Form")
	private WebElement trainee_link_form;
	
	public void clickLogin() {
		login_link.click();
	}

	public void userLogin(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		password.submit();
	}

	public String login_status_message() {
		return login_status.getText();
	}

	public String reset_password_message() {
		return reset_pass_message.getText();
	}
	
	public boolean trainer_features_visible() {
		if (trainer_link_cohorts.isDisplayed() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean trainee_features_visible() {
		if (trainee_link_form.isDisplayed() == true) {
			return true;
		}
		else {
			return false;
		}
	}

}
