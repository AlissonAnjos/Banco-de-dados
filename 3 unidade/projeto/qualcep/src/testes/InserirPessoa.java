package testes;

import java.sql.SQLException;
import modelo.*;

public class InserirPessoa {

	public static void main(String[] args) throws SQLException {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("12345678913");
		pessoa.setNome("fulano");
		pessoa.setEmail("sadjfgksagdfgasjdfjh");
		pessoa.setCelular("123456789");
		pessoa.setId_logradouro(1L);
		pessoa.setNumero("10");
		pessoa.setComplemento("sdafjhdsj");
		
		
		
		PessoaDao dao = new PessoaDao();
		
		dao.adiciona(pessoa);
		System.out.println("Gravado com sucesso!");		
	}
}
