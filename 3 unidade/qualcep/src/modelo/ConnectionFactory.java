package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/cep_db", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection(); 
		System.out.println("Conex�o Aberta!");
		connection.close();
	}
}
