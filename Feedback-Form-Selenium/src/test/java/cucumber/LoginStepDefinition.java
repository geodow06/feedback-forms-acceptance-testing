package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.feedbackform.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty(Constants.WEBDRIVER, Constants.CHROMEDRIVER);
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I submit my login details$")
	public void i_submit_my_login_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be notified that I need to create an account$")
	public void i_should_be_notified_that_I_need_to_create_an_account() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be directed to my dashboard$")
	public void i_should_be_directed_to_my_dashboard() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the forgotten password link And enter the registered email$")
	public void i_click_the_forgotten_password_link_And_enter_the_registered_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be notified that an email has been sent with reset instructions$")
	public void i_should_be_notified_that_an_email_has_been_sent_with_reset_instructions() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the forgotten password link And enter the incorrect email$")
	public void i_click_the_forgotten_password_link_And_enter_the_incorrect_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be notified that the email is invalid$")
	public void i_should_be_notified_that_the_email_is_invalid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I am logged in And I am on the home page$")
	public void i_am_logged_in_And_I_am_on_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click login$")
	public void i_click_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be directed to the home page$")
	public void i_should_be_directed_to_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
