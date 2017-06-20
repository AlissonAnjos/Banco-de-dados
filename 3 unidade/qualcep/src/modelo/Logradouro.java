package modelo;

public class Logradouro {
	private Long id;
	private String cep;
	private String nome;
	private Long id_tipo_logradouro;
	private Long id_bairro;
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getBairro() {
		return id_bairro;
	}
	public void setBairro(Long bairro) {
		this.id_bairro = bairro;
	}
	public Long getTipoLog() {
		return id_tipo_logradouro;
	}
	public void setTipoLog(Long tipoLog) {
		this.id_tipo_logradouro = tipoLog;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
