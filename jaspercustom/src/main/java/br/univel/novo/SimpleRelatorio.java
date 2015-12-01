package br.univel.novo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleRelatorio {

	private static final String OUT_PDF = "out.pdf";
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

			
			
			JasperExportManager.exportReportToPdfFile(jp, OUT_PDF);

			JOptionPane
					.showMessageDialog(
							null,
							"<html>Arquivo exportado para PDF!<br><br>A aplicação vai pedir"
							+ " ao Sistema operacional <br>para abrir com o visualizador"
							+ " padrão.");

			Desktop.getDesktop().open(new File(OUT_PDF));

		} catch (JRException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		new SimpleRelatorio().SimpleReportDiretoPdf();
	}
	
}
