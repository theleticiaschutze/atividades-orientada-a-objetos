package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base, expoente, resultado;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Qual a base? ");
		base = teclado.nextDouble();
		
		System.out.println("Qual o expoente?");
		expoente = teclado.nextDouble();
		
		
		resultado = Math.pow(base, expoente);
		
		System.out.println("O potência de " + base + " elevado à " + expoente + " é " + resultado);
		
		teclado.close();

	}

}
