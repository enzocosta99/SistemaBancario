package interfaces;

import classesBanco.Conta;

public interface ContaInterface {

	public void transferir(Conta conta, double valor);;
	public void sacar(double valor);
	public void depositar(double valor);
	
}
