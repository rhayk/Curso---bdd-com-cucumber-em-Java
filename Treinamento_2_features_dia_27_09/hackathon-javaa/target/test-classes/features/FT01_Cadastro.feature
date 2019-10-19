#language: pt
#encoding: UTF-8

@Login
Funcionalidade: Acessar Cadastro

Cenario: Consultar User
Dado que acesse a aba Admin
Quando eu pesquisar o user "Admin"
E acionar o botao search
Entao a aplicacao exibe o user "Admin"

@Cadastro
Cenario: Cadastrar Usuario
Dado que acesse a aba Admin
Quando eu clicar no botao Add
E informar no campo Employee Name "Fiona Grace"
E informar no campo User Name "Andre"
E informar no campo password "12345678"
E informar no campo confirmar password "12345678"
E clicar no botao salvar
Entao o sistema cadastra o usuario "Andre"

@ConsultarCombo
Cenario: Consultar User Por Combobox
Dado que acesse a aba Admin
Quando selecionar o User Role
E selecionar o status
E acionar o botao search
Entao o sistema realiza a consulta


@MoverMenu
Cenario: Mover Menu
Dado mude o menu
