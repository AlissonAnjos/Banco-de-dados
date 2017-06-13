package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import modelo.Logradouro;

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
			stmt.setLong(3, logradouro.getTipoLog());
			stmt.setLong(4, logradouro.getBairro());
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
					logradouro.setTipoLog(rs.getLong("id_tipo_logradouro"));
					logradouro.setBairro(rs.getLong("id_bairro"));
					
				}
	         stmt.close();
	         return logradouro;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
	public List<Logradouro> buscaPorCep(String cep) {
		 try {
			 List<Logradouro> logradouros = new ArrayList<Logradouro>();
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from logradouros where cep=?");
	         stmt.setString(1, cep);
	         
	         ResultSet rs = stmt.executeQuery();
	         
	         while (rs.next()) {
	 			
					Logradouro logradouro = new Logradouro();
					logradouro.setId(rs.getLong("id"));
					logradouro.setCep(rs.getString("cep"));
					logradouro.setNome(rs.getString("nome"));
					logradouro.setTipoLog(rs.getLong("id_tipo_logradouro"));
					logradouro.setBairro(rs.getLong("id_bairro"));
				
					logradouros.add(logradouro);
				}
			 rs.close();
	         stmt.close();
	         return logradouros;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
		 		
	public List<Logradouro> ListaPorNome(String nome) {
		try {
			List<Logradouro> logradouros = new ArrayList<Logradouro>();
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from logradouros where nome = ?");
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
			
				Logradouro logradouro = new Logradouro();
				logradouro.setId(rs.getLong("id"));
				logradouro.setCep(rs.getString("cep"));
				logradouro.setNome(rs.getString("nome"));
				logradouro.setTipoLog(rs.getLong("id_tipo_logradouro"));
				logradouro.setBairro(rs.getLong("id_bairro"));
			
				logradouros.add(logradouro);
			}
			rs.close();
			stmt.close();
			return logradouros;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
