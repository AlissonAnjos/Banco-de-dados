package modelo;


public class Cidade {
	
	private Long id;
	private String nome;
	private Long id_estado;
	
	
	public Long getEstado() {
		return id_estado;
	}
	public void setEstado(Long estado) {
		this.id_estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
