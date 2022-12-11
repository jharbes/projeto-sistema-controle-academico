package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoBD {
	public static Statement conectBD() {
		Connection connection = null;
		Statement stmt = null;
		
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/scoa?user=root&password=senharoot";
			connection = DriverManager.getConnection(url);
			stmt = connection.createStatement();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Falha na conex�o com o banco de dados. \nDetalhes: "+ e.getMessage());
		}
		
		return stmt;
	}
}