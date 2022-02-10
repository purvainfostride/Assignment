package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		     
		features = {"C:\\Users\\Purva\\eclipse-workspace\\CucumberWithPOM\\src\\test\\java\\features\\OrangeHRM.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		tags= {"@validcredentials"},
		dryRun=true,
		plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
        "html:Report/cucumberReport"}
		)
public class TestLoginPageSteps {

}
