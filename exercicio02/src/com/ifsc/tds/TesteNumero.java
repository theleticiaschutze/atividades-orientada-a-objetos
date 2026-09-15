package com.ifsc.tds;

import java.util.Scanner;

public class TesteNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;

		// coletando valores do usuário
		System.out.println("Digite o primeiro valor:");
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = teclado.nextInt();

		// usando o constructor
		MaiorNumero numeros = new MaiorNumero(n1, n2);

		// passando resposta
		numeros.maior();

		teclado.close();

	}

}
