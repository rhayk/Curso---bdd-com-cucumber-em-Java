package br.ce.servicos;

import java.util.Calendar;

import br.ce.entidades.Filme;

public class AluguelService {

	public NotaAluguel alugar(Filme filme) {
		NotaAluguel nota = new NotaAluguel();
		nota.setPreço(filme.getAluguel());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
				nota.setDataEntrega(cal.getTime());
		return nota;
		
	}
}
