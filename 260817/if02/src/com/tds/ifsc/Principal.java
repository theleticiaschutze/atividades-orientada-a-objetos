package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Gerando desconto do imposto do salário!");
		System.out.println("Qual o salário?");
		salario = teclado.nextDouble();
		
		if(salario < 1000) {
			System.out.println("Salário a receber: R$ " + String.format("%.2f", salario));
		} else if(salario <= 2200) {
			salario = salario - (salario * 0.13);
			System.out.println("Salário a receber: R$ " + String.format("%.2f", salario));
		} else {
			salario = salario - (salario * 0.22);
			System.out.println("Salário a receber: R$ " + String.format("%.2f", salario));	
		}

		teclado.close();
	}

}
