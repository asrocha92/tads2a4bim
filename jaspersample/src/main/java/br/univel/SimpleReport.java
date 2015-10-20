package br.univel;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.commons.collections.map.HashedMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReport {

	private String arq = "C:\\Users\\Alex\\JaspersoftWorkspace\\MyReports\\simples.jasper";

	public SimpleReport() {
		
		TableModel tableModel = TableModelData();
		
		JasperPrint jasperPrint = null;
		TableModelData();
		try {
			//passar nome para os parametro de relatorio jasper
			Map<String, Object> map = new HashMap<String , Object>();
			map.put("empresa", "Petrobras");
			map.put("telefone", "4535431221");
			
			//tirar o num e colocar o map
			jasperPrint = JasperFillManager.fillReport(arq, map, //instasiar o jframe pra ser visualizado na tela
					new JRTableModelDataSource(tableModel)); //é a que vai preencher seu relatorio //essa linha é um decorator
			JasperViewer jasperViewer = new JasperViewer(jasperPrint);
			
			jasperViewer.setLocationRelativeTo(null);
			jasperViewer.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * @return table model usado para fazer um jtable
	 */
	private TableModel TableModelData() {
		String[] columnNames = { "Id", "Nome", "Departamento", "Email" };
		
		//matriz bi-dimencional
		String[][] data = {
				{ "1", "Hugo", "Financeiro", "hugod@univel.br" },
				{ "2", "José", "Comercial",  "josed@univel.br" },
				{ "3", "Luiz", "Contábil",   "luizd@univel.br" }
		};
		
		return new DefaultTableModel(data, columnNames);
	}

	public static void main(String[] args) {
		new SimpleReport();
	}
}

