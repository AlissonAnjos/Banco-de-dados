package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

import modelo.Pessoa;


public class PessoaDao {
	private Connection connection;
	public PessoaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	public void adiciona(Pessoa pessoa) {
		String sql = "insert into pessoas "
				+ "(cpf,nome,email,celular,id_logradouro,numero,complemento)" + " values (?,?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement(sql);

			// seta os valores

			stmt.setString(1, pessoa.getCpf());
			stmt.setString(2, pessoa.getNome());
			stmt.setString(3, pessoa.getEmail());
			stmt.setString(4, pessoa.getCelular());
			stmt.setLong(5, pessoa.getId_logradouro());
			stmt.setString(6, pessoa.getNumero());
			stmt.setString(7, pessoa.getComplemento());


			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	public void altera(Pessoa pessoa) {
		String sql = "update pessoas set cpf=?,nome=?,email=?,celular=?,id_logradouro=?,numero=?,complemento=? where id=?";
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement(sql);
			stmt.setString(1, pessoa.getCpf());
			stmt.setString(2, pessoa.getNome());
			stmt.setString(3, pessoa.getEmail());
			stmt.setString(4, pessoa.getCelular());
			stmt.setLong(5, pessoa.getId_logradouro());
			stmt.setString(6, pessoa.getNumero());
			stmt.setString(7, pessoa.getComplemento());
			stmt.setLong(8, pessoa.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Pessoa pessoa) {
		try {
			PreparedStatement stmt = (PreparedStatement) connection
					.prepareStatement("delete from pessoas where cpf=?");
			stmt.setString(1, pessoa.getCpf());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Pessoa buscaPorCpf(String cpf) {
		Pessoa pessoa = new Pessoa();
		
		 try {
	         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("select * from pessoas where cpf=?");
	         stmt.setString(1, cpf);
	         
	         ResultSet rs = stmt.executeQuery();
	         
				if (rs.next()) {
					pessoa.setCpf(rs.getString("cpf"));
					pessoa.setNome(rs.getString("nome"));
					pessoa.setEmail(rs.getString("email"));
					pessoa.setCelular(rs.getString("celular"));
					pessoa.setId_logradouro(rs.getLong("id_logradouro"));
					pessoa.setNumero(rs.getString("numero"));
					pessoa.setComplemento(rs.getString("complemento"));
				}
	         stmt.close();
	         return pessoa;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }		
	}
}