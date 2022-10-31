package model;

import java.util.ArrayList;

public class Doc_requeridos {
	private int id_documento;
	private String nome;
	
	public Doc_requeridos(int id_documento, String nome) {
		super();
		this.id_documento = id_documento;
		this.nome = nome;
	}

	public int getId_documento() {
		return id_documento;
	}

	public String getNome() {
		return nome;
	}

	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public boolean createDoc_requeridos() {
		return false;
	}
	
	public ArrayList<Doc_requeridos> readDoc_requeridos() {
		ArrayList<Doc_requeridos> retorno = new ArrayList<Doc_requeridos>();
		return retorno;
	}
	
	public boolean updateDoc_requeridos() {
		return false;
	}
	
	public boolean deleteDoc_requeridos() {
		return false;
	}
}