package stepsDefinitions;

import io.cucumber.java.pt.*;
import pageObjects.CadastroPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;



public class CadastroSteps {
	
	@Dado("que acesse a aba Admin")
	public void queAcesseAAbaAdmin() {
		Na(CadastroPage.class).acessarMenuAdmin();
	    
	}

	@Quando("eu pesquisar o user {string}")
	public void euPesquisarOUser(String string) {
		Na(CadastroPage.class).preencherPesquisa(string);
	    
	}

	@Quando("acionar o botao search")
	public void acionarOBotaoSearch() {
		Na(CadastroPage.class).acionarBotaoSearch();   
	}

	@Entao("a aplicacao exibe o user {string}")
	public void aAplicacaoExibeOUser(String string) {
		assertEquals(string, driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText());
	    
	}
	
	@Quando("eu clicar no botao Add")
	public void euClicarNoBotaoAdd() throws InterruptedException {
		Na(CadastroPage.class).acionarBotaoAdd();
		Thread.sleep(5000);
	}

	@Quando("informar no campo Employee Name {string}")
	public void informarNoCampoEmployeeName(String employerName) {
		Na(CadastroPage.class).informarCampoEmplyerName(employerName);
	}

	@Quando("informar no campo User Name {string}")
	public void informarNoCampoUserName(String userName) {
		Na(CadastroPage.class).informarCampoUserName(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
		Na(CadastroPage.class).informarCampoPassword(password);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmarPassword) {
		Na(CadastroPage.class).informarCampoConfirmarPassword(confirmarPassword);
	}

	@Quando("clicar no botao salvar")
	public void clicarNoBotaoSalvar() {
		Na(CadastroPage.class).acionarBotaoSalvar();
	}

	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String nomeUsuario) {
		assertTrue(driver.findElement(By.xpath("//a[.='" +nomeUsuario+ "']")).isDisplayed());
	}
	@Quando("selecionar o User Role")
	public void selecionarOUserRole() {
	    Na(CadastroPage.class).selecionarUserRole();
	}

	@Quando("selecionar o status")
	public void selecionarOStatus() throws Exception {
		Na(CadastroPage.class).selecionarStatus();
		//Na(CadastroPage.class).executandoJavascript();
	    
	}

	@Entao("o sistema realiza a consulta")
	public void oSistemaRealizaAConsulta() {
		assertFalse(driver.findElement(By.xpath("//td[text()='Admin']")).isDisplayed());
	    
	}
	
	@Dado("mude o menu")
	public void mudeOMenu() {
		Na(CadastroPage.class).mudarMenu();
	}


}
