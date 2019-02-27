package com.qa.cucumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.feedbackform.Constants;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewCohortStepDefinition {

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

	@Given("^I am logged in as a trainer And I want to view the cohorts$")
	public void i_am_logged_in_with_a_trainer_account_And_I_want_to_view_the_cohorts() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.LOGINURL);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin(Constants.LOGINTESTTRAINEREMAIL, Constants.LOGINTESTPASSWORD);
	}
	
	@When("^I click on the cohorts link$")
	public void i_click_on_the_cohorts_link() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cohorts")));
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.clickCohorts();
	}

	@Then("^I should be directed to the view cohorts page$")
	public void i_should_be_directed_to_the_view_cohorts_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Dashboard redirection failed", Constants.VIEWCOHORTSURL, driver.getCurrentUrl());
	}

	@Given("^I am on the cohorts page$")
	public void i_am_on_the_cohorts_page() throws Throwable {

		driver.get(Constants.VIEWCOHORTSURL);
	}

	@When("^I click on the add cohort button$")
	public void i_click_on_the_add_cohort_button() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Cohort")));
		ViewCohortPage viewcohortpage = PageFactory.initElements(driver, ViewCohortPage.class);
		viewcohortpage.clickAddCohortButton();
	}

	@Then("^I should be directed to the create cohort page$")
	public void i_should_be_directed_to_the_create_cohort_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button")));
		
	}

	@Given("^I am on the create cohort page$")
	public void i_am_on_the_create_cohort_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("^I enter cohort details$")
	public void i_enter_cohort_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ViewCohortPage viewcohortpage = PageFactory.initElements(driver, ViewCohortPage.class);
		viewcohortpage.add_cohort("December 2018", "Mathew Hunt", 4, "Java SE");
	}

	@Then("^I want to verify that the cohort has been created$")
	public void i_want_to_verify_that_the_cohort_has_been_created() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
