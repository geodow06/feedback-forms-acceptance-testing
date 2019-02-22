package com.qa.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SubmitFeedbackPage {

	@FindBy(id = "form_message")
	private WebElement form_message;

	@FindBy(id = "question1")
	private WebElement q1;

	@FindBy(id = "question2")
	private WebElement q2;

	@FindBy(id = "question3")
	private WebElement q3;

	@FindBy(id = "question4")
	private WebElement q4;

	@FindAll({ @FindBy(tagName = "textarea") })
	private WebElement question_fields;

	public void submit_form(String one, String two, String three, String four) {
		q1.sendKeys(one);
		q2.sendKeys(two);
		q3.sendKeys(three);
		q4.sendKeys(four);
		q4.submit();
	}

	public boolean question_fields_filled() {
		if (question_fields.getAttribute("value") != "") {
			return true;
		} else {
			return false;
		}
	}

	public String submit_form_message() {
		return form_message.getText();
	}

}
