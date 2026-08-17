package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota, media = 0;
		int i = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(i<4) {
			System.out.println("Qual a " + (i+1) + " nota?");
			nota = teclado.nextDouble();
			media += nota;
			i++;
		}
		
		media = media / 4;
		
		System.out.println("A média desse bimestre é de " + String.format("%.2f", media) + "!");
		
		teclado.close();
	}

}