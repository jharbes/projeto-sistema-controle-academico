package model;

public class Administrador {
	private int id_adm;
	private String nome;
	private String login;
	private String senha;
	
	public Administrador(int id_adm, String nome, String login, String senha) {
		super();
		this.id_adm = id_adm;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public int getId_adm() {
		return id_adm;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setId_adm(int id_adm) {
		this.id_adm = id_adm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void editarAdm()
	public void deletarAdm()
	public void cadastrarInstituicao()
	public void atualizarInstituicao()
	public void deletarInstituicao()
	public void login()
	
	*/
}