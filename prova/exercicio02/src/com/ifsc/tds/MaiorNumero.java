package com.ifsc.tds;

public class MaiorNumero {
	private int v1, v2;

	public MaiorNumero(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public void maior() {
		if (v1 > v2)
			System.out.println("O maior número é o " + v1);
		else
			System.out.println("O maior número é o " + v2);
	}

}
