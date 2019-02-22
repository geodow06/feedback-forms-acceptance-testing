package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

	@FindBy(linkText = "Login")
	private WebElement login_link;

	@FindBy(linkText = "Register")
	private WebElement register_link;

	@FindBy(linkText = "Cohorts")
	private WebElement cohorts_link;

	@FindBy(linkText = "Trainees")
	private WebElement trainees_link;

	@FindBy(linkText = "Form")
	private WebElement form_link;

	public void clickLogin() {
		login_link.click();
	}

	public void clickRegister() {
		register_link.click();
	}

	public void clickCohorts() {
		cohorts_link.click();
	}

	public void clickTrainees() {
		trainees_link.click();
	}

	public void clickForm() {
		form_link.click();
	}
	
	public boolean trainer_features_visible() {
		if (cohorts_link.isDisplayed() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean trainee_features_visible() {
		if (form_link.isDisplayed() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean create_feedback_link_visible() {
		if (form_link.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}

}
