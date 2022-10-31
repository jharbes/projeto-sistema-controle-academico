package model;

import java.util.Date;

public class Presenca {
	private int id_presenca;
	private boolean presenca;
	private String nome_aluno;
	private String pauta_de_aula;
	private Date data;
	
	public Presenca(int id_presenca, boolean presenca, String nome_aluno, String pauta_de_aula, Date data) {
		super();
		this.id_presenca = id_presenca;
		this.presenca = presenca;
		this.nome_aluno = nome_aluno;
		this.pauta_de_aula = pauta_de_aula;
		this.data = data;
	}

	public int getId_presenca() {
		return id_presenca;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public String getPauta_de_aula() {
		return pauta_de_aula;
	}

	public Date getData() {
		return data;
	}

	public void setId_presenca(int id_presenca) {
		this.id_presenca = id_presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public void setPauta_de_aula(String pauta_de_aula) {
		this.pauta_de_aula = pauta_de_aula;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void auditarDiario()
	public void consultarDiario()
	
	*/
}