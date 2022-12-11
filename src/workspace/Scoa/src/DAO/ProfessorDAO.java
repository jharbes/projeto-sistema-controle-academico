package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

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