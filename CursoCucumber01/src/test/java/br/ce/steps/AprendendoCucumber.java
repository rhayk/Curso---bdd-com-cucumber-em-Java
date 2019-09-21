package br.ce.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprendendoCucumber {

	@Given("^que o ticket ? A.(\\d+)$")
	public void que_o_ticket_AF(int arg1) throws Throwable {
	 
	}

	@Given("^que o valor da passagem ? R\\$ (\\d+),(\\d+)$")
	public void que_o_valor_da_passagem_R$(int arg1, int arg2) throws Throwable {
	
	}

	@Given("^que o nome do passageiro ? \"(.*)\"$")
	public void que_o_nome_do_passageiro(String arg1) throws Throwable {
	  
	}

	@Given("^que o telefone do passageiro ? (\\d+)-(\\d+)$")
	public void que_o_telefone_do_passageiro(int arg1, int arg2) throws Throwable {
	  
	}

	@When("^criar os steps$")
	public void criar_os_steps() throws Throwable {
	    
	}

	@Then("^o teste vai funcionar$")
	public void o_teste_vai_funcionar() throws Throwable {
	 
}
}
