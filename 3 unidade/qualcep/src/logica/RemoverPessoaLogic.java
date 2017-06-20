package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Pessoa;
import modelo.PessoaDao;

public class RemoverPessoaLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String cpf = req.getParameter("cpf");
		
		PessoaDao dao = new PessoaDao();
		Pessoa pessoa = dao.buscaPorCpf(cpf);
		dao.remove(pessoa);
		return "Index.jsp";
	}

}
