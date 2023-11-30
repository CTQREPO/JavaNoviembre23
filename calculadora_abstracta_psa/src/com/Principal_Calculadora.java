package com;

public class Principal_Calculadora {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();
		c1.sumaNums();
		System.out.println("Calculadora: " + c1.resultado);
		c1.divideNums();
		System.out.println("Calculadora: " + c1.resultado);

		Cientifica cien1 = new Cientifica();
		cien1.elevaNums();
		System.out.println("Calculadora científica: " + cien1.resultado);
		cien1.sumaNums();
		System.out.println("Calculadora científica: " + cien1.resultado);
		cien1.calculaSeno();
		System.out.println("Calculadora científica: " + cien1.resultado);
		cien1.calculaArccos();
		System.out.println("Calculadora científica: " + cien1.resultado);
	}
}
