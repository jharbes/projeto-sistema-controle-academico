package model;

import java.util.ArrayList;

public class Professor extends Funcionario{
	private int id_professor;
	private String login;
	private String senha;
	private Funcionario funcionario;
	
	public Professor(int id_pessoa, String nome, String genero, int idade, String rg, String cpf, String telefone,
			String email, String nome_instituicao, Endereco endereco, int id_funcionario, String cargo, double salario,
			Pessoa pessoa, int id_professor, String login, String senha, Funcionario funcionario) {
		super(id_pessoa, nome, genero, idade, rg, cpf, telefone, email, nome_instituicao, endereco, id_funcionario,
				cargo, salario, pessoa);
		this.id_professor = id_professor;
		this.login = login;
		this.senha = senha;
		this.funcionario = funcionario;
	}

	public int getId_professor() {
		return id_professor;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public boolean createProfessor() {
		return false;
	}
	
	public ArrayList<Professor> readProfessor() {
		ArrayList<Professor> retorno = new ArrayList<Professor>();
		return retorno;
	}
	
	public boolean updateProfessor() {
		return false;
	}
	
	public boolean deleteProfessor() {
		return false;
	}
}
