package cucumberTest;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.feedbackform.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition {

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

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.BASEURL);
	}

	@When("^I click the register link$")
	public void i_click_the_register_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.clickRegister();
	}

	@Then("^I be directed to the reach the register page$")
	public void i_be_directed_to_the_reach_the_register_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals("Failed", Constants.REGISTERURL, driver.getCurrentUrl());
	}

	@Given("^I am on the register page And I do not have a QA email$")
	public void i_am_on_the_register_page_And_I_do_not_have_a_QA_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.REGISTERURL);
	}

	@When("^I try to register an account$")
	public void i_try_to_register_an_account() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("test_email1.co.uk", "password1!");
	}

	@Then("^it should fail$")
	public void it_should_fail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Fail", "Email address must be a qa or academytrainee address",
		registerpage.invalid_email_message());
	}

	@Given("^I am on the register page And I have a QA email$")
	public void i_am_on_the_register_page_And_I_have_a_QA_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.REGISTERURL);
	}

	@When("^I try to create an account$")
	public void i_try_to_create_an_account() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "pass");
	}

	@Then("^it should succeed$")
	public void it_should_succeed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Succeed", "Email address must be a qa or academytrainee address",
		registerpage.invalid_email_message());
	}

	@Given("^I am on the register page And I have entered my QA email$")
	public void i_am_on_the_register_page_And_I_have_entered_my_QA_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.REGISTERURL);
	}

	@When("^I enter my QA email and a valid password$")
	public void i_enter_my_QA_email_and_a_valid_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "pass");
	}

	@Then("^I should be notified that the account already exists$")
	public void i_should_be_notified_that_the_account_already_exists() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Succeed", "Account already exists", registerpage.register_success_message());
	}

	@Given("^I am on the register page And I have entered a QA trainer email$")
	public void i_am_on_the_register_page_And_I_have_entered_a_QA_trainer_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.REGISTERURL);
	}

	@When("^I login to my account And I go to the home page$")
	public void i_login_to_my_account_And_I_go_to_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@qa.com", "pass");	}

	@Then("^I should see trainer features$")
	public void i_should_see_trainer_features() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.DASHBOARDURL);
		
	}

	@Given("^I am on the register page And I have entered a QA trainee email$")
	public void i_am_on_the_register_page_And_I_have_entered_a_QA_trainee_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "pass");	}

	@Then("^I should see trainee features$")
	public void i_should_see_trainee_features() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.DASHBOARDURL);
	}

	@When("^I enter a secure password$")
	public void i_enter_a_secure_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the account creation should succeed$")
	public void the_account_creation_should_succeed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter an insecure password$")
	public void i_enter_an_insecure_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the account creation should fail$")
	public void the_account_creation_should_fail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
