package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.AlunoDAO;

public class Aluno extends Pessoa {
	private int id_aluno;
	private int matricula;
	private String turno;
	private String login;
	private String senha;
	private String turma;
	private String nome_curso;
	private int cr;
	private Pessoa pessoa;
	
	public Aluno (int id_aluno, String login, String senha, int matricula, String turno, String turma, String nome_curso, int cr, Pessoa pessoa) {
		super();
		this.id_aluno = id_aluno;
		this.login = login;
		this.senha = senha;
		this.matricula = matricula;
		this.turno = turno;
		this.turma = turma;
		this.nome_curso = nome_curso;
		this.cr = cr;
		this.pessoa = pessoa;
	}

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String CadastrarAluno(String nome,  String genero, String telefone, String email, int idade, String rg, String cpf, String login, String senha, String turma, int matricula, String turno, String nome_curso, int cr,  String rua, String cep, int numero, String bairro, String cidade, String estado, int id_istituicao) {
		Aluno aluno = new Aluno(0, login, senha, matricula, turno, turma, nome_curso, cr,
		new Pessoa(nome, genero, idade, rg, cpf, telefone, email,
		new Endereco(0, rua, numero, cep, bairro, cidade, estado)));
		
		if(AlunoDAO.Cadastrar(aluno, id_istituicao))
			return aluno.getPessoa().getNome();
		else
			return "";
	}
	
	public int getId_aluno() {
		return id_aluno;
	}

	public int getMatricula() {
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

	public void setMatricula(int matricula) {
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
	
	/* M�TODOS PARA SEREM IMPLEMENTADOS
	
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
											rs.getString("login"),
											rs.getString("senha"),
											rs.getInt("matricula"),
											rs.getString("turno"),	
											rs.getString("turma"),
											rs.getString("curso"),
											rs.getInt("cr"),
											pessoa);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Falha na recuperação dos dados do aluno. \nDetalhes: "+ e.getMessage());
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