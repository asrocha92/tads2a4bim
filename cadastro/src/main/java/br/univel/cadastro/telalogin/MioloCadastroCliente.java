package br.univel.cadastro.telalogin;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Dimension;

public class MioloCadastroCliente extends JPanel {
	
	protected JTextField txt_id;
	protected JTextField txt_nome;
	private JLabel label;
	private JLabel lblEndereo;
	private JTextField txt_endereco;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblUf;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox cbx_uf;
             
	/**      
	 * Create the panel.
	 */
	public MioloCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID: ");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		add(lblId, gbc_lblId);
		
		txt_id = new JTextField();
		GridBagConstraints gbc_txt_id = new GridBagConstraints();
		gbc_txt_id.insets = new Insets(0, 0, 5, 0);
		gbc_txt_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_id.gridx = 1;
		gbc_txt_id.gridy = 1;
		add(txt_id, gbc_txt_id);
		txt_id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txt_nome = new JTextField();
		GridBagConstraints gbc_txt_nome = new GridBagConstraints();
		gbc_txt_nome.insets = new Insets(0, 0, 5, 0);
		gbc_txt_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_nome.gridx = 1;
		gbc_txt_nome.gridy = 2;
		add(txt_nome, gbc_txt_nome);
		txt_nome.setColumns(10);
		
		lblEndereo = new JLabel("Endere\u00E7o: ");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 3;
		add(lblEndereo, gbc_lblEndereo);
		
		txt_endereco = new JTextField();
		GridBagConstraints gbc_txt_endereco = new GridBagConstraints();
		gbc_txt_endereco.insets = new Insets(0, 0, 5, 0);
		gbc_txt_endereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_endereco.gridx = 1;
		gbc_txt_endereco.gridy = 3;
		add(txt_endereco, gbc_txt_endereco);
		txt_endereco.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Telefone: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Cidade: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 5;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblUf = new JLabel("UF: ");
		GridBagConstraints gbc_lblUf = new GridBagConstraints();
		gbc_lblUf.anchor = GridBagConstraints.EAST;
		gbc_lblUf.insets = new Insets(0, 0, 5, 5);
		gbc_lblUf.gridx = 0;
		gbc_lblUf.gridy = 6;
		add(lblUf, gbc_lblUf);
		
		cbx_uf = new JComboBox();
		cbx_uf.setPreferredSize(new Dimension(41, 20));
		GridBagConstraints gbc_cbx_uf = new GridBagConstraints();
		gbc_cbx_uf.insets = new Insets(0, 0, 5, 0);
		gbc_cbx_uf.anchor = GridBagConstraints.WEST;
		gbc_cbx_uf.gridx = 1;
		gbc_cbx_uf.gridy = 6;
		add(cbx_uf, gbc_cbx_uf);
		
		label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 7;
		add(label, gbc_label);
	}

}