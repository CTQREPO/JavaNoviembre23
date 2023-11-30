package com;

public class Principal {
	
public static void main(String[] args) {
		
		CalculadoraBasica cb1=new CalculadoraBasica();
		cb1.sumaNums();
		System.out.println(cb1.resultado);
		
		CalculadoraBasica cb2=new CalculadoraBasica();
		cb2.restaNums();
		System.out.println(cb2.resultado);
		
		CalculadoraCientifica cc1=new CalculadoraCientifica();
		cc1.elevaNums();
		System.out.println(cc1.resultado);
		
		CalculadoraCientifica cc2=new CalculadoraCientifica();
		cc2.areaCirculo();
		System.out.println(cc2.resultado);
		
	
		
	}
	


}
