package com;

import java.util.Scanner;

public class CalculadoraCientifica extends Calculadora {

	@Override
	public void sumaNums() {
		System.out.println("suma de dos  numeros: ");
		Scanner numa = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numa.nextDouble();

		Scanner numb = new Scanner(System.in);
		System.out.println("Digite el segundo número.");
		b = numb.nextDouble();

		resultado = a + b;

		System.out.println("El resultado de la suma es " + resultado);
	}

	@Override
	public void restaNum() {
		System.out.println("resta de dos numeros: ");
		Scanner numa = new Scanner(System.in);
		System.out.println("Digite el primer número.");
		a = numa.nextDouble();

		Scanner numb = new Scanner(System.in);
		System.out.println("Digite el segundo número.");
		b = numb.nextDouble();

		resultado = a - b;

		System.out.println("El resultado de la suma es " + resultado);
	}

	public void multiplicacion(double numa, double numb) {
		System.out.println(numa * numb);
	}

	public void division(double numa, double numb) {
		System.out.println(numa / numb);
	}

	public void porcentaje(double porcentaje, double numero) {
		System.out.println(numero * (porcentaje * .01));
	}

	public void exponente(double numa, int exponente) {
		double resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado = resultado * numa;
		}
		System.out.println(resultado);
	}

	public void cos(double numero) {
		double resultado = Math.cos(numero);
		System.out.println(resultado);
	}
}
