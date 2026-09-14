package com.ifsc.tds;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Automovel carro = new Automovel();
		
		
		System.out.println("Vamos verificar as informações do seu carro!");
	
		System.out.println("Digite a capacidade de passageiros: ");
		carro.setCapacidade(teclado.nextInt());
	
		System.out.println("Digite o número de rodas");
		carro.setRodas(teclado.nextInt());
		
		System.out.println("Digite a cor do carro: ");
		carro.setCor(teclado.next());
		
		System.out.println("Digite o número de portas: ");
		carro.setPortas(teclado.nextInt());
		
		System.out.println("Digte a placa do carro: ");
		carro.setPlaca(teclado.next());

		//saidas
		System.out.println("\n\n\n Descrição completa do seu carro");
		System.out.println("Capacidade.......: " + carro.getCapacidade());
		System.out.println("Número de rodas..: " + carro.getRodas());
		System.out.println("Cor..............: " + carro.getCor());
		System.out.println("Número de portas.: " + carro.getPortas());
		System.out.println("Placa............: " + carro.getPlaca());
		
		teclado.close();
	}

}
