package com.ifsc.tds.banco;

public class Conta {
	private double saldo;
	
	
	public Conta(double valor){  //com o mesmo nome da classe você chama em outro lugar 
		this.saldo = valor;   //op tal do "CONSTRUTOR"
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saque(double valor) {
		this.saldo = this.saldo - valor;
	}

}
