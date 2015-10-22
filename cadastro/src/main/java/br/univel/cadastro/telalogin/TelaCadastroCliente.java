package br.univel.cadastro.telalogin;

import java.awt.BorderLayout;

public class TelaCadastroCliente extends ModuraAbstrata {

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {

	}

	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroCliente(), BorderLayout.CENTER);		
	}

}
