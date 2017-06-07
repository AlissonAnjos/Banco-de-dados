package testes;

import dao.CidadeDao;
import entidades.Cidade;

public class CidadePorId {
	public static void main(String[] args) {
		CidadeDao dao = new CidadeDao();
		Cidade cidade = dao.buscaPorId(1116l);
		System.out.println(cidade.getNome());

	}
}
