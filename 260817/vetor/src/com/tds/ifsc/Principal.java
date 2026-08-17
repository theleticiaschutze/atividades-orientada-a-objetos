package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v[] = new int[10]; // declaração do vetor "v"
		int i; // índice ou posição

		// Entrada de Dados
		for (i = 0; i < v.length; i++) {
			System.out.printf("Informe numero %2d/%d: ", (i + 1), v.length);
			v[i] = teclado.nextInt();
		}

		// Processamento: somar todos os valores, definir o maior e o menor valor
		int soma = 0;
		int menor = v[0]; // v[0] = 1o. valor armazenado no vetor "v"
		int maior = v[0];
		for (i = 0; i < v.length; i++) {
			soma = soma + v[i];

			if (v[i] < menor)
				menor = v[i];

			if (v[i] > maior)
				maior = v[i];
		}

		// Saída (resultados)
		System.out.printf("\n");
		for (i = 0; i < v.length; i++) {
			if (v[i] == menor)
				System.out.printf("v[%d] = %2d <-- menor valor\n", i, v[i]);
			else if (v[i] == maior)
				System.out.printf("v[%d] = %2d <-- maior valor\n", i, v[i]);
			else
				System.out.printf("v[%d] = %2d\n", i, v[i]);
		}
		System.out.printf("\nSoma = %d\n", soma);

		teclado.close();

	}

}
