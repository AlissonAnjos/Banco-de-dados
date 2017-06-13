package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.PreparedStatement;
import modelo.Bairro;

public class BairroDao {
	private Connection connection;

	public BairroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	public void altera(Bairro bairro) {
		String sql = "update bairros set nome=?,id_cidade=? where id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement(sql);
			stmt.setString(1, bairro.getNome());
			stmt.setLong(2, bairro.getCidade());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Bairro bairro) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from bairros where id=?");
			stmt.setLong(1, bairro.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Bairro buscaPorId(Long id) {
		Bairro bairro = new Bairro();
		
		 try {
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from bairros where id=?");
	         stmt.setLong(1, id);
	         
	         ResultSet rs = stmt.executeQuery();
	         
				if (rs.next()) {
					bairro.setNome(rs.getString("nome"));
					bairro.setCidade(rs.getLong("id_cidade"));
				}
	         stmt.close();
	         return bairro;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
}
