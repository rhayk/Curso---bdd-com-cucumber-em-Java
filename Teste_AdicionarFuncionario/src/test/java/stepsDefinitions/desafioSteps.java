package stepsDefinitions;
import static org.junit.Assert.assertEquals;
import static utils.utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.en.*;


public class desafioSteps {
	private static final Object String = null;
	
	@Given("informar o usario")
	public void informar_o_usario() {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@Given("informar a senha")
	public void informar_a_senha() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@Then("cliclar no botao de entrar")
	public void cliclar_no_bot_o_de_entrar() {
		driver.findElement(By.name("Submit")).click();
	}
	
	@Then("Verificar se esta logado")
	public void verificar_se_esta_logado() {
	    assertEquals("Welcome Admin", driver.findElement(By.id("welcome")).getText());
	}
	
	@Given("acessar a aba admin")
	public void acessar_a_aba_admin() {
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	@Then("clicar no botao add")
	public void clicar_no_botao_add() {
	    driver.findElement(By.id("btnAdd")).click();
	}
	
	@Then("adicionar funcionario")
	public void adicionar_funcionario() {
	 driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Russel Hamilton");
	
	
	}
	
	@Then("adicionar nome do funcionario no username")
	public void adicionar_nome_do_funcionario_no_username() {
	   driver.findElement(By.id("systemUser_userName")).sendKeys("Russel Hamilton");
	}

	@Then("inserir senha")
	public void inserir_senha() {
	    driver.findElement(By.id("systemUser_password")).sendKeys("123456789");
	    
	}

	@Then("inserir confirmacao de senha")
	public void inserir_confirmacao_de_senha() {
		   driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123456789");
	} 
	@Then("clicar no botao salvar")
	public void clicar_no_botao_salvar() {
		driver.findElement(By.id("btnSave")).click();
	  
	}

	@Then("validar se foi salvo")
	public void validar_se_foi_salvo() {
		String nome = "Add User";
		if(nome.equals(driver.findElement(By.id("UserHeading")).getText())){
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("btnAdd")).click();
			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Daniel");
			driver.findElement(By.id("systemUser_userName")).sendKeys("Daniel");
			 driver.findElement(By.id("systemUser_password")).sendKeys("123456789");
			 driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123456789");
		}
		//if (assertEquals("Very Weak", driver.findElement(By.id("systemUser_password_strength_meter")).getText())) {
			
		}
	
	
	@Then("se nao for salvo clicar na aba admin")
	public void se_nao_for_salvo_clicar_na_aba_admin() {
		//if ()
	    
	}
	
	
	}














//	
////		if( driver.findElement(By.id("systemUser_password_strength_meter")).equals("Very Weak")){
////		
////			acessar_a_aba_admin();
//			
//		//	clicar_no_botao_add();
//			
//		//	adicionar_funcionario("Jasmine Morgan");
//			
//			
//			
////			 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
//		
//	}
//	
//	@Then("se nao for salvo clicar na aba admin")
//	public void se_nao_for_salvo_clicar_na_aba_admin() {
//	   
//	}
////		@Then("se nao for salvo clicar na aba admin")
////		public void se_n_o_for_salvo_clicar_na_aba_admin() {
////		  
////		if( driver.findElement(By.id("systemUser_password_strength_meter")).equals("Very Weak")){
////			
////			 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
////		
////			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("");
////			driver.findElement(By.id("systemUser_userName")).sendKeys("");
////			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Jasmine Morgan");
////			driver.findElement(By.id("systemUser_userName")).sendKeys("Jasmine Morgan");
////			driver.findElement(By.id("btnSave")).click();
//			
////		} else {		
////			// assertEquals("Add", driver.findElement(By.id("btnAdd")).getText());
////		}
////		}
////		}
//	   
//	}


