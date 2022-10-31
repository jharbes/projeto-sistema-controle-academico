package model;

import java.util.ArrayList;
import java.util.Date;

public class Analise_curricular {
	private int id_analise;
	private String analise;
	private Date data;
	private String nome_professor;
	private String nome_aluno;
	
	public Analise_curricular(int id_analise, String analise, Date data, String nome_professor, String nome_aluno) {
		super();
		this.id_analise = id_analise;
		this.analise = analise;
		this.data = data;
		this.nome_professor = nome_professor;
		this.nome_aluno = nome_aluno;
	}

	public int getId_analise() {
		return id_analise;
	}

	public String getAnalise() {
		return analise;
	}

	public Date getData() {
		return data;
	}

	public String getNome_professor() {
		return nome_professor;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setId_analise(int id_analise) {
		this.id_analise = id_analise;
	}

	public void setAnalise(String analise) {
		this.analise = analise;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setNome_professor(String nome_professor) {
		this.nome_professor = nome_professor;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}
	
	public boolean createAnalise_curricular() {
		return false;
	}
	
	public ArrayList<Analise_curricular> readAnalise_curricular() {
		ArrayList<Analise_curricular> retorno = new ArrayList<Analise_curricular>();
		return retorno;
	}
	
	public boolean updateAnalise_curricular() {
		return false;
	}
	
	public boolean deleteAnalise_curricular() {
		return false;
	}
}