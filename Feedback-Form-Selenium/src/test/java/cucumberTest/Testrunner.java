package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature/CreateAccount.feature"},
		glue = {"C:\\Users\\Admin\\git\\feedback-forms-acceptance-testing\\Feedback-Form-Selenium\\src\\test\\java\\cucumber"}, 
		strict = true,
		plugin = "html:target/selenium-reports"
		)

public class Testrunner {

}
