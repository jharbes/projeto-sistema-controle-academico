package model;

import java.util.ArrayList;
import java.util.Date;

public class Cadastro {
	private int id_cadastro;
	private Date data;
	private String nome_pessoa;
	private String nome_instituicao;
	
	public Cadastro(int id_cadastro, Date data, String nome_pessoa, String nome_instituicao) {
		super();
		this.id_cadastro = id_cadastro;
		this.data = data;
		this.nome_pessoa = nome_pessoa;
		this.nome_instituicao = nome_instituicao;
	}

	public int getId_cadastro() {
		return id_cadastro;
	}

	public Date getData() {
		return data;
	}

	public String getNome_pessoa() {
		return nome_pessoa;
	}

	public String getNome_instituicao() {
		return nome_instituicao;
	}

	public void setId_cadastro(int id_cadastro) {
		this.id_cadastro = id_cadastro;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}

	public void setNome_instituicao(String nome_instituicao) {
		this.nome_instituicao = nome_instituicao;
	}

	
	public boolean createCadastro() {
		return false;
	}
	
	public ArrayList<Cadastro> readCadastro() {
		ArrayList<Cadastro> retorno = new ArrayList<Cadastro>();
		return retorno;
	}
	
	public boolean updateCadastro() {
		return false;
	}
	
	public boolean deleteCadastro() {
		return false;
	}
}