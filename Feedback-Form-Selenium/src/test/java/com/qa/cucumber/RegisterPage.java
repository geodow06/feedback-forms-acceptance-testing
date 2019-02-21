package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"nav-ul\"]/li[5]/a")
	private WebElement register_link;
	
	@FindBy(id="email_response")
	private WebElement email_check_message;
	
	@FindBy(id="password_response")
	private WebElement password_check_message;
	
	@FindBy(id="register_status")
	private WebElement register_status;
	
	public void registerAccount(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		password.submit();
	}
	
	public void clickRegister() {
		register_link.click();
	}
	
	public String invalid_email_message() {
		return email_check_message.getText();
	}
	
	public String invalid_password_message() {
		return password_check_message.getText();
	}
	
	public String register_success_message() {
		return register_status.getText();
	}
}
