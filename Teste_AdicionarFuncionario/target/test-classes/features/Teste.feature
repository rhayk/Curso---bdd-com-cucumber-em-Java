@Tags
Feature: Logar no site 


Scenario: Entrar no site 

Given informar o usario
And informar a senha
Then cliclar no botao de entrar
And Verificar se esta logado
And acessar a aba admin
And clicar no botao add 
And adicionar funcionario 
And adicionar nome do funcionario no username
And inserir senha
And inserir confirmacao de senha
And clicar no botao salvar
And validar se foi salvo
And se nao for salvo clicar na aba admin 

#Scenario: Cadastrar usuario
#
#Given acessar a aba admin
#And informar a senha
#Then cliclar no botao de entrar
#And Verificar se esta logado