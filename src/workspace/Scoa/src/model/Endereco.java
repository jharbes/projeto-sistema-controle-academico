package model;

import java.util.ArrayList;

public class Endereco {
	private int id_endereco;
	private String rua;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(int id_endereco, String rua, int numero, String cep, String bairro, String cidade, String estado) {
		super();
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public String getCep() {
		return cep;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean createEndereco() {
		return false;
	}
	
	public ArrayList<Endereco> readEndereco() {
		ArrayList<Endereco> retorno = new ArrayList<Endereco>();
		return retorno;
	}
	
	public boolean updateEndereco() {
		return false;
	}
	
	public boolean deleteEndereco() {
		return false;
	}
}
