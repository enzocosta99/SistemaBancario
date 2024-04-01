package classesBanco;

public class ContaPessoaJuridica extends Conta{
	
	public ContaPessoaJuridica(Integer numeroConta, Titular titular) {
		this.setNumeroConta(numeroConta);
		this.setTitular(titular);
		this.setSaldoDisponivel(0);
	}
	
	public void pagarSalario(ContaPessoaFisica contaPessoaFisica, double valor) {
		contaPessoaFisica.depositar(valor);
		this.sacar(valor);
	}
	
	public void pagarImposto(double valor) {
		this.sacar(valor);
	}

}
