package model;

import java.util.ArrayList;
import java.util.Date;

public class Turma {
	private int id_turma;
	private String nome;
	private int qtde_alunos;
	private String turno;
	private Date inicio;
	private String nome_curso;
	
	public Turma(int id_turma, String nome, int qtde_alunos, String turno, Date inicio, String nome_curso) {
		super();
		this.id_turma = id_turma;
		this.nome = nome;
		this.qtde_alunos = qtde_alunos;
		this.turno = turno;
		this.inicio = inicio;
		this.nome_curso = nome_curso;
	}

	public int getId_turma() {
		return id_turma;
	}

	public String getNome() {
		return nome;
	}

	public int getQtde_alunos() {
		return qtde_alunos;
	}

	public String getTurno() {
		return turno;
	}

	public Date getInicio() {
		return inicio;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQtde_alunos(int qtde_alunos) {
		this.qtde_alunos = qtde_alunos;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}
	
	
	public boolean createTurma() {
		return false;
	}
	
	public ArrayList<Turma> readTurma() {
		ArrayList<Turma> retorno = new ArrayList<Turma>();
		return retorno;
	}
	
	public boolean updateTurma() {
		return false;
	}
	
	public boolean deleteTurma() {
		return false;
	}
}