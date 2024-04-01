package classesBanco;

import interfaces.ContaInterface;

public abstract class Conta implements ContaInterface{
	
	private Integer numeroConta;
	private Titular titular;
	private double saldoDisponivel;
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	
	public void transferir(Conta conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	public void sacar(double valor) {
		this.setSaldoDisponivel(this.getSaldoDisponivel() - valor);		
	}
	
	public void depositar(double valor) {
		this.setSaldoDisponivel(this.getSaldoDisponivel() + valor);		
	}
	
	public void pagarConta(double valor) {
		this.sacar(valor);
	}
	
}
