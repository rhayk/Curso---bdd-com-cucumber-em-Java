package br.ce.servicos;

import java.util.Date;

public class NotaAluguel {
	
	private int preço;
	private Date dataEntrega;
	
	public int getPreço() {
		return preço;
		
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	
	}

	public void setDataEntrega(Date time) {
	dataEntrega = time;
	}
}
