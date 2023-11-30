package com;

import java.util.Scanner;

public class CalculadoraCientifica extends Calculadora {
	
	@Override
	public void elevaNums() {
		System.out.println("exponente de un numero: ");
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el segundo número.");
		b = numB.nextDouble();

		resultado = Math.pow(a, b);

		System.out.println(a + " elevado a la " + b + " potencia es " + (Math.pow(a, b)));
			
		
	}
	
	@Override
	public void areaCirculo() {
		Scanner numA = new Scanner(System.in);
		System.out.println("ingresa un numero para calcular su coseno");
		a = numA.nextDouble();

		

		resultado = Math.cos(a);

		System.out.println("El coseno de: "+ a +" es"+ resultado);
			
		
	}
	@Override
	public void sumaNums() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restaNums() {
		// TODO Auto-generated method stub
		
	}

	



	
}
