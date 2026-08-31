package com.ifsc.tds;

public class Pessoa {
	private int idade;
	private String nome;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void dizerONome() {
		System.out.println("Olá, meu nome é " + nome);
	}
	
	public void dizerAIdade () {
		System.out.println("Olá, eu tenho " + idade + " anos");
	}
	
	public void fazerAniversario() {
		System.out.println("Feliz aniversáriooooo");
		idade++;
	}

}
