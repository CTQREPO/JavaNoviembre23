package com;

import java.util.Scanner;

public class Cbasica extends Calculadora {

	@Override
	public void sumaRes() {
		// TODO Auto-generated method stub
		scanA = new Scanner(System.in);
		System.out.println("Digite un n�mero.");
		a = scanA.nextDouble();
		
		scanB = new Scanner(System.in);
		System.out.println("Digite un n�mero.");
		b = scanB.nextDouble();
		
		resultado = a + b;
		
		System.out.println("El resultado de la suma es: " + resultado);
	}

	@Override
	public void restaRes() {
		// TODO Auto-generated method stub
		scanA = new Scanner(System.in);
		System.out.println("Digite un n�mero.");
		a = scanA.nextDouble();
		
		scanB = new Scanner(System.in);
		System.out.println("Digite un n�mero.");
		b = scanB.nextDouble();
		
		resultado = a - b;
		
		System.out.println("El resultado de la resta es: " + resultado);
		
	}

	@Override
	public void multiRes() {
		// TODO Auto-generated method stub
		scanA = new Scanner(System.in);
		System.out.println("Digite un numero.");
		a = scanA.nextDouble();
		
		scanB = new Scanner(System.in);
		System.out.println("Digite un n�mero.");
		b = scanB.nextDouble();
		
		resultado = a * b;
		
		System.out.println("El resultado de la multiplicaci�n es: " + resultado);
		
	}

	@Override
	public void divRes() {
		// TODO Auto-generated method stub
		scanA = new Scanner(System.in);
		System.out.println("Digite un numero.");
		a = scanA.nextDouble();
		
		scanB = new Scanner(System.in);
		System.out.println("Digite un n�mero.");
		b = scanB.nextDouble();
		
		resultado = a / b;
		
		System.out.println("El resultado de la divisi�n es: " + resultado);
		
		
		
	}

}
