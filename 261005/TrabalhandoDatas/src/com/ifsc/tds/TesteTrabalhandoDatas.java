package com.ifsc.tds;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class TesteTrabalhandoDatas {

	public static void main(String[] args) {
		
		//data inicial
		Calendar dataInicio = Calendar.getInstance();
		
		//Atribui a data inicial
		dataInicio.set(2005, Calendar.APRIL, 16);
		
		//data de hoje
		Calendar dataFinal = Calendar.getInstance();
		
		//calculando a diferença de datas 
		long diferenca = dataFinal.getTimeInMillis() - dataInicio.getTimeInMillis();
		
		//quantidade de milissegundos em um dia
		int dia = 1000 * 60 * 60 * 24;
		long diferencaF = diferenca / dia;
		
		JOptionPane.showMessageDialog(null, "A Letícia nasceu há " + diferencaF + " dias");
		
		Date hoje = new Date();
		DateFormat df1 = null;
		String formato = "dd/MM/yyyy";
		
		df1 = new SimpleDateFormat(formato);
		
		JOptionPane.showMessageDialog(null, df1.format(hoje));
		
		
	}

}
