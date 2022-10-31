package model;

public class Pendencia {
	private int id_pendencia;
	private boolean solucionado;
	private String nome_pessoa;
	private Emprestimo emprestimo;
	
	public Pendencia(int id_pendencia, boolean solucionado, String nome_pessoa, Emprestimo emprestimo) {
		super();
		this.id_pendencia = id_pendencia;
		this.solucionado = solucionado;
		this.nome_pessoa = nome_pessoa;
		this.emprestimo = emprestimo;
	}

	public int getId_pendencia() {
		return id_pendencia;
	}

	public boolean isSolucionado() {
		return solucionado;
	}

	public String getNome_pessoa() {
		return nome_pessoa;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setId_pendencia(int id_pendencia) {
		this.id_pendencia = id_pendencia;
	}

	public void setSolucionado(boolean solucionado) {
		this.solucionado = solucionado;
	}

	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void gerarPendencia()
	public void lerPendencia()
	
	*/
}