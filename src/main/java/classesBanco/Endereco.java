package classesBanco;

public class Endereco {

	private String logradouro;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	private void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	private void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	private void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	private void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	private void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	private void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	private void setCep(String cep) {
		this.cep = cep;
	}
	
	public Endereco(String logradouro, Integer numero, String bairro, String cidade, String estado, String pais, String cep) {
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setPais(pais);
		this.setCep(cep);
	}
	
}
