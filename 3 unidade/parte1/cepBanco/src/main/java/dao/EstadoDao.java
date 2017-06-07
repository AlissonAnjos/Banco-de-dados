package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;	
import entidades.Estado;

public class EstadoDao {
		private Connection connection;

		public EstadoDao() {
			this.connection = new ConnectionFactory().getConnection();
		}


		public List<Estado> pegaTodos() {
			try {
				List<Estado> estados = new ArrayList<Estado>();
				PreparedStatement stmt = (PreparedStatement) connection
						.prepareStatement("select * from estados");
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
				
					Estado estado = new Estado();
					estado.setUf(rs.getString("uf"));
					estado.setNome(rs.getString("nome"));
					estados.add(estado);
				}
				rs.close();
				stmt.close();
				return estados;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		
		public List<Estado> ordenadosPeloNome() {
			try {
				List<Estado> estados = new ArrayList<Estado>();
				PreparedStatement stmt = (PreparedStatement) connection
						.prepareStatement("select * from estados order By nome");
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					
					Estado estado = new Estado();
					estado.setUf(rs.getString("uf"));
					estado.setNome(rs.getString("nome"));
					estados.add(estado);
				}
				rs.close();
				stmt.close();
				return estados;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		
		public void altera(Estado estado) {
			String sql = "update estados set uf=?, nome=? where id=?";
			try {
				PreparedStatement stmt = (PreparedStatement) connection
						.prepareStatement(sql);
				stmt.setString(1, estado.getUf());
				stmt.setString(2, estado.getNome());
				stmt.setLong(3, estado.getId());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		public void remove(Estado estado) {
			try {
				PreparedStatement stmt = (PreparedStatement) connection
						.prepareStatement("delete from estados where id=?");
				stmt.setLong(1, estado.getId());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		public Estado buscaPorId(Long id) {
			Estado estado = new Estado();
			
			 try {
		         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from estados where id=?");
		         stmt.setLong(1, id);
		         
		         ResultSet rs = stmt.executeQuery();
		         
					if (rs.next()) {
						estado.setUf(rs.getString("uf"));
						estado.setNome(rs.getString("nome"));
					}
		         stmt.close();
		         return estado;
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }		
		}
	

}
