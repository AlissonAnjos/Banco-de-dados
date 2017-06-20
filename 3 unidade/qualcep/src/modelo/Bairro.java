package modelo;

public class Bairro {
	
	private Long id;
	private String nome;
	private Long id_cidade;
	
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
	public Long getCidade() {
		return id_cidade;
	}
	public void setCidade(Long cidade) {
		this.id_cidade = cidade;
	}
	

}
