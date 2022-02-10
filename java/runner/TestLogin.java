package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		     
		features = {"C:\\Users\\Purva\\eclipse-workspace\\bddFramework.HRM\\src\\test\\java\\featureFiles\\Login.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		tags= {"@validcredentials"},
		plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
        "html:Report/cucumberReport"}
		)

public class TestLogin {}