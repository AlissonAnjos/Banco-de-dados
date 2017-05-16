package testes;

import dao.EstadoDao;
import entidades.Estado;

public class TesteInsercaoEstado {
	public static void main(String[] args) {
		Estado estado = new Estado();
		estado.setNome("Bahia");
		estado.setUf("BA");
		
		EstadoDao dao = new EstadoDao();
		
		dao.adiciona(estado);
	}

}
