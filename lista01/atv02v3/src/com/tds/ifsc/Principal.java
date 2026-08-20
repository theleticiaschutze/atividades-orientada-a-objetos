package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double totalNotas= 0;
		Scanner teclado = new Scanner(System.in);
		Boletim ifsc = new Boletim();
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Qual a " + (i+1) + " nota?");
			totalNotas += teclado.nextDouble();
		}
		
		double media = ifsc.calcularMedia(totalNotas);
		System.out.println("A média é: " + String.format("%.2f", media));
		

		teclado.close();
	}

}


		
