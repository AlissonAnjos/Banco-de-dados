package classes;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Piso piso;
	private MesAno mesAno;
	private Classe classe;
	private Cargo cargo;
	private Integer posicao;
	private Double valor;
	private List<Funcionario>funcionario=new ArrayList<>();
	
	
	public Piso getPiso() {
		return piso;
	}
	public void setPiso(Piso piso) {
		this.piso = piso;
	}
	public MesAno getMesAno() {
		return mesAno;
	}
	public void setMesAno(MesAno mesAno) {
		this.mesAno = mesAno;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	
}
