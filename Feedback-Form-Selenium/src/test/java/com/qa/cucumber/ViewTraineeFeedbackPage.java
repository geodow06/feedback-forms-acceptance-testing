package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewTraineeFeedbackPage {


	@FindBy(id = "email")
	private WebElement emailAddress;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(linkText = "Cohorts")
	private WebElement cohorts_link;
	
	@FindBy(partialLinkText = "Group")
	private WebElement cohort;
	
	public void userLogin(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		password.submit();
	}

	public void click_cohorts_link() {
		cohorts_link.click();
	}
	
	public void choose_cohort() {
		cohort.click();
	}
	
	public boolean cohort_link_visible() {
		if (cohorts_link.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
