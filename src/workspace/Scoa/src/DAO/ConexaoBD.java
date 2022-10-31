package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoBD {
	public static Statement conectBD(int user) {
		Connection connection = null;
		Statement stmt = null;
		
		try {
			String url = url_users(user);
			connection = DriverManager.getConnection(url);
			stmt = connection.createStatement();
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, "Falha na conexão com o banco de dados. \nDetalhes: "+ e.getMessage());
		}
		
		return stmt;
	}
	
	public static String url_users(int user) {
		String url = null;
		switch (user) {
			case 1: // MATHEUS MELLO
				url = "jdbc:mysql://127.0.0.1:3306/scoa?user=root&password=senharoot";
			break;
			
			case 2: // MATEUS RANGEL
				url = "";
				break;
				
			case 3: // HARBES
				url = "";
				break;
				
			case 4: // CANTANHÊDE
				url = "";
				break;
				
			case 5: // JEAN
				url = "";
				break;
		}
		return url;
	}
}