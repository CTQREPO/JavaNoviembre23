package com;

import java.util.Scanner;

public class Cientifica extends Calculadora_Abstracta {

	@Override
	public void sumaNums() {
		// TODO Auto-generated method stub
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		b = numB.nextDouble();

		System.out.println("El resultado de la suma es " + (a + b));

	}

	@Override
	public void restaNums() {
		// TODO Auto-generated method stub

	}

	@Override
	public void multiNums() {
		// TODO Auto-generated method stub

	}

	@Override
	public void divideNums() {
		// TODO Auto-generated method stub

	}

	public void elevaNums() {

		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		b = numB.nextDouble();

		resultado = Math.pow(a, b);

		System.out.println(a + " elevado a la " + b + " potencia es " + (Math.pow(a, b)));

	}

}
