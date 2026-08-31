package com.ifsc.tds;

public class Funcionario {
	private String nome, sobrenome, cpf;
	private double valorPorHora, horasTrabalhadas;
	
	public Funcionario (String fNome, String fSobrenome, String fCpf, int fHora, double fValor) {
		this.nome = fNome;
		this.sobrenome = fSobrenome;
		this.cpf = fCpf
		this.valorPorHora = fValor;
		this.horasTrabalhadas = fHora;
	}
	
	public void nomeCompleto() {
		System.out.println("O nome completo é " + nome + " " + sobrenome);
	}
	
	public void calcularSalario(){
		double salario = horasTrabalhadas * valorPorHora;
		System.out.println("Salário: R$ " + salario);
		
	}

	public void incrementarHoras(double valor){
		horasTrabalhadas = horasTrabalhadas + fMais;
	}

	public void alterarValorHora(double valor){
		this.valorPorHora = valor;
	}
}
