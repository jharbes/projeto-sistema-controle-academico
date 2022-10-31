package model;

import java.util.Date;

public class Relatorio_folha_pagamento {
	private int id_relatorio;
	private String descricao;
	private Date data_relatorio;
	
	public Relatorio_folha_pagamento(int id_relatorio, String descricao, Date data_relatorio) {
		super();
		this.id_relatorio = id_relatorio;
		this.descricao = descricao;
		this.data_relatorio = data_relatorio;
	}

	public int getId_relatorio() {
		return id_relatorio;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getData_relatorio() {
		return data_relatorio;
	}

	public void setId_relatorio(int id_relatorio) {
		this.id_relatorio = id_relatorio;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setData_relatorio(Date data_relatorio) {
		this.data_relatorio = data_relatorio;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void lerRelatorio()
	
	*/
}