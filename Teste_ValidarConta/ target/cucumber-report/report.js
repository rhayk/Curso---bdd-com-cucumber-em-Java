$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ultimoprojeto.feature");
formatter.feature({
  "name": "Acessar site e treinar as funcoes que tive no curso",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "logar no site",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que abriu o navegador validar site",
  "keyword": "Given "
});
formatter.match({
  "location": "TreinamentoSteps.queAbriuONavegadorValidarSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir usuario",
  "keyword": "When "
});
formatter.match({
  "location": "TreinamentoSteps.inserirUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir senha",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.inserirSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao para entrar",
  "keyword": "Then "
});
formatter.match({
  "location": "TreinamentoSteps.clicarNoBotaoParaEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar que esta logado no site",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.validarQueEstaLogadoNoSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar na aba contas",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.clicarNaAbaContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar na aba adicionar conta",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.clicarNaAbaAdicionarConta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar se esta na pagina para adicionar conta",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.validarSeEstaNaPaginaParaAdicionarConta()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[n]ome\u003e but was:\u003c[N]ome\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepsDefinitions.TreinamentoSteps.validarSeEstaNaPaginaParaAdicionarConta(TreinamentoSteps.java:63)\r\n\tat ✽.validar se esta na pagina para adicionar conta(file:src/test/resources/features/ultimoprojeto.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "adicionar conta",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.adicionarConta()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "salvar conta",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.salvarConta()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verificar se a conta foi salva",
  "keyword": "And "
});
formatter.match({
  "location": "TreinamentoSteps.verificarSeAContaFoiSalva()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});