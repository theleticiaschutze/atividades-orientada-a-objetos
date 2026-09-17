package com.ifsc.tds;

import java.util.Scanner;

public class TesteTabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Tabuada valor = new Tabuada();
		// TODO Auto-generated method stub
		
		System.out.println("Digite o número para gerar tabuada: ");
		valor.setNumero(teclado.nextInt());

		valor.tabuada();
		
		teclado.close();
	}

}
