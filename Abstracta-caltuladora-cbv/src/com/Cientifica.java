package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {

	int resultado;
	int n;
	int x;

	public void potencia() {
		System.out.println("numero X elevado a la potencia N \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el numero X \\n");
		x = sc.nextInt();
		System.out.println("Ingresa la potencia N");
		n = sc.nextInt();

		System.out.println("La tabla del " + resultado + " es: ");
		resultado=x;
		for (int i = 1; i < n; i++) {
			resultado = resultado * resultado;
		}
		System.out.println(x + "elevado a la potencia " + n + " es: " + resultado);
	}
	
	public void graficar() {
		 int ancho=0;
		 int alto=0;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese el ancho");
		 ancho = sc. nextInt();
		 System.out.println("Ingrese el alto");
		 alto = sc.nextInt();
		 
		 for(int i=0; i< alto; i++) {
			 for(int j=1; j< ancho; j++) {
				 System.out.print("+");
			 }
			 System.out.println("+");
		 }
	}

	@Override
	public void calcular() {
		int numero;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el numero a multiplicar");
		numero = sc.nextInt();
		System.out.println("Ingresa el numero por el que quieres multiplicarlo");
		n = sc.nextInt();

			System.out.println(numero + " multiplicaco por " + n + " es: " + (numero * n));

		
	}

}
