package com.ifsc.tds;

public class Conta {
	
	private double saldo; //botão direito do mouse + Source + generate getter and setters e ele cria esses dois métodos abaixo!!!
	
	private Cliente cliente; //botão direito do mouse + Source + generate getter and setters e ele cria esses dois métodos abaixo!!!

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void deposito(double valor) {
		saldo = this.saldo + valor;
	}
	
	public void saque(double valor) {
		saldo = this.saldo - valor;
	}

}
