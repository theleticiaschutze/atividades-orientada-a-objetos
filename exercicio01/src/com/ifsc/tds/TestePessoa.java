package com.ifsc.tds;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		nome = teclado.next();
		System.out.println("Qual sua idade?");
		idade = teclado.nextInt();
		
		Pessoa pessoa = new Pessoa(nome, idade);
		
		pessoa.dizerONome();
		
		pessoa.dizerAIdade();
		
		pessoa.fazerAniversario();
		
		pessoa.dizerAIdade();

		teclado.close();
	}

}
