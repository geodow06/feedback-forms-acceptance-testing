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

public class SubmitFeedbackStepDefinition {

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

	@Given("^I am on the create feedback page$")
	public void i_am_on_the_create_feedback_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^a field is empty And I click to submit the feedback$")
	public void a_field_is_empty_And_I_click_to_submit_the_feedback() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should receive a message telling me to fill in all fields$")
	public void i_should_receive_a_message_telling_me_to_fill_in_all_fields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^no fields are empty And I click to submit the feedback$")
	public void no_fields_are_empty_And_I_click_to_submit_the_feedback() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should receive a message saying that the feedback has been successfully submitted$")
	public void i_should_receive_a_message_saying_that_the_feedback_has_been_successfully_submitted() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click the create feedback link$")
	public void i_click_the_create_feedback_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the I should be directed to the create feedback page$")
	public void the_I_should_be_directed_to_the_create_feedback_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I visit my dashboard$")
	public void i_visit_my_dashboard() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the I should be able to see the create feedback link$")
	public void the_I_should_be_able_to_see_the_create_feedback_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I am logged out$")
	public void i_am_logged_out() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click to go to the create feedback page$")
	public void i_click_to_go_to_the_create_feedback_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the I should be directed to the home page$")
	public void the_I_should_be_directed_to_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I am logged in with a trainee account And I am on the create feedback page$")
	public void i_am_logged_in_with_a_trainee_account_And_I_am_on_the_create_feedback_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I create my feedback$")
	public void i_create_my_feedback() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the feedback I entered should be the same as what is submitted$")
	public void the_feedback_I_entered_should_be_the_same_as_what_is_submitted() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
