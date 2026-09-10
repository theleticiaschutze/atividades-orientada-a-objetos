package com.ifsc.tds;

public class Cliente {
	
	private String nome; //botão direito do mouse + Source + generate getter and setters e ele cria esses dois métodos abaixo!!!
	
	private Cidade cidade; 

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
