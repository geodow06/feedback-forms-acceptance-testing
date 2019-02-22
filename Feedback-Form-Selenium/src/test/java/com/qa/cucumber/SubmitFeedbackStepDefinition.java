package com.qa.cucumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.feedbackform.Constants;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubmitFeedbackStepDefinition {

	WebDriver driver;

	@Before
	public void setup() {

		System.setProperty(Constants.CHROMEDRIVER, Constants.HEADLESSCHROME);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Given("^I am on the create feedback page$")
	public void i_am_on_the_create_feedback_page() throws Throwable {
		driver.get(Constants.BASEURL);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin(Constants.TESTTRAINEREMAIL, Constants.GOODPWD);
		driver.get(Constants.FORMURL);
	}

	@When("^a field is empty And I click to submit the feedback$")
	public void a_field_is_empty_And_I_click_to_submit_the_feedback() throws Throwable {
		SubmitFeedbackPage submitfeedbackpage = PageFactory.initElements(driver, SubmitFeedbackPage.class);
		submitfeedbackpage.submit_form("", "", "", "");
	}

	@Then("^I should receive a message telling me to fill in all fields$")
	public void i_should_receive_a_message_telling_me_to_fill_in_all_fields() throws Throwable {
		SubmitFeedbackPage submitfeedbackpage = PageFactory.initElements(driver, SubmitFeedbackPage.class);
		assertEquals("Error", Constants.FEEDBACKFORMEMPTYFIELDMESSAGE, submitfeedbackpage.submit_form_message());
	}

	@When("^no fields are empty And I click to submit the feedback$")
	public void no_fields_are_empty_And_I_click_to_submit_the_feedback() throws Throwable {
		SubmitFeedbackPage submitfeedbackpage = PageFactory.initElements(driver, SubmitFeedbackPage.class);
		submitfeedbackpage.submit_form("Form", "submission", "has", "succeded");
	}

	@Then("^I should receive a message saying that the feedback has been successfully submitted$")
	public void i_should_receive_a_message_saying_that_the_feedback_has_been_successfully_submitted() throws Throwable {
		SubmitFeedbackPage submitfeedbackpage = PageFactory.initElements(driver, SubmitFeedbackPage.class);
		assertEquals("Error", Constants.FEEDBACKFORMSUCCESSMESSAGE, submitfeedbackpage.submit_form_message());
	}

	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		driver.get(Constants.LOGINURL);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin(Constants.TESTTRAINEEEMAIL, Constants.GOODPWD);
	}

	@When("^I click the create feedback link$")
	public void i_click_the_create_feedback_link() throws Throwable {
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.clickForm();
	}

	@Then("^the I should be directed to the create feedback page$")
	public void the_I_should_be_directed_to_the_create_feedback_page() throws Throwable {
		assertEquals("Feedback form redirection has failed", Constants.FORMURL, driver.getCurrentUrl());
	}

	@When("^I visit my dashboard$")
	public void i_visit_my_dashboard() throws Throwable {
		driver.get(Constants.DASHBOARDURL);
	}

	@Then("^the I should be able to see the create feedback link$")
	public void the_I_should_be_able_to_see_the_create_feedback_link() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.DASHBOARDURL);
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		assertTrue("Form link not visible", dashboardpage.create_feedback_link_visible());
	}

	// this whole test thread needs to be changed to coincide with how the webpage
	// works
//	@Given("^I am logged out$")
//	public void i_am_logged_out() throws Throwable {
//		driver.get(Constants.BASEURL);
//	}
//
//	@When("^I click to go to the create feedback page$")
//	public void i_click_to_go_to_the_create_feedback_page() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@Then("^the I should be directed to the home page$")
//	public void the_I_should_be_directed_to_the_home_page() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}

}
