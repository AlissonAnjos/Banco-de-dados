package testes;

import entidades.Estado;
import dao.EstadoDao;

public class SelectEstados {
	public static void main(String[] args) {
		EstadoDao dao = new EstadoDao();
		
		for ( Estado c : dao.pegaTodos()){
			System.out.println(c.getUf() + " - " + c.getNome());
		}

	}
}
