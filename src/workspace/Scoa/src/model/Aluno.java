package model;

import java.util.ArrayList;

public class Aluno {
	private int id_aluno;
	private String matricula;
	private String turno;
	private String login;
	private String senha;
	private String turma;
	private String nome_curso;
	private int cr;
	private Pessoa pessoa;
	
	public Aluno(int id_aluno, String matricula, String turno, String login, String senha, String turma,
			String nome_curso, int cr, Pessoa pessoa) {
		super();
		this.id_aluno = id_aluno;
		this.matricula = matricula;
		this.turno = turno;
		this.login = login;
		this.senha = senha;
		this.turma = turma;
		this.nome_curso = nome_curso;
		this.cr = cr;
		this.pessoa = pessoa;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTurno() {
		return turno;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getTurma() {
		return turma;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public int getCr() {
		return cr;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void verConteudoProgramatico()
	public void verPautaAula()
	public void verAnaliseCurricular()
	public void verHistorico()
	public void verDocRequeridos()
	public void fazerSugestao()
	public void fazerReclamacao()
	public void login()
	
	*/
	
	public boolean createAluno() {
		return false;
	}
	
	public ArrayList<Aluno> readAluno() {
		ArrayList<Aluno> retorno = new ArrayList<Aluno>();
		return retorno;
	}
	
	public boolean updateAluno() {
		return false;
	}
	
	public boolean deleteAluno() {
		return false;
	}
}