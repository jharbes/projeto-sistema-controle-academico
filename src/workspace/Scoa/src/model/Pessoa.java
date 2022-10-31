package model;

import java.util.ArrayList;

public class Pessoa {
	private int id_pessoa;
	private String nome;
	private String genero;
	private int idade;
	private String rg;
	private String cpf;
	private String telefone;
	private String email;
	private String nome_instituicao;
	private Endereco endereco;
	
	public Pessoa(int id_pessoa, String nome, String genero, int idade, String rg, String cpf, String telefone,
			String email, String nome_instituicao, Endereco endereco) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.nome_instituicao = nome_instituicao;
		this.endereco = endereco;
	}

	public int getId_pessoa() {
		return id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public int getIdade() {
		return idade;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getNome_instituicao() {
		return nome_instituicao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNome_instituicao(String nome_instituicao) {
		this.nome_instituicao = nome_instituicao;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public boolean createPessoa() {
		return false;
	}
	
	public ArrayList<Pessoa> readPessoa() {
		ArrayList<Pessoa> retorno = new ArrayList<Pessoa>();
		return retorno;
	}
	
	public boolean updatePessoa() {
		return false;
	}
	
	public boolean deletePessoa() {
		return false;
	}
	
}