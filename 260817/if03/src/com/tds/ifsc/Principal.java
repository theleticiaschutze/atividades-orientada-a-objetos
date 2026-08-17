package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso, altura;
		double imc;
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Calculadora de IMC!");
		
		System.out.println("Qual seu peso? ");
		peso = teclado.nextDouble();
		
		System.out.println("Qual sua altura? ");
		altura = teclado.nextDouble();
		
		imc = peso / (altura*altura);
		
		if(imc < 18.5) {			
			System.out.println("Você está abaixo do peso!");
		} else if(imc < 25) {
			System.out.println("Você está com o peso normal!");
		} else {
			System.out.println("Você está acima do peso!");
		}
		
		teclado.close();
	}

}
