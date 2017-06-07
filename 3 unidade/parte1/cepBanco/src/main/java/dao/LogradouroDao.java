package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;


import entidades.Logradouro;

public class LogradouroDao {
	private Connection connection;

	public LogradouroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	public void altera(Logradouro logradouro) {
		String sql = "update logradouros set cep=?,nome=?,id_tipo_logradouro=?,id_bairro=? where id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement(sql);
			stmt.setString(1, logradouro.getCep());
			stmt.setString(2, logradouro.getNome());
			stmt.setLong(3, logradouro.getTipoLog().getId());
			stmt.setLong(4, logradouro.getBairro().getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Logradouro logradouro) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from logradouros where id=?");
			stmt.setLong(1, logradouro.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Logradouro buscaPorId(Long id) {
		Logradouro logradouro = new Logradouro();
		
		 try {
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from logradouros where id=?");
	         stmt.setLong(1, id);
	         
	         ResultSet rs = stmt.executeQuery();
	         
				if (rs.next()) {
					logradouro.setCep(rs.getString("cep"));
					logradouro.setNome(rs.getString("nome"));
				}
	         stmt.close();
	         return logradouro;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
	public Logradouro buscaPorCep(String cep) {
		Logradouro logradouro = new Logradouro();
		
		 try {
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from logradouros where cep=?");
	         stmt.setString(1, cep);
	         
	         ResultSet rs = stmt.executeQuery();
	         
				if (rs.next()) {
					logradouro.setCep(rs.getString("cep"));
					logradouro.setNome(rs.getString("nome"));
				}
	         stmt.close();
	         return logradouro;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
}
