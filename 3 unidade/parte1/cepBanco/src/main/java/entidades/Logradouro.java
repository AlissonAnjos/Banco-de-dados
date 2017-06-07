package entidades;

public class Logradouro {
	private Long id;
	private String cep;
	private String nome;
	private Bairro bairro;
	private TipoLog tipoLog;
	
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
	
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public TipoLog getTipoLog() {
		return tipoLog;
	}
	public void setTipoLog(TipoLog tipoLog) {
		this.tipoLog = tipoLog;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
