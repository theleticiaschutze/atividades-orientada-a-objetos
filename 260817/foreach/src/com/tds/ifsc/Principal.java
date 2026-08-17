package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vetorNumeros = new int[5];
		int soma = 0;

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Entre com o número " + (i + 1) + ": ");
			vetorNumeros[i] = teclado.nextInt();
		}

		for (int numero : vetorNumeros) {
			soma = soma + numero;
		}
		System.out.println("A soma dos números que você digitou é: " + soma);

		teclado.close();
	}

}
