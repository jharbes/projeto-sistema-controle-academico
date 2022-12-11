package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AdmDAO {

	public static boolean Logar(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		boolean retorno = false;
		
		String query = "select exists(select login, senha from administrador where login = '" + login + "' and senha = '" + senha + "') as login";
		
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
	
	public static ResultSet  buscaBuscarInformacoesAdm(String login, String senha) {
		Statement stmt = ConexaoBD.conectBD();
		ResultSet retorno = null;
		
		String query = "SELECT * FROM scoa.administrador where login = '" + login + "' and senha = '" + senha + "';";
		
		try {
			retorno = stmt.executeQuery(query);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do banco de dados. \nDetalhes: "+ e.getMessage());
		}
		
		return retorno;
	}
}
