package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report"},
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
		tags = "@dropdown",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false
		)


public class RunnerTest {
	
	

}
