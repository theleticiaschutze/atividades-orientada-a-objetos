package com.ifsc.tds;

import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Funcionario fulano = new Funcionario();
		Gerente ciclano = new Gerente();
		
		ciclano.setCpf("123.456.789-10");
		ciclano.setNome("Ciclaninho");
		ciclano.setSalario(3000);
		ciclano.setSenha(123);
		
		fulano.setCpf("234.567.891-01");
		fulano.setNome("Fulaninho");
		fulano.setSalario(2000);
		
		System.out.println("Funcionário.: " + fulano.getNome());
		System.out.println("CPF.........: " + fulano.getCpf());
		System.out.println("Salário.....: " + fulano.getSalario());

		System.out.println("Gerente.....: " + ciclano.getNome());
		System.out.println("CPF.........: " + ciclano.getCpf());
		System.out.println("Salário.....: " + ciclano.getSalario());

		if(ciclano.validarSenha(1234)) {
			System.out.println("Senha inválida! Acesso negado!");
		} else {
			System.out.println("Senha válida! Cofre aberto!");
		}
		teclado.close();
		
	}

}
