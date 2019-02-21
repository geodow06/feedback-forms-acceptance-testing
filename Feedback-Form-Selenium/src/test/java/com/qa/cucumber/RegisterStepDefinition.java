package com.qa.cucumber;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
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
		System.setProperty("phantomjs.binary.path", Constants.PHANTOMJS);
		driver = new PhantomJSDriver();
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
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.clickRegister();
	}

	@Then("^I should be directed to the register page$")
	public void i_should_be_directed_to_the_register_page() throws Throwable {
		assertEquals("Failed", Constants.REGISTERURL, driver.getCurrentUrl());
	}

	@Given("^I am on the register page$")
	public void i_am_on_the_register_page() throws Throwable {
		driver.get(Constants.REGISTERURL);
	}

	@When("^I try to register an account And I do not have a QA email$")
	public void i_try_to_register_an_account_And_I_do_not_have_a_QA_email() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("test_email1.co.uk", "password1!");
	}

	@Then("^I should be notified that the email is invalid$")
	public void i_should_be_notified_that_the_email_is_invalid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Fail", "Email address must be a qa or academytrainee address",
				registerpage.invalid_email_message());
	}

	@When("^I try to create an account And I have a QA email$")
	public void i_try_to_create_an_account_And_I_have_a_QA_email() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "pass");
	}

	@Then("^should be notified that the email is valid$")
	public void should_be_notified_that_the_email_is_valid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Succeed", "Email address must be a qa or academytrainee address",
				registerpage.invalid_email_message());
	}

	@When("^I try to create an account And the account already exists$")
	public void i_try_to_create_an_account_And_the_account_already_exists() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "pass");
	}

	@Then("^I should be notified that the account already exists$")
	public void i_should_be_notified_that_the_account_already_exists() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Fail", "Account already exists", registerpage.register_success_message());
	}

	@When("^I try to create an account And the password is secure$")
	public void i_try_to_create_an_account_And_the_password_is_secure() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "passWORD123!!!");
	}

	@Then("^I should be notified that the password is valid$")
	public void i_should_be_notified_that_the_password_is_valid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Fail", "Password is valid", registerpage.invalid_password_message());
	}

	@When("^I try to create an account And the password is not secure$")
	public void i_try_to_create_an_account_And_the_password_is_not_secure() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		registerpage.registerAccount("John.Doe@academytrainee.com", "123");
	}

	@Then("^I should be notified that the password is invalid$")
	public void i_should_be_notified_that_the_password_is_invalid() throws Throwable {
		RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
		assertEquals("Fail", "Password between 6 and 18 characters", registerpage.invalid_password_message());
	}

}
