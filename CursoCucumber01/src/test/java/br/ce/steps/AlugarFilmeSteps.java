package br.ce.steps;

import java.util.Calendar;

import br.ce.entidades.Filme;
import br.ce.servicos.AluguelService;
import br.ce.servicos.NotaAluguel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import junit.framework.Assert;

public class AlugarFilmeSteps {
	
	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	
	@Given("^um filme com estoque de (\\d+) unidades$")
	public void um_filme_com_estoque_de_unidades(int arg1) throws Throwable {
	   filme = new Filme();
	   filme.setEstoque(arg1);
	}

	@Given("^que o pre?o do aluguel seja R\\$ (\\d+)$")
	public void que_o_pre_o_do_aluguel_seja_R$(int arg1) throws Throwable {
	    filme.setAluguel(arg1);
	}

	@When("^alugar$")
	public void alugar() throws Throwable {
	  nota = aluguel.alugar(filme);
	  
	}

	@Then("^o pre?o do aluguel ser? R\\$ (\\d+)$")
	public void o_pre_o_do_aluguel_ser_R$(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, nota.getPreço());
	}

	@Then("^a data de entrega ser? no dia seguinte$")
	public void a_data_de_entrega_ser_no_dia_seguinte() throws Throwable {
	   Calendar cal = Calendar.getInstance();
	   cal.add(Calendar.DAY_OF_MONTH, 1);
	   
	   Date dataRetorno = (Date) nota.getDataEntrega();
	   Calendar calRetorno = Calendar.getInstance();
	   calRetorno.setTime((java.util.Date) dataRetorno);
	   
	   Assert.assertEquals((Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
	   Assert.assertEquals((Calendar.MONTH), calRetorno.get(Calendar.MONTH));
	   Assert.assertEquals((Calendar.YEAR), calRetorno.get(Calendar.YEAR));
	}

	@Then("^o estoque do filme ser? (\\d+) unidade$")
	public void o_estoque_do_filme_ser_unidade(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
