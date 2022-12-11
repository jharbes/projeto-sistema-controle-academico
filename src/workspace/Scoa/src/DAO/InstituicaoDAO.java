package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InstituicaoDAO {
	
	public static boolean Logar(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		boolean retorno = false;
		
		String query = "select exists(select login, senha from instituicao where login = '" + login + "' and senha = '" + senha + "') as login";
		
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
	
	public static ResultSet buscaBuscarInformacoesInstituicao(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		ResultSet retorno = null;
		
		String query = "select"
				+ "	i.id_instituicao, i.nome, i.telefone, i.email, i.login, i.senha,"
				+ "    e.id_endereco, e.rua, e.numero, e.cep, e.bairro, e.cidade, e.estado"
				+ "	from instituicao i, endereco e"
				+ "	where 	i.login = '" + login + "' and "
				+ "			i.senha = '" + senha + "' and"
				+ "            i.id_endereco = e.id_endereco";
		
		try {
			retorno = stmt.executeQuery(query);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do banco de dados. \nDetalhes: "+ e.getMessage());
		}
		
		return retorno;
	}
}