package classesBanco;

public class ContaPessoaFisica extends Conta{

	private double valorInvestido;
	
	public ContaPessoaFisica(Integer numeroConta, Titular titular) {
		this.setNumeroConta(numeroConta);
		this.setTitular(titular);
		this.setSaldoDisponivel(0);
		this.setValorInvestido(0);
	}
	
	public double getValorInvestido() {
		return valorInvestido;
	}
	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}
	
	public void investir(double valor) {
		this.sacar(valor);
		this.setValorInvestido(this.getValorInvestido() + valor);
	}
	
}
