package classesBanco;

public class PessoaJuridica extends Pessoa{
	
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	private void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica(String nome, String cnpj, Endereco endereco) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setEndereco(endereco);
	}
}
