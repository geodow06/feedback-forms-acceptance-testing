package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:CreateAccount.feature", "classpath:Login.feature", "classpath:SubmitFeedback.feature","classpath:ViewTraineeFeedback.feature", 
				"classpath:ViewTrainees.feature"},
		glue = "classpath:org.softpost",
		plugin = "html:target/selenium-reports"
		)

public class Testrunner {

}
