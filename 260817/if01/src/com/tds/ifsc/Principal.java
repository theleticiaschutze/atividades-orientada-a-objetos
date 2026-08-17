package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sistema baseado em notas de 0 a 100!");
		System.out.println("Qual a nota do aluno? ");
		nota = teclado.nextDouble();
		
		if(nota < 60) {
			System.out.println("Aluno reprovado!");
		} else {
			System.out.println("Aluno aprovado!");
		}

		
		teclado.close();
	}

}
