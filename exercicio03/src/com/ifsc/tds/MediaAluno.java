package com.ifsc.tds;

public class MediaAluno {
	private double n0, n1, n2, n3;
	private double media;

	public void setN0(double n0) {
		this.n0 = n0;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public void mediaFinal() {
		this.media = (this.n0 + this.n1 + this.n2 + this.n3) / 4;

		System.out.println("A média do aluno é de " + String.format("%.2f", media));

		if (this.media >= 6)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");
	}

}
