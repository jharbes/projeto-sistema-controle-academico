package model;
import java.util.ArrayList;

public class Reclamacao {
	private int id_reclamacao;
	private String motivo;
	private String descricao;
	private String nome_aluno;
	private boolean lida;
	
	public Reclamacao(int id_reclamacao, String motivo, String descricao, String nome_aluno, boolean lida) {
		super();
		this.id_reclamacao = id_reclamacao;
		this.motivo = motivo;
		this.descricao = descricao;
		this.nome_aluno = nome_aluno;
		this.lida = lida;
	}

	public int getId_reclamacao() {
		return id_reclamacao;
	}

	public String getMotivo() {
		return motivo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public boolean isLida() {
		return lida;
	}

	public void setId_reclamacao(int id_reclamacao) {
		this.id_reclamacao = id_reclamacao;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public void setLida(boolean lida) {
		this.lida = lida;
	}
	
	public boolean createReclamacao() {
		return false;
	}
	
	public ArrayList<Reclamacao> readReclamacao() {
		ArrayList<Reclamacao> retorno = new ArrayList<Reclamacao>();
		return retorno;
	}
	
	public boolean updateReclamacao() {
		return false;
	}
	
	public boolean deleteReclamacao() {
		return false;
	}
}