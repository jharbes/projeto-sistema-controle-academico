package model;

import DAO.AlunoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	private int id_aluno;
	private String matricula;
	private String turno;
	private String login;
	private String senha;
	private String turma;
	private String nome_curso;
	private int cr;
	private Pessoa pessoa;
	
	public Aluno(int id_aluno, String matricula, String turno, String turma, String nome_curso, int cr, Pessoa pessoa) {
		super();
		this.id_aluno = id_aluno;
		this.matricula = matricula;
		this.turno = turno;
		this.turma = turma;
		this.nome_curso = nome_curso;
		this.cr = cr;
		this.pessoa = pessoa;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTurno() {
		return turno;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getTurma() {
		return turma;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public int getCr() {
		return cr;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	/* MÉTODOS PARA SEREM IMPLEMENTADOS
	
	public void verConteudoProgramatico()
	public void verPautaAula()
	public void verAnaliseCurricular()
	public void verHistorico()
	public void verDocRequeridos()
	public void fazerSugestao()
	public void fazerReclamacao()
	
	*/
	
	public static Aluno Login(String login, String senha) {
		Aluno aluno = null;
		if(AlunoDAO.Logar(login, senha)) {
			
			ResultSet rs = AlunoDAO.buscaBuscarInformacoesAluno(login, senha);
			Pessoa pessoa;
			Endereco endereco;
			
			try {
				while(rs.next()) {
					endereco = new Endereco(rs.getInt("id_endereco"),
											rs.getString("rua"),
											rs.getInt("numero"),
											rs.getString("cep"),
											rs.getString("bairro"),
											rs.getString("cidade"),
											rs.getString("estado"));
					
					pessoa = new Pessoa(	rs.getString("nome"), 
											rs.getString("genero"),
											rs.getInt("idade"),
											rs.getString("rg"),
											rs.getString("cpf"),
											rs.getString("telefone"),
											rs.getString("email"),
											endereco);
				
					aluno = new Aluno(		rs.getInt("id_aluno"), 
											rs.getString("matricula"),
											rs.getString("turno"),
											rs.getString("turma"),
											rs.getString("curso"),
											rs.getInt("cr"),
											pessoa);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados. \nDetalhes: "+ e.getMessage());
			}
			
			
			return aluno;
		}else {
			JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
			return aluno;
		}
	}
	
	public boolean createAluno() {
		return false;
	}
	
	public ArrayList<Aluno> readAluno() {
		ArrayList<Aluno> retorno = new ArrayList<Aluno>();
		return retorno;
	}
	
	public boolean updateAluno() {
		return false;
	}
	
	public boolean deleteAluno() {
		return false;
	}
	
	public ArrayList<String> buscarDisciplinas(int id_aluno){
		return AlunoDAO.buscarDisciplinas(id_aluno);
	}
}