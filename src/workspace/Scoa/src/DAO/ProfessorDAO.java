package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.Professor;

public class ProfessorDAO {
	
	public static boolean Logar(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		boolean retorno = false;
		
		String query = "select exists(select login, senha from professor where login = '" + login + "' and senha = '" + senha + "') as login";
		
		try {
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				retorno = rs.getBoolean("login");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do banco de dados. \nDetalhes: "+ e.getMessage());
		}
		
		return retorno;
	}
	
	public static boolean Cadastrar(Professor professor, int id_instituicao) {
		int last_insert_id = 0;
		Statement stmt = ConexaoBD.conectBD();
		String query = "insert into Endereco (rua, numero, cep, bairro, cidade, estado) "
				+ "values ('" + professor.getFuncionario().getPessoa().getEndereco().getRua() + "'," +
						  "'" + professor.getFuncionario().getPessoa().getEndereco().getNumero() + "',"+
						  "'" + professor.getFuncionario().getPessoa().getEndereco().getCep()    + "',"+
						  "'" + professor.getFuncionario().getPessoa().getEndereco().getBairro() + "',"+
						  "'" + professor.getFuncionario().getPessoa().getEndereco().getCidade() + "',"+
						  "'" + professor.getFuncionario().getPessoa().getEndereco().getEstado() + "')";
		
		try {
			
			last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			if(last_insert_id == 1) {
				
				ResultSet generatedKeys = stmt.getGeneratedKeys();
				if (generatedKeys.next()) {
					
					query = "insert into pessoa (nome, genero, idade, rg, cpf, telefone, email, id_endereco, id_instituicao) "
							+ "values ('" + professor.getFuncionario().getPessoa().getNome() + "'," +
									  "'" + professor.getFuncionario().getPessoa().getGenero() + "',"+
									  "'" + professor.getFuncionario().getPessoa().getIdade()    + "',"+
									  "'" + professor.getFuncionario().getPessoa().getRg() + "',"+
									  "'" + professor.getFuncionario().getPessoa().getCpf() + "',"+
									  "'" + professor.getFuncionario().getPessoa().getTelefone() + "',"+
									  "'" + professor.getFuncionario().getPessoa().getEmail() + "',"+
									  "'" + generatedKeys.getInt(last_insert_id) + "',"+
									  "'" + id_instituicao + "')";
					
					last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
					if(last_insert_id == 1) {
						
						generatedKeys = stmt.getGeneratedKeys();
						if (generatedKeys.next()) {
							
							query = "insert into funcionario (cargo, salario, id_pessoa) "
									+ "values ('Professor'," +
											  "'" + professor.getFuncionario().getSalario() + "',"+
											  "'" + generatedKeys.getInt(last_insert_id) + "')";
							
							last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
							if(last_insert_id == 1) {
								
								generatedKeys = stmt.getGeneratedKeys();
								if (generatedKeys.next()) {
									
									query = "insert into professor (login, senha, id_funcionario) "
											+ "values ('" + professor.getLogin() + "',"+
													  "'" + professor.getSenha() + "',"+
													  "'" + generatedKeys.getInt(last_insert_id) + "')";
									
									last_insert_id = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
									if(last_insert_id == 1) 
										return true;
									else
										throw new SQLException();
								}
								
							}else
								throw new SQLException();
						}
					}else
						throw new SQLException();
				}
			}else 
				throw new SQLException();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir professor no banco de dados. \nDetalhes: "+ e.getMessage());
		}
		return false;
	}
	
	public static ResultSet buscaBuscarInformacoesProfessor(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		ResultSet retorno = null;
		
		String query = "select"
				+ "	pr.id_professor, pr.login, pr.senha,"
				+ "    f.salario, f.cargo,"
				+ "	p.nome, p.genero, p.idade, p.rg, p.cpf, p.telefone, p.email,"
				+ " e.id_endereco, e.rua, e.numero, e.cep, e.bairro, e.cidade, e.estado"
				+ "	from professor pr, funcionario f, pessoa p, endereco e"
				+ "	where 	pr.login = '" + login + "' and "
				+ "			pr.senha = '" + senha + "' and"
				+ "            pr.id_funcionario = f.id_funcionario and"
				+ "            f.id_pessoa = p.id_pessoa and"
				+ "            p.id_endereco = e.id_endereco";
		
		try {
			retorno = stmt.executeQuery(query);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do banco de dados. \nDetalhes: "+ e.getMessage());
		}
		
		return retorno;
	}
}