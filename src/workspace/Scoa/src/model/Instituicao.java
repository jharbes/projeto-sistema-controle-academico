package model;

import java.util.ArrayList;

public class Instituicao {
	private int id_instituicao;
	private String nome;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private Endereco endereco;

	public Instituicao(int id_instituicao, String nome, String telefone, String email, String login, String senha,
			Endereco endereco) {
		super();
		this.id_instituicao = id_instituicao;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
	}
	
	public int getId_instituicao() {
		return id_instituicao;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setId_instituicao(int id_instituicao) {
		this.id_instituicao = id_instituicao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void cadastrarCurso()
	public void cadastrarDisciplina()
	public void cadastrarTurma()
	public void cadastrarSala()
	public void cadastrarProfessor()
	public void cadastrarAlunos()
	public void alocarSalaMateriaProfessor()
	public void login()
	
	*/
	
	public boolean createInstituicao() {
		return false;
	}
	
	public ArrayList<Instituicao> readInstituicao() {
		ArrayList<Instituicao> retorno = new ArrayList<Instituicao>();
		return retorno;
	}
	
	public boolean updateInstituicao() {
		return false;
	}
	
	public boolean deleteInstituicao() {
		return false;
	}
}