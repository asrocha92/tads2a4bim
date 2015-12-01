package br.univel;

import javax.swing.JFrame;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleRelatorio {

	private String arq = "C:\\Users\\Alex\\git\\tads2a4bim\\jaspercustom\\src\\main\\resources\rel1.jrxml";

	public void SimpleReportDiretoPdf() {

		JasperPrint jp = null;
		try {
			
			JRDataSource customDs = new CustomBs();

			jp = JasperFillManager.fillReport(arq, null, customDs);

			 JasperViewer jasperViewer = new JasperViewer(jp);
			
			 jasperViewer.setBounds(50, 50, 320, 240);
			 jasperViewer.setLocationRelativeTo(null);
			 jasperViewer.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			 jasperViewer.setVisible(true);

			
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		new SimpleRelatorio().SimpleReportDiretoPdf();
	}
	
}
