import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import classesBanco.ContaPessoaFisica;
import classesBanco.Endereco;
import classesBanco.PessoaFisica;
import classesBanco.Titular;
import enums.Sexo;
import enums.TipoPessoa;

public class ContaPessoaFisicaTest {

	Endereco enderecoA = new Endereco("Rua A", 100, "Bairro A", "Cidade A", "Estado A", "País A", "00000000");
	PessoaFisica pessoaFisicaA = new PessoaFisica("Pessoa A", "00000000000", enderecoA, Sexo.MASCULINO);
	Titular titularA = new Titular(TipoPessoa.PESSOA_FISICA, pessoaFisicaA);
	ContaPessoaFisica contaPessoaFisicaA = new ContaPessoaFisica(12345, titularA);
	
	Endereco enderecoB = new Endereco("Rua B", 200, "Bairro B", "Cidade B", "Estado B", "País B", "11111111");
	PessoaFisica pessoaFisicaB = new PessoaFisica("Pessoa B", "11111111111", enderecoB, Sexo.FEMININO);
	Titular titularB = new Titular(TipoPessoa.PESSOA_FISICA, pessoaFisicaB);
	ContaPessoaFisica contaPessoaFisicaB = new ContaPessoaFisica(67890, titularB);
	
	@Test
	public void transferirMustPassWithSuccesTest() {
		contaPessoaFisicaA.depositar(100);
		contaPessoaFisicaA.transferir(contaPessoaFisicaB, 30);
		
		assertEquals(contaPessoaFisicaA.getSaldoDisponivel(), 70);
		assertEquals(contaPessoaFisicaB.getSaldoDisponivel(), 30);
	}
	
	@Test
	public void sacarMustPassWithSuccesTest() {
		contaPessoaFisicaA.depositar(100);
		contaPessoaFisicaA.sacar(50);
		
		assertTrue(contaPessoaFisicaA.getSaldoDisponivel() == 50);
	}
	
	@Test
	public void depositarMustPassWithSuccesTest() {
		contaPessoaFisicaA.depositar(100);
		
		assertTrue(contaPessoaFisicaA.getSaldoDisponivel() == 100);
	}
	
	@Test
	public void pagarContaMustPassWithSuccesTest() {
		contaPessoaFisicaA.depositar(100);
		contaPessoaFisicaA.pagarConta(70);
		
		assertFalse(contaPessoaFisicaA.getSaldoDisponivel() != 30);
	}
	
	@Test
	public void investirMustPassWithSuccesTest() {
	    contaPessoaFisicaA.depositar(100);
	    contaPessoaFisicaA.investir(50);
	    
	    assertEquals(contaPessoaFisicaA.getSaldoDisponivel(), 50);
	    assertEquals(contaPessoaFisicaA.getValorInvestido(), 50);
	}
}
