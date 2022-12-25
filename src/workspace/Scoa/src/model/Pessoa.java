package model;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String genero;
	private int idade;
	private String rg;
	private String cpf;
	private String telefone;
	private String email;
	private Endereco endereco;

	public Pessoa(String nome, String genero, int idade, String rg, String cpf, String telefone, String email,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Pessoa() {
		super();
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

	public Endereco getEndereco() {
		return endereco;
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