package com.tds.ifsc;

public class Principal {

	public static void main(String[] args) {
		int i = 0;
		
		System.out.println("Números impares do 1 ao 20!");
		
		for(i=0; i<20; i++) {
			if(i%2 == 1) {
				System.out.println("Número ímpar: " + i);
			}
		}

	}

}
