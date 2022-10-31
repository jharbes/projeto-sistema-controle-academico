package model;

import java.util.ArrayList;

public class Biblioteca {
	private int id_biblioteca;
	private String telefone;
	private String email;
	
	public Biblioteca(int id_biblioteca, String telefone, String email) {
		super();
		this.id_biblioteca = id_biblioteca;
		this.telefone = telefone;
		this.email = email;
	}

	public int getId_biblioteca() {
		return id_biblioteca;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setId_biblioteca(int id_biblioteca) {
		this.id_biblioteca = id_biblioteca;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void pesquisarPorFiltro()
	
	*/
	
	public boolean createBiblioteca() {
		return false;
	}
	
	public ArrayList<Biblioteca> readBiblioteca() {
		ArrayList<Biblioteca> retorno = new ArrayList<Biblioteca>();
		return retorno;
	}
	
	public boolean updateBiblioteca() {
		return false;
	}
	
	public boolean deleteBiblioteca() {
		return false;
	}
}