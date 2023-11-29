package com;

public class CalculadoraBasica extends Calculadora{

	@Override
	public void suma(double numero1, double numero2) {
		System.out.println(numero1 + numero2);	
	}

	@Override
	public void resta(double numero1, double numero2) {
		System.out.println(numero1 - numero2);
	}

	@Override
	public void multiplicacion(double numero1, double numero2) {
		System.out.println(numero1*numero2);
	}

	@Override
	public void division(double numero1, double numero2) {
		System.out.println(numero1/numero2);		
	}

	@Override
	public void porcentaje(double porcentaje, double numero) {
		System.out.println(numero*(porcentaje*.01));		
	}


}
