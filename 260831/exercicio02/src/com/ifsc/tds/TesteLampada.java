package com.ifsc.tds;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		int potencia;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a potencia da sua lâmpada? ");
		potencia = teclado.nextInt();
		
		Lampada luz = new Lampada(potencia);
		
		luz.acender();
		luz.informarSituacao();
		luz.apagar();
		luz.informarSituacao();
		luz.informarPotencia();
		
		teclado.close();
	}

}
