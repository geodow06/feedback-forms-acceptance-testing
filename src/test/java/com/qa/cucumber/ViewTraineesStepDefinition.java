package com.qa.cucumber;

import static org.junit.Assert.*;

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

public class ViewTraineesStepDefinition {

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

	@Given("^I am logged in as a trainer And I want to view the trainees$")
	public void i_am_logged_in_as_a_trainer_And_I_want_to_view_the_trainees() throws Throwable {
		driver.get(Constants.LOGINURL);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.userLogin(Constants.LOGINTESTTRAINEREMAIL, Constants.LOGINTESTPASSWORD);
	}

	@When("^I click the view trainee feedback link$")
	public void i_click_the_view_trainee_feedback_link() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Trainees")));
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.clickTrainees();
	}

	@Then("^the I should be directed to the view trainee feedback page$")
	public void the_I_should_be_directed_to_the_view_trainee_feedback_page() throws Throwable {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("trainees-body")));
		assertEquals("View trainee redirection has failed", Constants.VIEWTRAINEESURL, driver.getCurrentUrl());
	}

}
