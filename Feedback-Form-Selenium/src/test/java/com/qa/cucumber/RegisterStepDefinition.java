package com.qa.cucumber;

import static org.junit.Assert.*;

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

public class RegisterStepDefinition {

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

	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
		driver.get(Constants.BASEURL);
	}

	@When("^I click the register link$")
	public void i_click_the_register_link() throws Throwable {
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.clickRegister();
	}

	@Then("^I should be directed to the register page$")
	public void i_should_be_directed_to_the_register_page() throws Throwable {
		assertEquals("Registraion page redirection has failed", Constants.REGISTERURL, driver.getCurrentUrl());
	}

	@Given("^I am on the register page$")
	public void i_am_on_the_register_page() throws Throwable {
		driver.get(Constants.REGISTERURL);
	}

	@When("^I try to register an account And I do not have a QA email$")
	public void i_try_to_register_an_account_And_I_do_not_have_a_QA_email() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount(Constants.TESTRANDOMEMAIL, Constants.GOODPWD);
	}

	@Then("^I should be notified that the email is invalid$")
	public void i_should_be_notified_that_the_email_is_invalid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Email validity check has failed", Constants.REGISTERINVALIDMESSAGE, registerpage.email_validity());
	}

	@When("^I try to create an account And I have a QA email$")
	public void i_try_to_create_an_account_And_I_have_a_QA_email() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount(Constants.TESTTRAINEEEMAIL, Constants.GOODPWD);
	}

	@Then("^should be notified that the email is valid$")
	public void should_be_notified_that_the_email_is_valid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertNotEquals("Email validity check has failed", Constants.REGISTERVALIDMESSAGE, registerpage.email_validity());
	}

	@When("^I try to create an account And the account already exists$")
	public void i_try_to_create_an_account_And_the_account_already_exists() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount(Constants.TESTTRAINEEEMAIL, Constants.GOODPWD);
	}

	@Then("^I should be notified that the account already exists$")
	public void i_should_be_notified_that_the_account_already_exists() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Fail", Constants.ACCOUNTALREADYEXISTSMESSAGE, registerpage.register_success_message());
	}

	@When("^I try to create an account And the password is secure$")
	public void i_try_to_create_an_account_And_the_password_is_secure() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount(Constants.UNREGISTEREDEMAIL, Constants.GOODPWD);
	}

	@Then("^I should be notified that the password is valid$")
	public void i_should_be_notified_that_the_password_is_valid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Password is valid", Constants.REGISTERVALIDMESSAGE, registerpage.password_validity());
	}

	@When("^I try to create an account And the password is not secure$")
	public void i_try_to_create_an_account_And_the_password_is_not_secure() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount(Constants.UNREGISTEREDEMAIL, Constants.BADPWD);
	}

	@Then("^I should be notified that the password is invalid$")
	public void i_should_be_notified_that_the_password_is_invalid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Password is invalid", Constants.REGISTERINVALIDMESSAGE, registerpage.password_validity());
	}

}
