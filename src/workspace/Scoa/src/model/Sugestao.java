package model;

import java.util.ArrayList;

public class Sugestao {
	private int id_sugestao;
	private String texto_breve;
	private String setor_sugestao;
	private String nome_aluno;
	private boolean lida;
	
	
	public Sugestao(int id_sugestao, String texto_breve, String setor_sugestao, String nome_aluno, boolean lida) {
		super();
		this.id_sugestao = id_sugestao;
		this.texto_breve = texto_breve;
		this.setor_sugestao = setor_sugestao;
		this.nome_aluno = nome_aluno;
		this.lida = lida;
	}

	public int getId_sugestao() {
		return id_sugestao;
	}

	public String getTexto_breve() {
		return texto_breve;
	}

	public String getSetor_sugestao() {
		return setor_sugestao;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public boolean isLida() {
		return lida;
	}

	public void setId_sugestao(int id_sugestao) {
		this.id_sugestao = id_sugestao;
	}

	public void setTexto_breve(String texto_breve) {
		this.texto_breve = texto_breve;
	}

	public void setSetor_sugestao(String setor_sugestao) {
		this.setor_sugestao = setor_sugestao;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public void setLida(boolean lida) {
		this.lida = lida;
	}
	

	public boolean createSugestao() {
		return false;
	}
	
	public ArrayList<Sugestao> readSugestao() {
		ArrayList<Sugestao> retorno = new ArrayList<Sugestao>();
		return retorno;
	}
	
	public boolean updateSugestao() {
		return false;
	}
	
	public boolean deleteSugestao() {
		return false;
	}
}