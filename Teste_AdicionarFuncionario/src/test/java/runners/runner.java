package runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty", "html: target/cucumber-report"},
			features = "src/test/resources/features/desafio.feature",
			glue = "stepsDefinitions",
//			tags = "@Tags",
			dryRun = true
			
			)
public class runner {

}
