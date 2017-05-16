package testes;

import dao.CidadeDao;
import entidades.Cidade;
import entidades.Estado;

public class TesteInsercaoCidade {
	public static void main(String[] args) {
		Cidade cidade = new Cidade();
		cidade.setNome("Vitoria da Conquista");
		cidade.setEstado(estado);
		
		CidadeDao dao = new CidadeDao();
		
		dao.adiciona(cidade);
	}

}
