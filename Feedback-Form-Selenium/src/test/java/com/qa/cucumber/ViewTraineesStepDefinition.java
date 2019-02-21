package com.qa.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.feedbackform.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewTraineesStepDefinition {

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

	@Given("^I am logged in as a trainer$")
	public void i_am_logged_in_as_a_trainer() throws Throwable {
		driver.get(Constants.LOGINURL);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin("The.Leet@qa.com", "TrainerPass1!");
	}

	@When("^I click the view trainee feedback link$")
	public void i_click_the_view_trainee_feedback_link() throws Throwable {
		driver.get(Constants.DASHBOARDURL);
		
	}

	@Then("^the I should be directed to the view trainee feedback page$")
	public void the_I_should_be_directed_to_the_view_trainee_feedback_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I visit the view trainee page$")
	public void i_visit_the_view_trainee_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see feedback$")
	public void i_should_be_able_to_see_feedback() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
