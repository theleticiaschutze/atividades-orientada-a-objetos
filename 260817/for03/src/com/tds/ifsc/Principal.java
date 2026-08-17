package com.tds.ifsc;

import java.util.Scanner;  //Ctrl + Shift + o para importar o teclado e usar

public class Principal {

	public static void main(String[] args) {
		double[] item = new double[20];
		int i;
		double soma = 0;
		
		Scanner teclado = new Scanner(System.in);  //adiciona para pegar dados do teclado
		
		for(i = 0; i<20; i++) {
			System.out.println("Qual o valor do produto " + (i+1) + "/20? "); 
			item[i] = teclado.nextDouble();
			soma += item[i];
		}
		
		System.out.println("O valor total da compra é " + soma);
		
		teclado.close();

	}

}
