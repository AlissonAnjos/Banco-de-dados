package testes;

import java.util.List;

import modelo.*;
public class LogradouroPorNome {
	public static void main(String[] args) {
		LogradouroDao dao = new LogradouroDao();
		List<Logradouro> logradouros = dao.ListaPorNome("Siqueira Campos");
		for(Logradouro logradouro : logradouros){
			BairroDao bairrodao = new BairroDao();
			
			Bairro bairro= bairrodao.buscaPorId(logradouro.getBairro());
			
			TipoLogDao tipologdao = new TipoLogDao();
			
			TipoLog tipolog = tipologdao.buscaPorId(logradouro.getTipoLog());
			
			CidadeDao cidadedao = new CidadeDao();
			
			Cidade cidade = cidadedao.buscaPorId(bairro.getCidade());
			
			EstadoDao estadodao = new EstadoDao();
			
			Estado estado = estadodao.buscaPorId(cidade.getEstado());
			
			System.out.println(tipolog.getNome()+" "+logradouro.getNome()+ " " + bairro.getNome()+" "+cidade.getNome()+"/"
					+estado.getUf()+" "+logradouro.getCep());
		}
	}
}
