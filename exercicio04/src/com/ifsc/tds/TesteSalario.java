package com.ifsc.tds;

import java.util.Scanner;

public class TesteSalario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Salario funcionario = new Salario();

		System.out.println("Digite as horas trabalhadas: ");
		funcionario.setHoras(teclado.nextDouble());

		System.out.println("Digite o valor da hora:");
		funcionario.setValorHora(teclado.nextDouble());

		System.out.println("Digite a quantia de dependentes:");
		funcionario.setDependentes(teclado.nextDouble());

		funcionario.folha();

		teclado.close();
	}

}
