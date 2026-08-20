package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, sobrenome, completo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		nome = teclado.nextLine();
		System.out.println("Qual seu sobrenome?");
		sobrenome = teclado.nextLine();
		
		completo = nome + " " + sobrenome;
		
		System.out.print("Seu nome completo é " + completo);
		
		teclado.close();
	}

}
