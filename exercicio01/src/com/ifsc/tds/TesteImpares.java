package com.ifsc.tds;

import java.util.Scanner;

public class TesteImpares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NumerosImpares numeros = new NumerosImpares();
		

		//pedindo os valores do usuário
		System.out.println("Digite o primeiro número: ");
		numeros.setV1(teclado.nextInt());
		System.out.println("Digite o segundo número: ");
		numeros.setV2(teclado.nextInt());
		
		numeros.resultados();
		
		
		teclado.close();
	}

}
