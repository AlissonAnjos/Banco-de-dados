package classes;

import java.util.ArrayList;
import java.util.List;

public class Funcionario  extends Pessoa{
	private String matricula;
	private List<Categoria> categoria= new ArrayList<>();

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}


}
