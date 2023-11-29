package com;

public class Principal_Calculadora {

	public static void main(String[] args) {
		
		Calculadora c1=new Calculadora();
		c1.sumaNums();
		System.out.println(c1.resultado);
		
		Cientifica cien1=new Cientifica();
		cien1.elevaNums();
		System.out.println(cien1.resultado);
		cien1.sumaNums();
		System.out.println(cien1.resultado);
	}
}
