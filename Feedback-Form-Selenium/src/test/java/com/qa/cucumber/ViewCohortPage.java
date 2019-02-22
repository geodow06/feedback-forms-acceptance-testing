package com.qa.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ViewCohortPage {

	public WebDriver driver;
	
	@FindBy(className="add")
	private WebElement addTrainee;
	
	@FindBy(className="assigned-trainees")
	private WebElement assignedTrainees;
	
	public void moveTrainee(WebElement addTrainee) {
		new Actions(driver).
		moveToElement(addTrainee).clickAndHold()
		.moveToElement(assignedTrainees).release()
		.perform();	
	}
}
