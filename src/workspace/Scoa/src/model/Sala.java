package model;

import java.util.ArrayList;
import java.util.Date;

public class Sala {
	private int id_sala;
	private String turno;
	private Date hora_inicio;
	private Date hora_fim;
	private String local_sala;
	private String nome_professor;
	private String conteudo_prog;
	private String periodo;
	private Disciplina disciplina;
	
	public Sala(int id_sala, String turno, Date hora_inicio, Date hora_fim, String local_sala, String nome_professor,
			String conteudo_prog, String periodo, Disciplina disciplina) {
		super();
		this.id_sala = id_sala;
		this.turno = turno;
		this.hora_inicio = hora_inicio;
		this.hora_fim = hora_fim;
		this.local_sala = local_sala;
		this.nome_professor = nome_professor;
		this.conteudo_prog = conteudo_prog;
		this.periodo = periodo;
		this.disciplina = disciplina;
	}

	public int getId_sala() {
		return id_sala;
	}

	public String getTurno() {
		return turno;
	}

	public Date getHora_inicio() {
		return hora_inicio;
	}

	public Date getHora_fim() {
		return hora_fim;
	}

	public String getLocal_sala() {
		return local_sala;
	}

	public String getNome_professor() {
		return nome_professor;
	}

	public String getConteudo_prog() {
		return conteudo_prog;
	}

	public String getPeriodo() {
		return periodo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setHora_inicio(Date hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public void setHora_fim(Date hora_fim) {
		this.hora_fim = hora_fim;
	}

	public void setLocal_sala(String local_sala) {
		this.local_sala = local_sala;
	}

	public void setNome_professor(String nome_professor) {
		this.nome_professor = nome_professor;
	}

	public void setConteudo_prog(String conteudo_prog) {
		this.conteudo_prog = conteudo_prog;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void lancarConteudoProgramatico()
	
	*/
	
	public boolean createSala() {
		return false;
	}
	
	public ArrayList<Sala> readSala() {
		ArrayList<Sala> retorno = new ArrayList<Sala>();
		return retorno;
	}
	
	public boolean updateSala() {
		return false;
	}
	
	public boolean deleteSala() {
		return false;
	}
}