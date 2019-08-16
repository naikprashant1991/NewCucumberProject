package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Prashant Naik\\Archive_Prashant\\Archive\\Automation Workspace\\MavenCucumberProject\\src\\main\\java\\Features\\login.feature"
		,glue={"StepDefinitions"}
		)

public class TestRunner {

}
