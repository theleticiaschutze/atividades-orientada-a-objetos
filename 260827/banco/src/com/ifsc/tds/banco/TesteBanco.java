package com.ifsc.tds.banco;

public class TesteBanco {

	public static void main(String[] args) {
		//criando minha conta com o valor
		Conta minhaConta = new Conta(500.00);
		
		//fazendo um saque
		minhaConta.saque(150.00);
		
		//fazendo um depósito
		minhaConta.deposito(22.50);
		
		//mais um saque
		minhaConta.saque(47.62);

		//imprimindo meu saldo!!
		System.out.println("O seu saldo é de R$ " + minhaConta.getSaldo());

	}

}
