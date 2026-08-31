package com.ifsc.tds;

public class Lampada {
	private boolean acesa;
	private int potencia;
	
	public Lampada(int potencia) { //constructor
		this.acesa = false;
		this.potencia = potencia;
	}
	
	public void acender(){ //troca para true
		acesa = true;
	}
	
	public void apagar(){ //troca para false
		acesa = false;
	}
	
	public void informarSituacao(){
		if(acesa == true) {
			System.out.println("A luz está acesa!");
		} else {
			System.out.println("A luz está apagada!");
		}
	}
	
	public void informarPotencia(){
		System.out.println("A potência da lâmpada é de " + potencia + "W.");
	}

}
