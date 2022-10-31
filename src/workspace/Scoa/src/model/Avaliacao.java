package model;

import java.util.ArrayList;
import java.util.Date;

public class Avaliacao {
	private int id_avaliacao;
	private int ordem;
	private double pontos;
	private Date data;
	
	public Avaliacao(int id_avaliacao, int ordem, double pontos, Date data) {
		super();
		this.id_avaliacao = id_avaliacao;
		this.ordem = ordem;
		this.pontos = pontos;
		this.data = data;
	}

	public int getId_avaliacao() {
		return id_avaliacao;
	}

	public int getOrdem() {
		return ordem;
	}

	public double getPontos() {
		return pontos;
	}

	public Date getData() {
		return data;
	}

	public void setId_avaliacao(int id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void buscarAvaPorDisciplina()
	
	*/
	
	
	public boolean createAvaliacao() {
		return false;
	}
	
	public ArrayList<Avaliacao> readAvaliacao() {
		ArrayList<Avaliacao> retorno = new ArrayList<Avaliacao>();
		return retorno;
	}
	
	public boolean updateAvaliacao() {
		return false;
	}
	
	public boolean deleteAvaliacao() {
		return false;
	}
}