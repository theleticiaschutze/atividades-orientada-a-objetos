package com.tds.ifsc;

public class Boletim {
	/**
	 * Método para calcular média. Recebe como parâmetro o valor total das notas digitadas
	 * 
	 * @param double
	 * */
	public void calcularMedia(double totalNotas) {
        System.out.println("A média é: " + String.format("%.2f", (totalNotas / 4)));
	}

}
