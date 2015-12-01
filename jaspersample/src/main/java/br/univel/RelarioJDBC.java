package br.univel;

import java.sql.Connection;
import java.sql.DriverManager;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelarioJDBC {
	Connection con;
	private String arq = "C:\\Users\\Alex\\JaspersoftWorkspace\\MyReports\\Academia.jasper";
	
	public RelarioJDBC(){
		try {
			JasperPrint jsp = JasperFillManager.fillReport(arq, null, getConnection());
			JasperViewer jsv = new JasperViewer(jsp);
			jsv.setVisible(true);			
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Connection getConnection() throws Exception {
		String drivername = "com.mysql.jdbc.Driver";
		Class.forName(drivername);		
		String url = "jdbc:mysql://localhost/bdd";
		String user = "root";
		String pass = "'123'";
		return con = DriverManager.getConnection(url, user, pass);
	}
	
	public static void main(String[] args) {
		new RelarioJDBC();
	}

}
