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

public class LoginStepDefinition {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty(Constants.WEBDRIVER, Constants.CHROMEDRIVER);
		driver = new ChromeDriver();
//		System.setProperty("phantomjs.binary.path", Constants.PHANTOMJS);
//		driver = new PhantomJSDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}



}
