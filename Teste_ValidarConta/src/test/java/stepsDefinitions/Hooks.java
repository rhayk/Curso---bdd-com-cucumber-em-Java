package stepsDefinitions;
import static utils.Utils.acessarSite;
import static utils.Utils.capturarScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		acessarSite();
	}
	
	@After
	public void terDaw(Scenario scenario) {
		capturarScreenshot(scenario);
		
	}

}
