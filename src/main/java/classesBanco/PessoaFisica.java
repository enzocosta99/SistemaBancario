package classesBanco;

import enums.Sexo;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private Sexo sexo;
	
	public String getCpf() {
		return cpf;
	}
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	private void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public PessoaFisica(String nome, String cpf, Endereco endereco, Sexo sexo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setSexo(sexo);
	}

}
