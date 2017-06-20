package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Pessoa;
import modelo.PessoaDao;

public class AtualizarPessoaLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String cpf = req.getParameter("cpf");
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String celular = req.getParameter("celular");
		long id_logradouro = Long.parseLong(req.getParameter("id_logradouro"));
		String numero= req.getParameter("numero");
		String complemento= req.getParameter("complemento");
		long id = Long.parseLong(req.getParameter("id"));
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(cpf);
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		pessoa.setCelular(celular);
		pessoa.setId_logradouro(id_logradouro);
		pessoa.setNumero(numero);
		pessoa.setComplemento(complemento);
		pessoa.setId(id);
		PessoaDao dao = new PessoaDao();

		dao.altera(pessoa);
		
		return "Index.jsp";
	}

}
