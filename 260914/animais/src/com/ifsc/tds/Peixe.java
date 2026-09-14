package com.ifsc.tds;

public class Peixe extends Animal {
	private String caracteristica;

	public Peixe(String nome, String cor, String ambiente, int patas, double comp, double mediaVel,
			String caracteristica) {
		super(nome, ambiente, cor, patas, comp, mediaVel);
		this.setCaracteristica(caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void dadosPeixe() {
		System.out.println("Nome.................: " + this.getNome());
		System.out.println("Cor..................: " + this.getCor());
		System.out.println("Ambiente.............: " + this.getAmbiente());
		System.out.println("Quantidade de patas..: " + this.getPatas());
		System.out.println("Comprimento..........: " + this.getComp());
		System.out.println("Velocidade média.....: " + this.getMediaVel());
		System.out.println("Caracterisica........: " + this.caracteristica);
	}

}
