package com;

import java.util.Scanner;

public class Ccient�fica extends Calculadora{

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
	
	public void senRes() {
		
		scanA=new Scanner(System.in);
		System.out.println("Ingrese un n�mero.");
		a=scanA.nextDouble();
		
		resultado = Math.sin(a);
		
		System.out.println("El seno de "+ a + " es: "+ resultado);
	}
	
	public void cosRes() {
		
		scanA=new Scanner(System.in);
		System.out.println("Ingrese un n�mero.");
		a=scanA.nextDouble();
		
		resultado = Math.cos(a);
		
		System.out.println("El coseno de "+ a + " es: "+ resultado);
		
	}
	
	public void tanRes() {
		
		scanA=new Scanner(System.in);
		System.out.println("Ingrese un n�mero.");
		a=scanA.nextDouble();
		
		resultado = Math.tan(a);
		
		System.out.println("La tangente de "+ a + " es: "+ resultado);
		
	}
	
	public void raizRes() {
		
		scanA=new Scanner(System.in);
		System.out.println("Ingrese un n�mero.");
		a=scanA.nextDouble();
		
		resultado = Math.sqrt(a);
		
		System.out.println("La ra�z de "+ a + " es: "+ resultado);
		
	}
}
		
		

