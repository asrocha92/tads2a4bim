package br.univel.cadastro.model;

import java.util.List;

public interface ClienteDao {
	public void iserir(Cliente c);

	public void atualizar(Cliente c);

	public void excluir(Cliente c);

	public Cliente buscar(int id);

	public Cliente buscarPorExemplo(Cliente c);

	public List<Cliente> listar();
}
