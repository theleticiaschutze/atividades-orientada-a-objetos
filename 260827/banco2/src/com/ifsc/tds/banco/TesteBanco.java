package com.ifsc.tds.banco;

import java.util.Scanner;

public class TesteBanco { //esse é a versão 2, neste eu peço ao usuário o que ele vai fazer

	public static void main(String[] args) {
		double inicial, valor;
		Scanner teclado = new Scanner(System.in);
		
		//pedindo valor inicial da conta
		System.out.println("Olá tudo bem? Hoje vamos criar sua conta aqui no banco da lele! ");
		System.out.println("Qual o valor inicial da sua conta? ");
		inicial = teclado.nextDouble();
	
		//criando minha conta com o valor do cliente
		Conta minhaConta = new Conta(inicial);
				
		System.out.println("Agora insira o valor do saque: ");
		valor = teclado.nextDouble();
		minhaConta.saque(valor);
		
		System.out.println("Agora insira o valor do deposito: ");
		valor = teclado.nextDouble();
		minhaConta.deposito(valor);
		
		System.out.println("Agora insira o valor do novo saque: ");
		valor = teclado.nextDouble();
		minhaConta.saque(valor);
		

		//imprimindo meu saldo!!
		System.out.println("O seu saldo é de R$ " + String.format("%.2f", minhaConta.getSaldo()));

		teclado.close();
	}

}
