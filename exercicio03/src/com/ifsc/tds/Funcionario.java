package com.ifsc.tds;

public class Funcionario {
	private String nome, sobrenome;
	private double valorPorHora;
	private int horasTrabalhadas;
	
	public Funcionario (String fNome, String fSobrenome, int fHora, double fValor) {
		this.nome = fNome;
		this.sobrenome = fSobrenome;
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
	public void incrementarHoras(int fMais){
		horasTrabalhadas = horasTrabalhadas + fMais;
	}
}
