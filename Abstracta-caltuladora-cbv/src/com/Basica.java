package com;

import java.util.Scanner;

public class Basica extends Calculadora {

	String[] o; // + - * /
	int x, y, z;

	Scanner sc = new Scanner(System.in);

	@Override
	public void calcular() {
		// TODO Auto-generated method stub
		System.out.println("calculadora simple, suma de dos numeros \n");
		System.out.println("Ingresa primer numero \n");
		x = sc.nextInt();
		System.out.println("Ingresa segundo numero \n");
		y = sc.nextInt();

		System.out.println("pide signo de la operacion \n");
		z = x + y;
		System.out.println("muestra resultado de X (signo elejido) Y  \n");
		System.out.println("resultado " + z);
	}

}
