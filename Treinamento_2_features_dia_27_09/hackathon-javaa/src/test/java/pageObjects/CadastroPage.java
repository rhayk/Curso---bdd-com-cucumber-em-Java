package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Utils.*;

public class CadastroPage {
	
	WebDriverWait espera = new WebDriverWait(driver, 10);
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b")
	private WebElement menuAdmin;

	@FindBy(name = "searchSystemUser[userName]")
	private WebElement pesquisaUser;

	@FindBy(name = "_search")
	private WebElement botaoSearch;
	
	@FindBy(xpath = "//input[@value='Add']")
	private WebElement botaoAdd;
	
	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement campoEmployerName;
	
	@FindBy(name = "systemUser[userName]")
	private WebElement campoUserName;
	
	@FindBy(name = "systemUser[password]")
	private WebElement campoPassword;
	
	@FindBy(name = "systemUser[confirmPassword]")
	private WebElement campoConfirmarPassword;
	
	@FindBy(name = "btnSave")
	private WebElement botaoSalvar;
	
	@FindBy(name = "btnSave")
	private WebElement usuarioCadastrado;
	
	@FindBy(name = "searchSystemUser[userType]")
	private WebElement selectUserRole;
	
	@FindBy(name = "searchSystemUser[status]")
	private WebElement selectStatus;
	
	@FindBy(xpath = "//option[text()='ESS']")
	private WebElement optionESS;
	
	@FindBy(xpath = "//option[text()='Enabled']")
	private WebElement optionEnabled;
	
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement menuAba;
	
	@FindBy(id = "menu_pim_Configuration")
	private WebElement menuSubAba;
	
	@FindBy(id = "menu_pim_configurePim")
	private WebElement campoOptionalFields;
	
	
	
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	public void acessarMenuAdmin() {
		menuAdmin.click();
	}
	
	public void limparCampo() {
		campoEmployerName.clear();
	}

	public void preencherPesquisa(String arg1) {
		pesquisaUser.sendKeys(arg1);
	}

	public void acionarBotaoSearch() {
		botaoSearch.click();
	}
	
	public void informarCampoEmplyerName(String employerName) {
		campoEmployerName.sendKeys(employerName);
	}
	
	public void informarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void informarCampoConfirmarPassword(String confirmarPassword) {
		campoConfirmarPassword.sendKeys(confirmarPassword);
	}
	
	public void acionarBotaoSalvar() {
		espera.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSave")));
		botaoSalvar.click();
	}
	
	public void realizarCadastro(String employerName, String userName, String password, String confirmarPassword) {
		informarCampoEmplyerName(employerName);
		informarCampoUserName(userName);
		informarCampoPassword(password);
		informarCampoConfirmarPassword(confirmarPassword);
		acionarBotaoSalvar();		
	}
	
	public void selecionarUserRole() {
		Select select = new Select(selectUserRole);
		select.selectByVisibleText("ESS");
	}
	
	public void selecionarStatus() {
		selectStatus.click();
		optionEnabled.click();
	}
	
	public void executandoJavascript() throws Exception {
		JavascriptExecutor javaScript = (JavascriptExecutor)driver;
		javaScript.executeScript("alert('Welcome Hackathon!');");
		Thread.sleep(3000);
	}
	
	
	public void mudarMenu() {
		Actions acao = new Actions(driver);
		acao.moveToElement(menuAba).build().perform();
		acao.clickAndHold().build().perform();
		acao.moveToElement(menuSubAba).build().perform();
		acao.release().build().perform();
		
		acao.dragAndDrop(menuAba, menuSubAba).build().perform();
			
	}
	
	public void acessarAbas() {
		moverParaElemento(menuAba);
	}
	


}
