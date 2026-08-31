package com.ifsc.tds;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String fNome, fSobrenome;
		double fValor;
		int fHora, fMais;
		
		
		System.out.println("Qual o nome do funcionário? ");
		fNome = teclado.next();
		
		System.out.println("Qual o sobrenome do funcionário? ");
		fSobrenome = teclado.next();
		
		System.out.println("Quantas horas " + fNome +" trabalhou? ");
		fHora = teclado.nextInt();
		
		System.out.println("Qual o valor da hora de " + fNome + " ? ");
		fValor = teclado.nextDouble();
		
		Funcionario f1 = new Funcionario(fNome, fSobrenome, fHora, fValor);
		
		f1.nomeCompleto();
		
		f1.calcularSalario();
		
		System.out.println("Quantas horas " + fNome + " trabalhou a mais? ");
		fMais = teclado.nextInt();
		
		f1.incrementarHoras(fMais);
		
		f1.calcularSalario();
		
		teclado.close();
	}

}
