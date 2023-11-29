package com;

public class CalculadoraCientifica extends Calculadora{

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
	public void exponente(double numero1,int exponente) {	
		double resultado = 1;
		for (int i = 0; i <exponente; i++) {
			 resultado = resultado*numero1;
		}	System.out.println(resultado);	
	}
	
	public void cos(double numero) {
		double resultado = Math.cos(numero);
		System.out.println(resultado);
		}
}
	
	

