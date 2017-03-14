package testes;

import classes.Cargo;
import classes.Categoria;
import classes.Classe;
import classes.Piso;
import classes.Sexo;
import classes.Funcionario;
import classes.MesAno;

public class Principal {

	public static void main(String[] args) {
		
		Cargo analista = new Cargo();
		analista.setDescricao("Analista");
		
		MesAno ano2017 = new MesAno();
		ano2017.setDescricao("Marco de 2017");
		
		Piso p01 = new Piso();
		p01.setSigla("p01");
		
		Classe classe4 = new Classe();
		classe4.setSigla("A1");
		
		Categoria categoriaE = new Categoria();
		categoriaE.setPosicao(16);
		categoriaE.setValor(83287.123);
		categoriaE.setCargo(analista);
		categoriaE.setMesAno(ano2017);
		categoriaE.setPiso(p01);
		categoriaE.setClasse(classe4);
	
		Funcionario alisson = new Funcionario();
		alisson.setNome("Alisson");
		alisson.setCpf("123.456.789.10");
		alisson.setSexo(Sexo.M);
		alisson.setMatricula("1234");
		alisson.setSobreNome("dos Anjos");
		
		Funcionario guilherme = new Funcionario();
		guilherme.setNome("Guilherme");
		guilherme.setCpf("321.654.987-01");
		guilherme.setSexo(Sexo.M);
		guilherme.setMatricula("4234");
		guilherme.setSobreNome("Rezende");
		
		categoriaE.getFuncionario().add(alisson);
		categoriaE.getFuncionario().add(guilherme);

		System.out.println("Lista de funcionarios");
		for(Funcionario f: categoriaE.getFuncionario()){
			System.out.println("Nome = "+f.getNome());
			System.out.println("Sobrenome = "+f.getSobreNome());
			System.out.println("Matricula = "+f.getMatricula());
			System.out.println("CPF = "+f.getCpf());
		}
		
	
	
	}
}
