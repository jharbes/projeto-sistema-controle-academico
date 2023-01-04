package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.InstituicaoDAO;

public class Instituicao {
	private int id_instituicao;
	private String nome;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private Endereco endereco;

	public Instituicao(int id_instituicao, String nome, String telefone, String email, String login, String senha, Endereco endereco) {
		super();
		this.id_instituicao = id_instituicao;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
	}
	
	public Instituicao() {
		super();
	}

	public int getId_instituicao() {
		return id_instituicao;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setId_instituicao(int id_instituicao) {
		this.id_instituicao = id_instituicao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	/* M�TODOS PARA SEREM IMPLEMENTADOS
	
	public void cadastrarCurso()
	public void cadastrarDisciplina()
	public void cadastrarTurma()
	public void cadastrarSala()
	public void cadastrarProfessor()
	public void cadastrarAlunos()
	public void alocarSalaMateriaProfessor()
	
	*/
	
	public static Instituicao Login(String login, String senha) {
		Instituicao inst = null;
		if(InstituicaoDAO.Logar(login, senha)) {
			
			ResultSet rs = InstituicaoDAO.buscaBuscarInformacoesInstituicao(login, senha);
			Endereco endereco;
			
			try {
				while(rs.next()) {
					
					endereco = new Endereco(
							rs.getInt("id_endereco"),
							rs.getString("rua"),
							rs.getInt("numero"),
							rs.getString("cep"),
							rs.getString("bairro"),
							rs.getString("cidade"),
							rs.getString("estado"));
					
					inst = new Instituicao(
							rs.getInt("id_instituicao"), 
							rs.getString("nome"),
							rs.getString("telefone"), 
							rs.getString("email"), 
							rs.getString("login"), 
							rs.getString("senha"),
							endereco);
					
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Falha na recuperação dos dados da instituição. \nDetalhes: "+ e.getMessage());
			}
			
			return inst;
		}else {
			JOptionPane.showMessageDialog(null, "Login ou senha inv�lidos.");
			return inst;
		}
	}
	
	public boolean createInstituicao() {
		return false;
	}
	
	public ArrayList<Instituicao> readInstituicao() {
		ArrayList<Instituicao> retorno = new ArrayList<Instituicao>();
		return retorno;
	}
	
	public boolean updateInstituicao() {
		return false;
	}
	
	public boolean deleteInstituicao() {
		return false;
	}
}