package br.univel.cadastro.telalogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setLocationRelativeTo(null);
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirTela();
			}
		});
		mnCadastro.add(mntmCliente);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}
	
	public void abrirTela() {		
		
		TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
		telaCadastroCliente.setCloseAction(e -> tabbedPane.remove(telaCadastroCliente));
		tabbedPane.addTab("Cadastro de Cliente ", telaCadastroCliente);
		
		
		//linhas de código abaixo faz a mesma coisa que as linhas de codigo superior 
//		TelaCadastroCliente telaCadastroCliente2 = new TelaCadastroCliente();			
		ActionListener a = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.remove(telaCadastroCliente);
			}			
		};		
		telaCadastroCliente.setCloseAction(a);		
		tabbedPane.addTab("Cadastro de Cliente ", telaCadastroCliente);
		
	}
	
	

}
