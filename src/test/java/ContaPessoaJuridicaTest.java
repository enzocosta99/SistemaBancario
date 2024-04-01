import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import classesBanco.ContaPessoaFisica;
import classesBanco.ContaPessoaJuridica;
import classesBanco.Endereco;
import classesBanco.PessoaFisica;
import classesBanco.PessoaJuridica;
import classesBanco.Titular;
import enums.Sexo;
import enums.TipoPessoa;

public class ContaPessoaJuridicaTest {

	Endereco enderecoA = new Endereco("Rua A", 100, "Bairro A", "Cidade A", "Estado A", "País A", "00000000");
	PessoaJuridica pessoaJuridicaA = new PessoaJuridica("Pessoa A", "00000000000000", enderecoA);
	Titular titularA = new Titular(TipoPessoa.PESSOA_JURIDICA, pessoaJuridicaA);
	ContaPessoaJuridica contaPessoaJuridicaA = new ContaPessoaJuridica(12345, titularA);

	Endereco enderecoB = new Endereco("Rua B", 200, "Bairro B", "Cidade B", "Estado B", "País B", "11111111");
	PessoaFisica pessoaFisicaB = new PessoaFisica("Pessoa B", "11111111111", enderecoB, Sexo.FEMININO);
	Titular titularB = new Titular(TipoPessoa.PESSOA_FISICA, pessoaFisicaB);
	ContaPessoaFisica contaPessoaFisicaB = new ContaPessoaFisica(67890, titularB);

	@Test
	public void pagarSalarioMustPassWithSuccesTest() {
		contaPessoaJuridicaA.depositar(10000);
		contaPessoaJuridicaA.pagarSalario(contaPessoaFisicaB, 3000);
		
		assertTrue(contaPessoaJuridicaA.getSaldoDisponivel() == 7000);
		assertEquals(contaPessoaFisicaB.getSaldoDisponivel(), 3000);
	}
	
	@Test
	public void pagarImpostoMustPassWithSuccesTest() {
		contaPessoaJuridicaA.depositar(10000);
		contaPessoaJuridicaA.pagarImposto(1000);
		
		assertEquals(contaPessoaJuridicaA.getSaldoDisponivel(), 9000);
	}
	
}
