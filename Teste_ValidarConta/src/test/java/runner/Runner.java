package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty", "html: target/cucumber-report"},
			features = "src\\test\\resources\\features\\ultimoprojeto.feature",
			glue = "stepsDefinitions",
			dryRun = false,
			monochrome = true, 
			//tags = "@Tags", 
			snippets = SnippetType.CAMELCASE
			
			)
public class Runner {

}
