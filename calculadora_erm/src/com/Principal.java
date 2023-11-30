package com;

	public class Principal {
	 
	public static void main(String[] args) {
	  
	  CalculadoraBasica cb1=new CalculadoraBasica();
	  cb1.sumaNums();
	  System.out.println(cb1.resultado);
	  
	  CalculadoraBasica cb2=new CalculadoraBasica();
	  cb2.restaNum();
	  System.out.println(cb2.resultado);
	  
	  CalculadoraCientifica cc3=new CalculadoraCientifica();
	  cc3.sumaNums();
	  System.out.println(cc3.resultado);
	  
	  CalculadoraCientifica cc4=new CalculadoraCientifica();
	  cc4.restaNum();
	  System.out.println(cc4.resultado);
	  
	  CalculadoraCientifica cc5=new CalculadoraCientifica();
	  cc5.multiplicacion(10.5, 20.5);
	  System.out.println(cc5.resultado);
	  
	  CalculadoraCientifica cc6=new CalculadoraCientifica();
	  cc6.division(10.5, 20.5);
	  System.out.println(cc6.resultado);
	  
	  CalculadoraCientifica cc7=new CalculadoraCientifica();
	  cc7.division(10.5,20.5);
	  System.out.println(cc7.resultado);
	  
	  CalculadoraCientifica cc8=new CalculadoraCientifica();
	  cc8.porcentaje(10.5,20.5);
	  System.out.println(cc8.resultado);
	  
	  CalculadoraCientifica cc9=new CalculadoraCientifica();
	  cc9.exponente(10.5,20);
	  System.out.println(cc9.resultado);
	  
	 }

	}
