
	Feature: Alugar Filmes
		Como um usuário 
		Eu quero cadastrar aluguéis de filmes
		Para controlar preços dataas de entrega
		
		Scenario: Deve alugar um filme com sucesso
		 Given um filme com estoque de 2 unidades
		* que o preço do aluguel seja R$ 3
		 When alugar
		Then o preço do aluguel será R$ 3
		* a data de entrega será no dia seguinte
		* o estoque do filme será 1 unidade
		
	