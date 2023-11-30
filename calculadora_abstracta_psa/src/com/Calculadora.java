package com;

import java.util.Scanner;

public class Calculadora extends Calculadora_Abstracta {

	@Override
	public void sumaNums() {
		// TODO Auto-generated method stub
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		b = numB.nextDouble();

		resultado = a + b;

		System.out.println("El resultado de la suma es " + (a + b));

	}

	@Override
	public void restaNums() {
		// TODO Auto-generated method stub
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		b = numB.nextDouble();

		resultado = a - b;

		System.out.println("El resultado de la suma es " + (a - b));

	}

	@Override
	public void multiNums() {
		// TODO Auto-generated method stub
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		b = numB.nextDouble();

		resultado = a * b;

		System.out.println("El resultado de la suma es " + (a * b));

	}

	@Override
	public void divideNums() {
		// TODO Auto-generated method stub
		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		Scanner numB = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		b = numB.nextDouble();

		resultado = a / b;

		System.out.println("El resultado de la suma es " + (a / b));

	}

}
