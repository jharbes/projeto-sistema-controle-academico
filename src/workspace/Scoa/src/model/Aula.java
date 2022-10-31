package model;

import java.util.ArrayList;
import java.util.Date;

public class Aula {
	private int id_aula;
	private String pauta_de_aula;
	private Date data;
	private String anotacoes_gerais;
	
	public Aula(int id_aula, String pauta_de_aula, Date data, String anotacoes_gerais) {
		super();
		this.id_aula = id_aula;
		this.pauta_de_aula = pauta_de_aula;
		this.data = data;
		this.anotacoes_gerais = anotacoes_gerais;
	}

	public int getId_aula() {
		return id_aula;
	}

	public String getPauta_de_aula() {
		return pauta_de_aula;
	}

	public Date getData() {
		return data;
	}

	public String getAnotacoes_gerais() {
		return anotacoes_gerais;
	}

	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}

	public void setPauta_de_aula(String pauta_de_aula) {
		this.pauta_de_aula = pauta_de_aula;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setAnotacoes_gerais(String anotacoes_gerais) {
		this.anotacoes_gerais = anotacoes_gerais;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void addPautaAula()
	public void editarPautaAula()
	
	*/
	
	public boolean createAula() {
		return false;
	}
	
	public ArrayList<Aula> readAula() {
		ArrayList<Aula> retorno = new ArrayList<Aula>();
		return retorno;
	}
	
	public boolean updateAula() {
		return false;
	}
	
	public boolean deleteAula() {
		return false;
	}
}