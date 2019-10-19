package stepsDefinitions;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreinamentoSteps {
	
	@Given("que abriu o navegador validar site")
	public void queAbriuONavegadorValidarSite() {
	   //validar se é o site do seu barriga  Id "//a[@class="navbar-brand"]"
		String nome = "Seu Barriga";
		assertEquals(nome ,driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]")).getText());
		
		
		
	}

	@When("inserir usuario")
	public void inserirUsuario() {
	   driver.findElement(By.id("email")).sendKeys("rhaykvini@gmail.com");
	}

	@When("inserir senha")
	public void inserirSenha() {
		 driver.findElement(By.id("senha")).sendKeys("rhayk54321");
		
	}

	@Then("clicar no botao para entrar")
	public void clicarNoBotaoParaEntrar() {
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("validar que esta logado no site")
	public void validarQueEstaLogadoNoSite() {
		String nome1 = "Bem vindo, Rhayk Vinicius Damacena Alves!";
		assertEquals(nome1 ,driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]")).getText());
		
	}
	

	@Then("clicar na aba contas")
	public void clicarNaAbaContas() {
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
	}

	@Then("clicar na aba adicionar conta")
	public void clicarNaAbaAdicionarConta() {
	    
		driver.findElement(By.xpath("//a[@href=\"/addConta\"]")).click();
		
	}
	

	@Then("validar se esta na pagina para adicionar conta")
	public void validarSeEstaNaPaginaParaAdicionarConta() {
		String nome2 = "nome";
		assertEquals(nome2 ,driver.findElement(By.xpath("//label[@for=\"nome\"]")).getText());
		
	}

	@Then("adicionar conta")
	public void adicionarConta() { 
		
		 driver.findElement(By.id("nome")).sendKeys("contaABC");
	}

	@Then("salvar conta")
	public void salvarConta() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("verificar se a conta foi salva")
	public void verificarSeAContaFoiSalva() {
		
		String conta = "Conta adicionada com sucesso!";
		if(conta.equals(driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]")).getText())) {
			driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
			
		}
	   
	}
	
}
