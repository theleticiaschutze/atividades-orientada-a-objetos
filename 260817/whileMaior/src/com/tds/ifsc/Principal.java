package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero, i = 0, maior;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o maior número entre os que digitou? Eu faço");
		
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		maior = numero;
		
		while(i < 20) {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			if(numero>maior) {
				maior = numero;
			}
			i++;
		}
		
		System.out.println("O maior número digitado é " + maior + "!");
		
		teclado.close();

	}

}
