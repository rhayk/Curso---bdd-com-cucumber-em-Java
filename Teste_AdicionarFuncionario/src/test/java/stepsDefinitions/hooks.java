package stepsDefinitions;


import static utils.utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

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
