package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class ArrastarESoltarPage {
	 
	@FindBy(id = "draggable")
	private WebElement caixa1;

	@FindBy(id = "droppable")
	private WebElement caixa2;
	
	public void arrastarSoltar() {
		Actions acao = new Actions(driver);
		acao.dragAndDrop(caixa1, caixa2).build().perform();
	}

}
