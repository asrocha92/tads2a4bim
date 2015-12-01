package br.univel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReportJdbc {

	Connection con;
	private String arq = "C:\\Users\\Alex\\JaspersoftWorkspace\\MyReports\\simplesJDBC.jasper";

	public SimpleReportJdbc() throws SQLException {

		JasperPrint jasperPrint = null;
		try {
			jasperPrint = JasperFillManager.fillReport(arq, null,
					getConnection());
			JasperViewer jasperViewer = new JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {
		String driverName = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://192.168.101.10/employees";
		String user = "jasper";
		String pass = "jasper";

		return con = DriverManager.getConnection(url, user, pass);
	}

	// pra teste
	// public static void main(String[] args) throws SQLException {
	// new SimpleReportJdbc();
	// }
}
