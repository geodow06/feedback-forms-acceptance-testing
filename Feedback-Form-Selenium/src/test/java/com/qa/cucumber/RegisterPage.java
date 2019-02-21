package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(id = "email")
	private WebElement emailAddress;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"nav-ul\"]/li[5]/a")
	private WebElement register_link;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/form/div[2]/div[2]/p")
	private WebElement email_response;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/form/div[3]/div[2]/p")
	private WebElement password_response;

	@FindBy(id = "error-message")
	private WebElement register_status;

	public void registerAccount(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		password.submit();
	}

	public void clickRegister() {
		register_link.click();
	}

	public String email_validity() {
		if (email_response.getText().contains("valid")) {
			return "valid";
		} else {
			return "invalid";
		}
	}

	public String password_validity() {
		if (password_response.getText().contains("valid")) {
			return "valid";
		} else {
			return "invalid";
		}
	}

	public String register_success_message() {
		return register_status.getText();
	}
}
