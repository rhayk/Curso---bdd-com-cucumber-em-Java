
Feature: Acessar site e treinar as funcoes que tive no curso

Scenario: logar no site
Given que abriu o navegador validar site
When inserir usuario
And inserir senha
Then clicar no botao para entrar
And validar que esta logado no site
And clicar na aba contas
And clicar na aba adicionar conta
And validar se esta na pagina para adicionar conta 
And adicionar conta 
And salvar conta
And verificar se a conta foi salva 
  