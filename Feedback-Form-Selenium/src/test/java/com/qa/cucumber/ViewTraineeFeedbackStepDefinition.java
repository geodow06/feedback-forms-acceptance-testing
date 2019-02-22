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

public class ViewTraineeFeedbackStepDefinition {

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

	@Given("^I am logged in with a trainer account$")
	public void i_am_logged_in_with_a_trainer_account() throws Throwable {
		driver.get(Constants.LOGINURL);
		ViewTraineeFeedbackPage viewtraineefeedbackpage = PageFactory.initElements(driver,
				ViewTraineeFeedbackPage.class);
		viewtraineefeedbackpage.userLogin("John.Doe@academytrainee.com", "password");
	}

	@When("^I click the view cohort link$")
	public void i_click_the_view_cohort_link() throws Throwable {
		ViewTraineeFeedbackPage viewtraineefeedbackpage = PageFactory.initElements(driver,
				ViewTraineeFeedbackPage.class);
		viewtraineefeedbackpage.click_cohorts_link();
	}

	@Then("^the I should be directed to the view cohort page$")
	public void the_I_should_be_directed_to_the_view_cohort_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Dashboard redirection failed", Constants.VIEWCOHORTSURL, driver.getCurrentUrl());
	}

	@When("^I am on my dashboard$")
	public void i_am_on_my_dashboard() throws Throwable {
		driver.get(Constants.DASHBOARDURL);
	}

	@Then("^the I should be able to see to the view cohort link$")
	public void the_I_should_be_able_to_see_to_the_view_cohort_link() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.DASHBOARDURL);
		ViewTraineeFeedbackPage viewtraineefeedbackpage = PageFactory.initElements(driver,
				ViewTraineeFeedbackPage.class);
		assertTrue("Trainer features not visible", viewtraineefeedbackpage.cohort_link_visible());
	}

	// change this to 'view all cohorts page'
	@Given("^I am on the view cohort page$")
	public void i_am_on_the_view_cohort_page() throws Throwable {
		driver.get(Constants.LOGINURL);
		ViewTraineeFeedbackPage viewtraineefeedbackpage = PageFactory.initElements(driver,
				ViewTraineeFeedbackPage.class);
		viewtraineefeedbackpage.userLogin("John.Doe@academytrainee.com", "password");
		driver.get(Constants.VIEWCOHORTSURL);
	}

	// change this to I click on a cohort
	@When("^I click on a trainee$")
	public void i_click_on_a_trainee() throws Throwable {
		ViewTraineeFeedbackPage viewtraineefeedbackpage = PageFactory.initElements(driver,
				ViewTraineeFeedbackPage.class);
		viewtraineefeedbackpage.choose_cohort();
	}

	// change this to 'view cohort page'
	@Then("^the I should be directed to the view trainee page for that trainee$")
	public void the_I_should_be_directed_to_the_view_trainee_page_for_that_trainee() throws Throwable {
		assertTrue("Cohort page redirection has failed", driver.getPageSource().contains("View Feedback"));
	}
}
