package model;

import java.util.Date;

public class Log {
	private int id_log;
	private String acao;
	private String descricao;
	private Date data_acao;
	private String nome_adm;
	public int getId_log() {
		return id_log;
	}
	public String getAcao() {
		return acao;
	}
	public String getDescricao() {
		return descricao;
	}
	public Date getData_acao() {
		return data_acao;
	}
	public String getNome_adm() {
		return nome_adm;
	}
	public void setId_log(int id_log) {
		this.id_log = id_log;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setData_acao(Date data_acao) {
		this.data_acao = data_acao;
	}
	public void setNome_adm(String nome_adm) {
		this.nome_adm = nome_adm;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void lerLogs()
	
	*/
}