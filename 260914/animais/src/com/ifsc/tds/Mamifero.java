package com.ifsc.tds;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero(String nome, String cor, String ambiente, int membros, double comp, double mediaVel,
			String alimento) {
		super(nome, ambiente, cor, membros, comp, mediaVel);
		this.setAlimento(alimento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dadosMamifero() {
		System.out.println("Nome...................: " + this.getNome());
		System.out.println("Cor....................: " + this.getCor());
		System.out.println("Ambiente...............: " + this.getAmbiente());
		System.out.println("Quantidade de membros..: " + this.getMembros());
		System.out.println("Comprimento............: " + this.getComp());
		System.out.println("Velocidade média.......: " + this.getMediaVel());
		System.out.println("Alimento...............: " + this.alimento);
	}

}
