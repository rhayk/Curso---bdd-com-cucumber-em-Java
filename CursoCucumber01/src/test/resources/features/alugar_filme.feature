
	Feature: Alugar Filmes
		Como um usu�rio 
		Eu quero cadastrar alugu�is de filmes
		Para controlar pre�os dataas de entrega
		
		Scenario: Deve alugar um filme com sucesso
		 Given um filme com estoque de 2 unidades
		* que o pre�o do aluguel seja R$ 3
		 When alugar
		Then o pre�o do aluguel ser� R$ 3
		* a data de entrega ser� no dia seguinte
		* o estoque do filme ser� 1 unidade
		
	