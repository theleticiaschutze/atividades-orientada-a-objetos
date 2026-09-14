package com.ifsc.tds;

public class Gerente extends Funcionario {
	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean validarSenha(int valorSenha) {
		if(this.getSenha() == valorSenha) {
			return true;
		} else {
			return false; 
			
		}
	}

}
