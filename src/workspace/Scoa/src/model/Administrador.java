package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DAO.AdmDAO;

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

	public Administrador() {
		super();
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
	
	/* M�TODOS PARA SEREM IMPLEMENTADOS
	
	public void editarAdm()
	public void cadastrarInstituicao()
	public void atualizarInstituicao()
	public void deletarInstituicao()
	
	*/
	
	public static Administrador Login(String login, String senha) {
		Administrador adm = null;
		if(AdmDAO.Logar(login, senha)) {
			
			ResultSet rs = AdmDAO.buscaBuscarInformacoesAdm(login, senha);
			
			try {
				while(rs.next()) {
					adm = new Administrador(rs.getInt("id_adm"), rs.getString("nome"), rs.getString("login"), rs.getString("senha"));
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Falha na recuperação dos dados do administrador. \nDetalhes: "+ e.getMessage());
			}
			
			return adm;
		}else {
			JOptionPane.showMessageDialog(null, "Login ou senha inv�lidos.");
			return adm;
		}
	}
}