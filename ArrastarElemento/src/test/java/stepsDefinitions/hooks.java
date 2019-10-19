package stepsDefinitions;
import static utils.utils.*;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before
	public void setUp() {
		acessarSite();
	}
	
	
	
	@After
	public void terDaw(Scenario scenario) {
		capturarScreenshot(scenario);
		
	}

}
