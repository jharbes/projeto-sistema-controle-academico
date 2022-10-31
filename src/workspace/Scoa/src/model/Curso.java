package model;

import java.util.ArrayList;

public class Curso {
	private int id_curso;
	private String nome;
	private String coordenador;
	private int periodo_min;
	private int periodo_max;
	private int creditos;
	private int carga_horaria;
	
	public Curso(int id_curso, String nome, String coordenador, int periodo_min, int periodo_max, int creditos,
			int carga_horaria) {
		super();
		this.id_curso = id_curso;
		this.nome = nome;
		this.coordenador = coordenador;
		this.periodo_min = periodo_min;
		this.periodo_max = periodo_max;
		this.creditos = creditos;
		this.carga_horaria = carga_horaria;
	}

	public int getId_curso() {
		return id_curso;
	}

	public String getNome() {
		return nome;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public int getPeriodo_min() {
		return periodo_min;
	}

	public int getPeriodo_max() {
		return periodo_max;
	}

	public int getCreditos() {
		return creditos;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public void setPeriodo_min(int periodo_min) {
		this.periodo_min = periodo_min;
	}

	public void setPeriodo_max(int periodo_max) {
		this.periodo_max = periodo_max;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	
	public boolean createCurso() {
		return false;
	}
	
	public ArrayList<Curso> readCurso() {
		ArrayList<Curso> retorno = new ArrayList<Curso>();
		return retorno;
	}
	
	public boolean updateCurso() {
		return false;
	}
	
	public boolean deleteCurso() {
		return false;
	}
}