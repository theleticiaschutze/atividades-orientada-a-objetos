package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia;
		int idade;
		double salario; //float noo, melhor usar double
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		dia = teclado.nextInt();
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Digite seu salario: ");
		salario = teclado.nextDouble();
		
		System.out.println("--------Relatório--------");
		System.out.println("Dia da semana: " + dia); //o + junta as palavras
		System.out.println("Sua idade....: " + idade);
		System.out.println("Seu salário..: " + String.format("%.2f", salario));  //esse String.format deixa ele com duas casas decimais
		
		teclado.close();
		
	}

}
