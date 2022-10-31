package model;

import java.util.ArrayList;

public class Produto {
	private int id_produto;
	private String nome;
	private String referencia;
	private String descricao;
	private int estoque_min;
	private int quantidade;
	private int estoque_max;
	
	public Produto(int id_produto, String nome, String referencia, String descricao, int estoque_min, int quantidade,
			int estoque_max) {
		super();
		this.id_produto = id_produto;
		this.nome = nome;
		this.referencia = referencia;
		this.descricao = descricao;
		this.estoque_min = estoque_min;
		this.quantidade = quantidade;
		this.estoque_max = estoque_max;
	}

	public int getId_produto() {
		return id_produto;
	}

	public String getNome() {
		return nome;
	}

	public String getReferencia() {
		return referencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getEstoque_min() {
		return estoque_min;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getEstoque_max() {
		return estoque_max;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setEstoque_min(int estoque_min) {
		this.estoque_min = estoque_min;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setEstoque_max(int estoque_max) {
		this.estoque_max = estoque_max;
	}
	
	
	public boolean createProduto() {
		return false;
	}
	
	public ArrayList<Produto> readProduto() {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		return retorno;
	}
	
	public boolean updateProduto() {
		return false;
	}
	
	public boolean deleteProduto() {
		return false;
	}
}