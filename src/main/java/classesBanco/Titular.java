package classesBanco;

import enums.TipoPessoa;

public class Titular {
	
	TipoPessoa tipoPessoa;
	Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Titular(TipoPessoa tipoPessoa, Pessoa pessoa) {
		this.setTipoPessoa(tipoPessoa);
		this.setPessoa(pessoa);
	}

}
