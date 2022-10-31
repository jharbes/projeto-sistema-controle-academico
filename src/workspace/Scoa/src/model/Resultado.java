package model;

public class Resultado {
	private int id_resultado;
	private boolean aprovado;
	private double nota_final;
	private String nome_aluno;
	private String nome_professor;
	
	public Resultado(int id_resultado, boolean aprovado, double nota_final, String nome_aluno, String nome_professor) {
		super();
		this.id_resultado = id_resultado;
		this.aprovado = aprovado;
		this.nota_final = nota_final;
		this.nome_aluno = nome_aluno;
		this.nome_professor = nome_professor;
	}

	public int getId_resultado() {
		return id_resultado;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public double getNota_final() {
		return nota_final;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public String getNome_professor() {
		return nome_professor;
	}

	public void setId_resultado(int id_resultado) {
		this.id_resultado = id_resultado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public void setNota_final(double nota_final) {
		this.nota_final = nota_final;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public void setNome_professor(String nome_professor) {
		this.nome_professor = nome_professor;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void lancarNotaFinal()
	public void atualizarResultado()
	
	*/
}