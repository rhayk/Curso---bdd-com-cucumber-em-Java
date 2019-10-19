package pageObject;
import static utils.utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class pageObject {
	
	@FindBy(id = "draggable")
	private WebElement A;
	
	@FindBy(id = "droppable")
	private WebElement B;
	
	public void arrastarEsoltar() {
		Actions acao = new Actions(driver);
		acao.dragAndDrop( A, B).build().perform();
	}

}
