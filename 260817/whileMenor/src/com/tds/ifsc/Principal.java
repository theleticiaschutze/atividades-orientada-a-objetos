package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero, i = 0, menor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o menor número entre os que digitou? Eu faço");
		
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		menor = numero;
		
		while(i < 10) {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			if(numero<menor) {
				menor = numero;
			}
			i++;
		}
		
		System.out.println("O menor número digitado é " + menor + "!");
		
		teclado.close();

	}

}
