package testes;

import classes.Classe;
import classes.Classificacao;
import classes.Piso;
import classes.Sexo;
import classes.Funcionario;
import classes.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Piso piso = new Piso();
		piso.setId(1);
		piso.setSigla("P01");
		
		Classe categoria = new Classe();
		categoria.setId(2);
		categoria.setSigla("AI");
		

		Funcionario pessoa1 = new Funcionario();
		pessoa1.setNome("Alisson");
		pessoa1.setCpf("321.654.987-01");
		pessoa1.setSexo(Sexo.M);
		

		Funcionario pessoa2 = new Funcionario();
		pessoa2.setNome("Guilherme");
		pessoa2.setCpf("123.456.789-10");
		pessoa2.setSexo(Sexo.M);
		
		
		
		Classificacao classificacao1 = new Classificacao();
		classificacao1.setId(1);
		classificacao1.setAno(2017);
		classificacao1.setPosicao(2);
		classificacao1.setValor(1234.45);
		classificacao1.setCategorias(categoria);
		classificacao1.setPiso(piso);
		classificacao1.getPessoas().add(pessoa1);
		classificacao1.getPessoas().add(pessoa2);
		
		
		
		System.out.println("Piso = "+classificacao1.getPiso().getSigla());
		System.out.println("Posicao = "+classificacao1.getPosicao());
		System.out.println("Categoria = "+classificacao1.getCategorias().getSigla());
		System.out.println("Valor = "+classificacao1.getValor());
		System.out.println("Ano = "+classificacao1.getAno());
		
		System.out.println();
		System.out.println("Lista de pessoas");
		//for each
		
		for( Funcionario p : classificacao1.getPessoas()){
			
			System.out.println("Nome: "+ p.getNome());
		};
		
		
		
	
		}
}
