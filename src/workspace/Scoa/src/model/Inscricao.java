package model;

import java.util.Date;

public class Inscricao {
	private int id_inscricao;
	private String nome_aluno;
	private String nome_disciplina;
	private Date data;
	private boolean aceito;
	
	public Inscricao(int id_inscricao, String nome_aluno, String nome_disciplina, Date data, boolean aceito) {
		super();
		this.id_inscricao = id_inscricao;
		this.nome_aluno = nome_aluno;
		this.nome_disciplina = nome_disciplina;
		this.data = data;
		this.aceito = aceito;
	}

	public int getId_inscricao() {
		return id_inscricao;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public Date getData() {
		return data;
	}

	public boolean isAceito() {
		return aceito;
	}

	public void setId_inscricao(int id_inscricao) {
		this.id_inscricao = id_inscricao;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setAceito(boolean aceito) {
		this.aceito = aceito;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void fazerInscricaoDisciplina()
	public void cancelarInscricaoDisciplina()
	public void rematriculaAutomatica()
	
	*/
}