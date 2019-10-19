package stepsDefinitions;

import io.cucumber.java.pt.*;
import pageObjects.CadastroPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class CadastroSteps {
	CadastroPage cadastro = PageFactory.initElements(driver, CadastroPage.class);
	
	@Dado("que acesse a aba Admin")
	public void queAcesseAAbaAdmin() {
		cadastro.acessarMenuAdmin();
	    
	}

	@Quando("eu pesquisar o user {string}")
	public void euPesquisarOUser(String string) {
		cadastro.preencherPesquisa(string);
	    
	}

	@Quando("acionar o botao search")
	public void acionarOBotaoSearch() {
		cadastro.acionarBotaoSearch();   
	}

	@Entao("a aplicacao exibe o user {string}")
	public void aAplicacaoExibeOUser(String string) {
		assertEquals(string, driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText());
	    
	}
	
	@Quando("eu clicar no botao Add")
	public void euClicarNoBotaoAdd() throws InterruptedException {
		cadastro.acionarBotaoAdd();
		Thread.sleep(1000);
	}

	@Quando("informar no campo Employee Name {string}")
	public void informarNoCampoEmployeeName(String employerName) {
		cadastro.informarCampoEmplyerName(employerName);
	}

	@Quando("informar no campo User Name {string}")
	public void informarNoCampoUserName(String userName) {
		cadastro.informarCampoUserName(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
		cadastro.informarCampoPassword(password);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmarPassword) {
		cadastro.informarCampoConfirmarPassword(confirmarPassword);
	}

	@Quando("clicar no botao salvar")
	public void clicarNoBotaoSalvar() {
		cadastro.acionarBotaoSalvar();
	}

	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String nomeUsuario) {
		assertTrue(driver.findElement(By.xpath("//a[.='" +nomeUsuario+ "']")).isSelected());
	}


}
