package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

import modelo.TipoLog;


public class TipoLogDao {
	private Connection connection;

	public TipoLogDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	public void altera(TipoLog tipolog) {
		String sql = "update tipos_logradouros set nome=? where id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement(sql);
			stmt.setString(1, tipolog.getNome());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(TipoLog tipolog) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from tipos_logradouros where id=?");
			stmt.setLong(1, tipolog.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public TipoLog buscaPorId(Long id) {
		TipoLog tipolog = new TipoLog();
		
		 try {
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from tipos_logradouros where id=?");
	         stmt.setLong(1, id);
	         
	         ResultSet rs = stmt.executeQuery();
	         
				if (rs.next()) {
					tipolog.setNome(rs.getString("nome"));
				}
	         stmt.close();
	         return tipolog;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
}
