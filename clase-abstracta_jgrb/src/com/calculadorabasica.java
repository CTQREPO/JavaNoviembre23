package com;

import java.util.Scanner;

public class calculadorabasica extends Calculadora{

	@Override
	public void restaRes() {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void multiRes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divRes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sumaRes() {
		// TODO Auto-generated method stub
		scanA = new Scanner(System.in);
		System.out.println("digita un numero:");
		a=scanA.nextDouble();
		
		scanB = new Scanner(System.in);
		System.out.println("digita un numero:");
		b=scanB.nextDouble();
		
		resultado = a + b;
		System.out.println("el resultado de la suma es: " + resultado);	
	}

}
