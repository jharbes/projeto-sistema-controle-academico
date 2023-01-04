package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.ProfessorDAO;

public class Professor extends Funcionario{
	private int id_professor;
	private String login;
	private String senha;
	private Funcionario funcionario;
	
	public Professor(int id_professor, String login, String senha, Funcionario funcionario) {
		super();
		this.id_professor = id_professor;
		this.login = login;
		this.senha = senha;
		this.funcionario = funcionario;
	}
	
	public Professor() {
		super();
	}
	
	public static String CadastrarProfessor(String nome, String genero, String telefone, String email, int idade, String rg, String cpf, String login, String senha, Double salario, String rua, String cep, String numero, String bairro, String cidade, String estado, int id_istituicao) {
		Professor professor = new Professor(0, login, senha, 
											new Funcionario("Professor", salario, 
											new Pessoa(nome, genero, idade, rg, cpf, telefone, email, 
											new Endereco(0, rua, idade, cep, bairro, cidade, estado))));
		
		if(ProfessorDAO.Cadastrar(professor, id_istituicao))
			return professor.getFuncionario().getPessoa().getNome();
		else 
			return "";
	}

	public static Professor Login(String login, String senha) {
		Professor professor = null;
		if(ProfessorDAO.Logar(login, senha)) {
			
			ResultSet rs = ProfessorDAO.buscaBuscarInformacoesProfessor(login, senha);
			Endereco endereco;
			Pessoa pessoa;
			Funcionario funcionario;
			
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
					
					pessoa = new Pessoa(	
							rs.getString("nome"), 
							rs.getString("genero"),
							rs.getInt("idade"),
							rs.getString("rg"),
							rs.getString("cpf"),
							rs.getString("telefone"),
							rs.getString("email"),
							endereco);
					
					funcionario = new Funcionario(
							rs.getString("cargo"), 
							rs.getDouble("salario"), 
							pessoa);
					
					
					professor = new Professor(
							rs.getInt("id_professor"), 
							rs.getString("login"), 
							rs.getString("senha"), 
							funcionario);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Falha na recuperação dos dados do professor. \nDetalhes: "+ e.getMessage());
			}
			
			return professor;
		}else {
			JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
			return professor;
		}
	}

	public int getId_professor() {
		return id_professor;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public boolean createProfessor() {
		return false;
	}
	
	public ArrayList<Professor> readProfessor() {
		ArrayList<Professor> retorno = new ArrayList<Professor>();
		return retorno;
	}
	
	public boolean updateProfessor() {
		return false;
	}
	
	public boolean deleteProfessor() {
		return false;
	}
}
