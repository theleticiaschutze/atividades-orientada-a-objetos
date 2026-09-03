package com.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		int x = 10;
		float y = 15.5f; //float no java tem que colocar o f atrás
		byte z = 127; //máximo que ele chega vai do -128 até 127
		String texto = new String();

		y = x;
		
		x = (int)y;
		
		x = 502;
		z = (byte)x;  //ele vai virar 44, e não 300, 
		//pois ele pega o binario, como é byte pega apenas as oito casas que é 00101100 
		//que dá 44 ao inves dos 300 000100101100 
		
		System.out.println(z);
		
		texto = "10";
		
		x = Integer.parseInt(texto); 
		//chamamos o wrapper do int para passar do string pro int, usando o . parseInt
		
		System.out.println(x);
		
		texto = String.valueOf(x); 
		//value of passa de numero pra texto, tipo string
		
		
	}

}
