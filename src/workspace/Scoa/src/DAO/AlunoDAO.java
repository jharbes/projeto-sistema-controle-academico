package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoDAO {

	public static boolean Logar(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		boolean retorno = false;

		String query = "select exists(select login, senha from aluno where login = '" + login + "' and senha = '"
				+ senha + "') as login";

		try {
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				retorno = rs.getBoolean("login");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao carregar os dados do banco de dados. \nDetalhes: " + e.getMessage());
		}

		return retorno;
	}

	public static boolean Cadastrar(Aluno aluno, int id_instituicao) {
		int last_insert_id = 0;
		Statement stmt = ConexaoBD.conectBD();
		String query = "insert into Endereco (rua, numero, cep, bairro, cidade, estado) "
				+ "values ('" + aluno.getPessoa().getEndereco().getRua() + "'," +
				"'" + aluno.getPessoa().getEndereco().getNumero() + "'," +
				"'" + aluno.getPessoa().getEndereco().getCep() + "'," +
				"'" + aluno.getPessoa().getEndereco().getBairro() + "'," +
				"'" + aluno.getPessoa().getEndereco().getCidade() + "'," +
				"'" + aluno.getPessoa().getEndereco().getEstado() + "')";

		try {
			last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			if (last_insert_id == 1) {

				ResultSet generatedKeys = stmt.getGeneratedKeys();
				if (generatedKeys.next()) {

					query = "insert into pessoa (nome, genero, idade, rg, cpf, telefone, email, id_endereco, id_instituicao) "
							+ "values ('" + aluno.getPessoa().getNome() + "'," +
							"'" + aluno.getPessoa().getGenero() + "'," +
							"'" + aluno.getPessoa().getIdade() + "'," +
							"'" + aluno.getPessoa().getRg() + "'," +
							"'" + aluno.getPessoa().getCpf() + "'," +
							"'" + aluno.getPessoa().getTelefone() + "'," +
							"'" + aluno.getPessoa().getEmail() + "'," +
							"'" + generatedKeys.getInt(last_insert_id) + "'," +
							"'" + id_instituicao + "')";

					last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
					if (last_insert_id == 1) {

						generatedKeys = stmt.getGeneratedKeys();
						if (generatedKeys.next()) {
								generatedKeys = stmt.getGeneratedKeys();
								if (generatedKeys.next()) {

									query = "insert into aluno (matricula, login, senha, cr, id_turma, id_pessoa) "
											+ "values ('" + aluno.getMatricula() + "'," +
											"'" + aluno.getLogin() + "'," +
											"'" + aluno.getSenha() + "'," +
											"'" + aluno.getCr() + "'," +
											"1," +
											"'" + generatedKeys.getInt(last_insert_id) + "')";

									last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
									if (last_insert_id == 1)
										return true;
									else
										throw new SQLException();
								}
							}
					} else
						throw new SQLException();
				}
			} else
				throw new SQLException();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao inserir aluno no banco de dados. \nDetalhes: " + e.getMessage());
		}
		return false;
	}

	public static ResultSet buscaBuscarInformacoesAluno(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		ResultSet retorno = null;

		String query = "select"
				+ "	a.id_aluno, a.matricula, a.cr, p.nome, t.nome as turma, t.turno, c.nome as curso, p.genero, p.idade, p.rg, p.cpf,"
				+ "    p.telefone, p.email, e.id_endereco, e.rua, e.numero, e.cep, e.bairro, e.cidade, e.estado"
				+ "	from aluno a, pessoa p, endereco e, turma t, curso c"
				+ "	where 	a.login = '" + login + "' and"
				+ "			senha = '" + senha + "' and"
				+ "			p.id_pessoa = a.id_pessoa and"
				+ "         p.id_endereco = e.id_endereco and"
				+ "         t.id_turma = a.id_turma and"
				+ "         c.id_curso = t.id_curso";

		try {
			retorno = stmt.executeQuery(query);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao carregar os dados do banco de dados. \nDetalhes: " + e.getMessage());
		}

		return retorno;
	}

	public static ArrayList<String> buscarDisciplinas(int id_aluno) {
		ArrayList<String> retorno = new ArrayList<String>();

		Statement stmt = ConexaoBD.conectBD();

		String query = "select d.nome as nome "
				+ "from disciplina d, aluno a, inscricao i, sala s "
				+ "where 	a.id_aluno 		= " + id_aluno + " and "
				+ "			a.id_aluno 		= i.id_aluno and "
				+ "			i.id_sala 		= s.id_sala and "
				+ "			s.id_disciplina = d.id_disciplina";

		try {
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				retorno.add(rs.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
					"Erro ao carregar os dados do banco de dados. \nDetalhes: " + e.getMessage());
		}

		return retorno;
	}
}