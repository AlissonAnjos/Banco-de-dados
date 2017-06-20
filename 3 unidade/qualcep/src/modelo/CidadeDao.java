package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.PreparedStatement;

import modelo.Cidade;


public class CidadeDao {
	private Connection connection;

	public CidadeDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	public void altera(Cidade cidade) {
		String sql = "update cidades set nome=?,id_estado=? where id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement(sql);
			stmt.setString(1, cidade.getNome());
			stmt.setLong(2, cidade.getEstado());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Cidade cidade) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from cidades where id=?");
			stmt.setLong(1, cidade.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Cidade buscaPorId(Long id) {
		Cidade cidade = new Cidade();
		
		 try {
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from cidades where id=?");
	         stmt.setLong(1, id);
	         
	         ResultSet rs = stmt.executeQuery();
	         
				if (rs.next()) {
					cidade.setNome(rs.getString("nome"));
					cidade.setEstado(rs.getLong("id_estado"));
				}
	         stmt.close();
	         return cidade;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
	
}