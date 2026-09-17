package com.ifsc.tds;

import java.util.Scanner;

public class TesteMediaAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MediaAluno aluno = new MediaAluno();
		int i = 0;
		Double[] notas = new Double[4];

		for (i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();
		}

		aluno.setN0(notas[0]);
		aluno.setN1(notas[1]);
		aluno.setN2(notas[2]);
		aluno.setN3(notas[3]);

		aluno.mediaFinal();

		teclado.close();
	}

}