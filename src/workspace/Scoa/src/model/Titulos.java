package model;

import java.util.ArrayList;

public class Titulos {
	private int id_titulo;
	private String certificado;
	private String descricao;
	
	public Titulos(int id_titulo, String certificado, String descricao) {
		super();
		this.id_titulo = id_titulo;
		this.certificado = certificado;
		this.descricao = descricao;
	}
	
	public int getId_titulo() {
		return id_titulo;
	}
	public String getCertificado() {
		return certificado;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setId_titulo(int id_titulo) {
		this.id_titulo = id_titulo;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean createTitulo() {
		return false;
	}
	
	public ArrayList<Titulos> readTitulo() {
		ArrayList<Titulos> retorno = new ArrayList<Titulos>();
		return retorno;
	}
	
	public boolean updateTitulo() {
		return false;
	}
	
	public boolean deleteTitulo() {
		return false;
	}
}