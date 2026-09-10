package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		Cidade cidade = new Cidade();

		//pedir nome do cliente e saldo
		try {
			
			System.out.println("Digite o valor em conta inicial em R$: ");
			conta.setSaldo(teclado.nextDouble());
			
			System.out.println("Qual o nome do cliente? ");
			cliente.setNome(teclado.next());
			
			System.out.println("Qual a cidade da cidade? ");
			cidade.setCidade(teclado.next());
			
			conta.setCliente(cliente); //alimentando as outras classes
			cliente.setCidade(cidade);
			
			System.out.println("Na conta do cliente " + cliente.getNome() + " da cidade " + cidade.getCidade() + " há um saldo de R$ " + String.format("%.2f", conta.getSaldo()));
			
			System.out.println("Qual o valor do depósito? ");
			conta.deposito(teclado.nextDouble());
			
			System.out.println("Qual o valor do saque? ");
			conta.saque(teclado.nextDouble());
			
			System.out.println("O saldo atualizado é de R$ " + String.format("%.2f", conta.getSaldo()));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			teclado.close();			
		}
				
	}

}
