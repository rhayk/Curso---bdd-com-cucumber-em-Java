$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/desafio.feature");
formatter.feature({
  "name": "Logar no site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Tags"
    }
  ]
});
formatter.scenario({
  "name": "Entrar no site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tags"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "informar o usario",
  "keyword": "Given "
});
formatter.match({
  "location": "desafioSteps.informar_o_usario()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "informar a senha",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.informar_a_senha()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "cliclar no botao de entrar",
  "keyword": "Then "
});
formatter.match({
  "location": "desafioSteps.cliclar_no_bot_o_de_entrar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verificar se esta logado",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.verificar_se_esta_logado()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "acessar a aba admin",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.acessar_a_aba_admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicar no botao add",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.clicar_no_botao_add()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "adicionar funcionario",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.adicionar_funcionario()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "adicionar nome do funcionario no username",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.adicionar_nome_do_funcionario_no_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "inserir senha",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.inserir_senha()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "inserir confirmacao de senha",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.inserir_confirmacao_de_senha()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicar no botao salvar",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.clicar_no_botao_salvar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validar se foi salvo",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.validar_se_foi_salvo()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "se nao for salvo clicar na aba admin",
  "keyword": "And "
});
formatter.match({
  "location": "desafioSteps.se_nao_for_salvo_clicar_na_aba_admin()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});