package com.qa.cucumber;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.feedbackform.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	WebDriverWait wait;

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

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.BASEURL);

	}

	@When("^I am not logged in And I click on the login link$")
	public void i_am_not_logged_in_And_I_click_on_the_login_link() throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.clickLogin();
	}

	@Then("^I am taken to the login page$")
	public void i_am_taken_to_the_login_page() throws Throwable {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.LOGINURL);
		assertEquals("Fail", Constants.LOGINURL, driver.getCurrentUrl());
	}

	@When("^I am logged in And I click on the login link$")
	public void i_am_logged_in_And_I_click_on_the_login_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be directed to the home page$")
	public void i_should_be_directed_to_the_home_page() throws Throwable {
		assertEquals("Home redirection failed", Constants.BASEURL, driver.getCurrentUrl());
	}

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.LOGINURL);
	}

	@When("^I submit my login details And I don't have an account$")
	public void i_submit_my_login_details_And_I_don_t_have_an_account() throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin("DoesNot.Exist@academytrainee.com", "legit1234!");
	}

	@Then("^I should be notified that I need to create an account$")
	public void i_should_be_notified_that_I_need_to_create_an_account() throws Throwable {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		assertEquals("Error", "Account not found", loginpage.login_status_message());
	}

	@When("^I submit my login details And the email is correct And the password is correct$")
	public void i_submit_my_login_details_And_the_email_is_correct_And_the_password_is_correct() throws Throwable {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin("John.Doe@academytrainee.com", "password");

	}

	@Then("^I should be directed to my dashboard$")
	public void i_should_be_directed_to_my_dashboard() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Might need to put a wait in here to give it time to redirect
		assertEquals("Dashboard redirection failed", Constants.DASHBOARDURL, driver.getCurrentUrl());
	}

	@Given("^I am on the forgotten password page$")
	public void i_am_on_the_forgotten_password_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	// Forgotten password not yet implemented
	@When("^I enter a registered email$")
	public void i_enter_a_registered_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^password reset link should be sent$")
	public void password_reset_link_should_be_sent() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter an unregistered email$")
	public void i_enter_an_unregistered_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^password reset should fail$")
	public void password_reset_should_fail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I login to a trainer account$")
	public void i_login_to_a_trainer_account() throws Throwable {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin("The.Trainer@qa.com", "Trainer_pass1");
	}

	@Then("^I should see trainer features on my dashboard$")
	public void i_should_see_trainer_features_on_my_dashboard() throws Throwable {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.DASHBOARDURL);
	}

	@When("^I login to a trainee account$")
	public void i_login_to_a_trainee_account() throws Throwable {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin("The.Trainee@qa.com", "Trainee_pass2");
	}

	@Then("^I should see trainee features on my dashboard$")
	public void i_should_see_trainee_features_on_my_dashboard() throws Throwable {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.DASHBOARDURL);
	}

}
