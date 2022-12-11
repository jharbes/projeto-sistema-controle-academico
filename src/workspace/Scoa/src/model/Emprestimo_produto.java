package model;

import java.util.ArrayList;

public class Emprestimo_produto {
	private int id_emprestimo;
	private String qtde_emprestimo;
	private String nome_produto;
	private String login;
	private String senha;
	private String turma;
	private String tipo;
	
	public Emprestimo_produto(int id_emprestimo, String qtde_emprestimo, String nome_produto, String login,
			String senha, String turma, String tipo) {
		super();
		this.id_emprestimo = id_emprestimo;
		this.qtde_emprestimo = qtde_emprestimo;
		this.nome_produto = nome_produto;
		this.login = login;
		this.senha = senha;
		this.turma = turma;
		this.tipo = tipo;
	}

	public int getId_emprestimo() {
		return id_emprestimo;
	}

	public String getQtde_emprestimo() {
		return qtde_emprestimo;
	}

	public String getNome_produto() {
		return nome_produto;
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
	
	public String getTipo() {
		return tipo;
	}

	public void setId_emprestimo(int id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public void setQtde_emprestimo(String qtde_emprestimo) {
		this.qtde_emprestimo = qtde_emprestimo;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
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
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public boolean createEmprestimo_produto() {
		return false;
	}
	
	public ArrayList<Emprestimo_produto> readEmprestimo_produto() {
		ArrayList<Emprestimo_produto> retorno = new ArrayList<Emprestimo_produto>();
		return retorno;
	}
	
	public boolean updateEmprestimo_produto() {
		return false;
	}
	
	public boolean deleteEmprestimo_produto() {
		return false;
	}
}