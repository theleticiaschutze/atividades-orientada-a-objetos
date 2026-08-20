package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base, expoente;
		Scanner teclado = new Scanner(System.in);
		Potencia calculo = new Potencia();
		
		
		System.out.println("Qual a base? ");
		base = teclado.nextDouble();
		
		System.out.println("Qual o expoente?");
		expoente = teclado.nextDouble();
		
		
		System.out.println("O potência de " + base + " elevado à " + expoente + " é " + calculo.Calculo(base, expoente));
		
		teclado.close();

	}

} //04

	
