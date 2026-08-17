package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double[] v = new double[3];
		double media = 0;
		int i = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(i =0; i<3; i++) {
			System.out.println("Digite o número: ");
			v[i] = teclado.nextDouble();
		}
		
		for(i =0; i<3; i++) {
			media+= v[i];
		}
		media = media / 3;
		
		System.out.println("A média é " + String.format("%.2f", media));
		
		teclado.close();
	}

}
