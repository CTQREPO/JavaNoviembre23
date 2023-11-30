package com;

import java.util.Scanner;

public abstract class Calculadora {
	
	double a;
	double b;
	double resultado; 
	
	Scanner numa =null; 
	Scanner numb =null;
	
	public Calculadora() {
		
	}

	public Calculadora(double a, double b, double resultado, Scanner numa, Scanner numb) {
		super();
		this.a = a;
		this.b = b;
		this.resultado = resultado;
		this.numa = numa;
		this.numb = numb;
	}

	public double geta() {
		return a;
	}

	public void seta(double a) {
		this.a = a;
	}

	public double getb() {
		return b;
	}

	public void setb(double b) {
		this.b = b;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public Scanner getNuma() {
		return numa;
	}

	public void setNuma(Scanner numa) {
		this.numa = numa;
	}

	public Scanner getNumb() {
		return numb;
	}

	public void setNumb(Scanner numb) {
		this.numb = numb;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", resultado=" + resultado + "]";
	}

 public abstract void sumaNums();
 public abstract void restaNum();
 
	
}
