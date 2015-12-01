package br.univel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class CustomBs implements JRDataSource {

	private int count;


	public Object getFieldValue(JRField arg0) throws JRException {
		
		if ("Field_1".equals(arg0.getName())) {
			return count + " Olá";
		}
		if ("Field_2".equals(arg0.getName())) {
			return "mundo";
		}
		
		return "indef";
	}


	public boolean next() throws JRException {
		return count++ < 15;
	}

}
