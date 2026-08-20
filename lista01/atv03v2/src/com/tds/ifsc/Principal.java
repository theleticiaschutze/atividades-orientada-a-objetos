package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double raio;
		Scanner teclado = new Scanner(System.in);
		Area area = new Area();

		System.out.println("Vamos calcular a área da sua circunferência!");
		System.out.println("Qual o raio? ");
		raio = teclado.nextDouble();
		
		System.out.println("A área é de " + String.format("%.2f", area.calculaRaio(raio)));

		teclado.close();
	}

}
