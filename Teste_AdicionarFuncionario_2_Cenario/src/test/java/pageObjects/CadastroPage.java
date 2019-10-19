package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPage {

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
		botaoSalvar.click();
	}
	
	public void realizarCadastro(String employerName, String userName, String password, String confirmarPassword) {
		informarCampoEmplyerName(employerName);
		informarCampoUserName(userName);
		informarCampoPassword(password);
		informarCampoConfirmarPassword(confirmarPassword);
		acionarBotaoSalvar();		
	}

}
