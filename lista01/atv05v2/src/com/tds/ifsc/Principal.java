package com.tds.ifsc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner teclado = new Scanner(System.in);
		Concatenador completo = new Concatenador();
		
		System.out.println("Qual seu nome?");
		nome = teclado.nextLine();
		System.out.println("Qual seu sobrenome?");
		sobrenome = teclado.nextLine();
		
		
		System.out.println("Seu nome completo é " + completo.nomeCompleto(nome, sobrenome));
		
		teclado.close();

	}

} //05
