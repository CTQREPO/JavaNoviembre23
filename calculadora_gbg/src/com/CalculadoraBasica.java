package com;

import java.util.Scanner;

public class CalculadoraBasica extends Calculadora{

	@Override
	public void sumaNums() {
		
		System.out.println("suma de dos  numeros: ");
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el segundo número.");
		b = numB.nextDouble();

		resultado = a + b;

		System.out.println("El resultado de la suma es " + resultado);
		
	}


@Override
public void restaNums() {
	System.out.println("resta de dos numeros: ");
	Scanner numA = new Scanner(System.in);
	System.out.println("Digite el primer número.");
	a = numA.nextDouble();

	Scanner numB = new Scanner(System.in);
	System.out.println("Digite el segundo número.");
	b = numB.nextDouble();

	resultado = a - b;

	System.out.println("El resultado de la suma es " + resultado );
}



}
