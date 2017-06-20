package logica;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.*;

public class ConsultarCepLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		String insercao = req.getParameter("LogradouroOuCep");
	
		
		
			LogradouroDao dao = new LogradouroDao();
			List<Logradouro> logradouros = dao.porCepOuNome(insercao);
			req.setAttribute("logradouros", logradouros);
			
			BairroDao bairrodao = new BairroDao();
			List<Bairro> bairros = new ArrayList<Bairro>();
			Bairro bairro = new Bairro();
			
			TipoLogDao tipologdao = new TipoLogDao();
			List<TipoLog> tiposlogs = new ArrayList<TipoLog>();
			TipoLog tipolog = new TipoLog();
			
			CidadeDao cidadedao = new CidadeDao();
			List<Cidade> cidades = new ArrayList<Cidade>();
			Cidade cidade = new Cidade();
			
			EstadoDao estadodao = new EstadoDao();
			List<Estado> estados = new ArrayList<Estado>();
			Estado estado = new Estado();
			
			
			for(Logradouro logradouro : logradouros){
		
				bairro= bairrodao.buscaPorId(logradouro.getBairro());
				bairros.add(bairro);
	
				tipolog = tipologdao.buscaPorId(logradouro.getTipoLog());
				tiposlogs.add(tipolog);
		
				cidade = cidadedao.buscaPorId(bairro.getCidade());
				cidades.add(cidade);
		
				estado = estadodao.buscaPorId(cidade.getEstado());
				estados.add(estado);
			
			}
			req.setAttribute("bairros", bairros);
			req.setAttribute("tiposlogs", tiposlogs);
			req.setAttribute("cidades", cidades);
			req.setAttribute("estados", estados);
		
		
	// salta para a jsp	
	return "ConsultarCep.jsp";
	}

}
