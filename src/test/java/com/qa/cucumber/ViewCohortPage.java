package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCohortPage {
	
	
	@FindBy(linkText="Add Cohort")
	private WebElement add_cohort_button;
	
	@FindBy(id="cohort-selection")
	private WebElement cohort_sort_by;

	@FindBy(className="single-cohort")
	private WebElement cohort;
	
	@FindBy(id="cohort-name")
	private WebElement cohort_name;
	
	@FindBy(id="cohort-trainer")
	private WebElement cohort_trainer;
	
	@FindBy(id="cohort-week")
	private WebElement cohort_week;
	
	@FindBy(id="cohort-desc")
	private WebElement cohort_description;
	
	@FindBy(id="register-button")
	private WebElement create_cohort_button;
	
	@FindBy()
	private WebElement cohort_creation_message;
	
	public void add_cohort(String coName, String coTrain, int coWeek, String coDescip) {
		cohort_name.sendKeys(coName);
		cohort_trainer.sendKeys(coTrain);
		cohort_week.sendKeys(String.valueOf(coWeek));
		cohort_description.sendKeys(coDescip);
		create_cohort_button.click();
	}
	
	public void clickAddCohortButton() {
		add_cohort_button.click();
	}
	
	public void cohort_creation() {
		
	}

}
