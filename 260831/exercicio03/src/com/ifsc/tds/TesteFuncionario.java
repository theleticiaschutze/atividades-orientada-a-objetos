package com.ifsc.tds;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String fNome, fSobrenome, fCpf;
		double fValor, fHora;
		
		
		System.out.println("Qual o nome do funcionário? ");
		fNome = teclado.next();
		
		System.out.println("Qual o sobrenome do funcionário? ");
		fSobrenome = teclado.next();

		System.out.println("Qual o CPF do funcionário? ");
		fCpf = teclado.next();
		
		System.out.println("Quantas horas " + fNome +" trabalhou? ");
		fHora = teclado.nextDouble();
		
		System.out.println("Qual o valor da hora de " + fNome + " ? ");
		fValor = teclado.nextDouble();
		
		Funcionario f1 = new Funcionario(fNome, fSobrenome, fCpf, fHora, fValor);
		
		f1.nomeCompleto();
		
		f1.calcularSalario();
		
		System.out.println("Quantas horas " + fNome + " trabalhou a mais? ");
		f1.incrementarHoras(teclado.nextDouble());

		System.out.println("Quantas o valor das horas de " + fNome + "? ");
		f1.alterarValorHora(teclado.nextDouble());
		
		f1.calcularSalario();
		
		teclado.close();
	}

}
