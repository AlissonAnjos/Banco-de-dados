package testes;

import dao.LogradouroDao;
import entidades.Logradouro;

public class LogradouroPorCep {
	public static void main(String[] args) {
		LogradouroDao dao = new LogradouroDao();
		Logradouro logradouro = dao.buscaPorCep("45028010");
		System.out.println(logradouro.getNome());

	}
}
