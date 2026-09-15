package com.ifsc.tds;

public class NumerosImpares {
	private int v1, v2;
	private int soma = 0, multiplicacao = 1, i;

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}

	public void resultados() {
		for (i = v1; i <= v2; i++) {
			if (i % 2 == 1) {
				soma = soma + i;
			}
		}

		for (i = v1; i <= v2; i++) {
			if (i % 2 == 0) {
				multiplicacao = multiplicacao * i;
			}
		}

		System.out.println("Soma dos ímpares entre " + v1 + " e " + v2 + " = " + soma);
		System.out.println("Multipliçaõ dos pares entre " + v1 + " e " + v2 + " = " + multiplicacao);
	}

}
