package stepsDefinitions;



import static org.junit.Assert.assertEquals;
import static utils.utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.pageObject;


public class testeSteps {
	
	@When("eu arrastar um elemento sobre o outro")
	public void eu_arrastar_um_elemento_sobre_o_outro() {
	Na(pageObject.class).arrastarEsoltar();
	}
	
	
	

	@Then("o drag and drop funcionou")
	public void o_drag_and_drop_funcionou() {
		assertEquals("Dropped!"  ,driver.findElement(By.id("droppable")).getText());
	   
	}
}
	

