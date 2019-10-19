package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ArrastarESoltarPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ArrastarESoltarSteps {
	
	@Quando("eu arrastar um elemento sobre o outro")
	public void euArrastarUmElementoSobreOOutro() {
	    Na(ArrastarESoltarPage.class).arrastarSoltar();
	}

	@Entao("o drag and drop funcionou")
	public void oDragAndDropFuncionou()  {
	   assertEquals("Dropped!", driver.findElement(By.id("droppable")).getText());
	}
	

}
