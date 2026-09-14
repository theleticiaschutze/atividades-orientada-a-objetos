package com.ifsc.tds;

public class Animal {
	private String nome, cor, ambiente;
	private int patas;
	private double comp, mediaVel;
	
	public Animal(String nome, String cor, String ambiente, int patas, double comp, double mediaVel) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.patas = patas;
		this.comp = comp;
		this.mediaVel = mediaVel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public double getComp() {
		return comp;
	}

	public void setComp(double comp) {
		this.comp = comp;
	}

	public double getMediaVel() {
		return mediaVel;
	}

	public void setMediaVel(double mediaVel) {
		this.mediaVel = mediaVel;
	}

}
