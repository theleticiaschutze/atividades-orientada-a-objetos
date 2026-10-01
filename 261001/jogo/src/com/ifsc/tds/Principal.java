package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int i, d;
		String ms = "";
		String ns = "";

		do{
			System.out.println("-- VITAL MESSAGE --\n\n");
			System.out.println("Qual a dificuldade? (4 - 10)");
			d = teclado.nextInt();
			
			try {
				Thread.sleep(d * 400);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		}while(d <4 || d >10);

		for (i = 0; i < d; i++) {
			ms = ms + (char) (Math.random() * 26 + 65);
		}

		System.out.println(ms);

		try {
			Thread.sleep(d * 400);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Qual era a mensagem? ");
		ns = teclado.next();

		if (ms.equals(ns)) {

			System.out.println("Mensagem correta!");
			System.out.println("A guerra acabou!");
		} else {

			System.out.println("Você errou viu!");
			System.out.println("Você deveria ter mandado :" + ms);
		}

		teclado.close();

	}

}
