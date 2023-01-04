package model;

import java.util.ArrayList;

import DAO.InstituicaoDAO;

public class Obra{
	private int id_obra;
	private String autor;
	private String nome;
	private String tipo;
	private String descricao;
	
	public Obra(int id_obra, String autor, String nome, String tipo, String descricao) {
		super();
		this.id_obra = id_obra;
		this.autor = autor;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public Obra(){
		super();
	}

	public static String CadastrarObra(String autor, String nome, String tipo, String descricao){
		Obra obra = new Obra(0, autor, nome, tipo, descricao);

		if(InstituicaoDAO.CadastrarObra(obra, 0))
			return obra.getNome();
		else 
			return "";	
	}

	public int getId_obra() {
		return id_obra;
	}

	public String getAutor(){
		return autor;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId_obra(int id_obra) {
		this.id_obra = id_obra;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public boolean createObra() {
		return false;
	}
	
	public ArrayList<Obra> readObra() {
		ArrayList<Obra> retorno = new ArrayList<Obra>();
		return retorno;
	}
	
	public boolean updateObra() {
		return false;
	}
	
	public boolean deleteObra() {
		return false;
	}
}