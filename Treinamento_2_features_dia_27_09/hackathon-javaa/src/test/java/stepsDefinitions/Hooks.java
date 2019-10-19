package stepsDefinitions;

import static utils.Utils.*;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	 
	@Before(order = 0)
	public void setUp() {
		acessarSistema();
//		Na(LoginPage.class).realizarLogin();
	}
	
	
	@After
	public void tearDown(Scenario scenario) {
		capturarScreenshot(scenario);
//		driver.quit();
	}

}
