package model;

import java.util.ArrayList;

public class Disciplina {
	private int id_disciplina;
	private String nome;
	private int credito;
	private ArrayList<String> pre_requisito;
	private int carga_horaria;
	
	public Disciplina(int id_disciplina, String nome, int credito, ArrayList<String> pre_requisito, int carga_horaria) {
		super();
		this.id_disciplina = id_disciplina;
		this.nome = nome;
		this.credito = credito;
		this.pre_requisito = pre_requisito;
		this.carga_horaria = carga_horaria;
	}

	public int getId_disciplina() {
		return id_disciplina;
	}

	public String getNome() {
		return nome;
	}

	public int getCredito() {
		return credito;
	}

	public ArrayList<String> getPre_requisito() {
		return pre_requisito;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public void setId_disciplina(int id_disciplina) {
		this.id_disciplina = id_disciplina;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public void setPre_requisito(ArrayList<String> pre_requisito) {
		this.pre_requisito = pre_requisito;
	}

	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	
	public boolean createDisciplina() {
		return false;
	}
	
	public ArrayList<Disciplina> readDisciplina() {
		ArrayList<Disciplina> retorno = new ArrayList<Disciplina>();
		return retorno;
	}
	
	public boolean updateDisciplina() {
		return false;
	}
	
	public boolean deleteDisciplina() {
		return false;
	}
}