package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pi = 3.14159;
		double area, raio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos calcular a área da sua circunferência!");
		System.out.println("Qual o raio? ");
		raio = teclado.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.println("A área é de " + String.format("%.2f", area));

		teclado.close();
	}

}
