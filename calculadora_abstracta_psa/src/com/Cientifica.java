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

		System.out.println("El resultado de la resta es " + (a - b));

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

		System.out.println("El resultado de la multiplicación es " + (a * b));

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

		System.out.println("El resultado de la división es " + (a / b));

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

	public void calculaSeno() {

		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		resultado = Math.sin(a);

		System.out.println("El seno de " + a + " es " + resultado);

	}

	public void calculaCos() {

		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		resultado = Math.cos(a);

		System.out.println("El coseno de " + a + " es " + resultado);

	}

	public void calculaTan() {

		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		resultado = Math.tan(a);

		System.out.println("La tangente de " + a + " es " + resultado);

	}

	public void calculaArcsen() {

		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		resultado = Math.asin(a);

		System.out.println("El arco seno de " + a + " es " + resultado);

	}

	public void calculaArccos() {

		Scanner numA = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numA.nextDouble();

		resultado = Math.acos(a);

		System.out.println("El arco coseno de " + a + " es " + resultado);

	}

}
