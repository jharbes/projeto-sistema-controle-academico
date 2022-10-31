package model;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
	private int id_emprestimo;
	private String nome_pessoa;
	private String nome_obra;
	private Date data_emprestimo;
	private Date devolucao;
	
	public Emprestimo(int id_emprestimo, String nome_pessoa, String nome_obra, Date data_emprestimo, Date devolucao) {
		super();
		this.id_emprestimo = id_emprestimo;
		this.nome_pessoa = nome_pessoa;
		this.nome_obra = nome_obra;
		this.data_emprestimo = data_emprestimo;
		this.devolucao = devolucao;
	}

	public int getId_emprestimo() {
		return id_emprestimo;
	}

	public String getNome_pessoa() {
		return nome_pessoa;
	}

	public String getNome_obra() {
		return nome_obra;
	}

	public Date getData_emprestimo() {
		return data_emprestimo;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setId_emprestimo(int id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}

	public void setNome_obra(String nome_obra) {
		this.nome_obra = nome_obra;
	}

	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void enviarEmailAlerta()
	public void enviarSmsAlerta()
	
	*/
	
	public boolean createEmprestimo() {
		return false;
	}
	
	public ArrayList<Emprestimo> readEmprestimo() {
		ArrayList<Emprestimo> retorno = new ArrayList<Emprestimo>();
		return retorno;
	}
	
	public boolean updateEmprestimo() {
		return false;
	}
	
	public boolean deleteEmprestimo() {
		return false;
	}
}