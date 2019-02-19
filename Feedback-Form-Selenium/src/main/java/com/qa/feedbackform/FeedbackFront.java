package com.qa.feedbackform;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedbackFront {

	//direct to the email field in register/login
	@FindBy(id="email")
	private WebElement emailAddress;
	
	//direct to the password field in register/login
	@FindBy(id ="password")
	private WebElement password;
	
	//direct to the view trainees button in the trainer portal
	@FindBy(id="viewTraineesButton")
	private WebElement viewTrainees;
	
	//direct to the view trainees button in the trainer portal
	@FindBy(id="viewCohortsButton")
	private WebElement viewCohorts;
	
	@FindBy(id="searchbar")
	private WebElement searchTrainees;
	
	//simulate registering an account and login with that account (may need to split this)
	public void insertDetails(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
		password.submit();
	}
	
	//simulate searching for a particular trainee by some field
	public void searchForTrainees(String trainee) {
		searchTrainees.sendKeys(trainee);
		searchTrainees.submit();
	}
	
}
