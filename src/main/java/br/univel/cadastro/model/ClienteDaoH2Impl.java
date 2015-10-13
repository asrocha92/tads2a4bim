package br.univel.cadastro.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

public class ClienteDaoH2Impl implements ClienteDao {

	public static Connection con;

	public void openCon() throws SQLException {
		String url = "";
		String user = "sa";
		String pass = "sa";
		con = DriverManager.getConnection(url, user, pass);
	}

	public void closeCon() throws SQLException {
		con.close();
	}

	public void iserir(Cliente c) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("INSERT INTO CLIENTE(ID,NOME,ENDERECO,TELEFONE,UF) VALUES (?,?,?,?,?)");
			ps.setInt(1, c.getId());
			ps.setString(2, c.getNome()+"");
			ps.setString(3, c.getEndereco()+"");
			ps.setString(3, c.getTelefone()+"");
			ps.setObject(3, c.getUf()+"");
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados do cliente!");
		}

	}

	public void atualizar(Cliente c) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("UPDATE CLIENTE SET NOME = ?,ENDERECO = ?,TELEFONE = ?,UF = ? WHERE ID =" + c.getId());
			ps.setInt(1, c.getId());
			ps.setString(2, c.getNome()+"");
			ps.setString(3, c.getEndereco()+"");
			ps.setString(3, c.getTelefone()+"");
			ps.setObject(3, c.getUf()+"");
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do cliente!");
		}

	}

	public void excluir(Cliente c) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("DELETE FROM CLIENTE WHERE ID = ID");
			ps.setInt(1, c.getId());
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "Cliente ->"+c.getNome().toUpperCase()+"\nExcluido com sucesso.");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar dados do cliente \n->"+c.getNome());
		}

	}

	public Cliente buscar(int id) {
		return null;
	}

	public Cliente buscarPorExemplo(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
