package com;

import java.util.Scanner;

public abstract class Calculadora {
	double a;
	double b;
	double resultado;
	Scanner numA = null;
	Scanner numB = null;
	
	public Calculadora() {
		
	}

	public Calculadora(double a, double b, double resultado, Scanner numA, Scanner numB) {
		super();
		this.a = a;
		this.b = b;
		this.resultado = resultado;
		this.numA = numA;
		this.numB = numB;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public Scanner getNumA() {
		return numA;
	}

	public void setNumA(Scanner numA) {
		this.numA = numA;
	}

	public Scanner getNumB() {
		return numB;
	}

	public void setNumB(Scanner numB) {
		this.numB = numB;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", resultado=" + resultado + ", numA=" + numA + ", numB=" + numB
				+ "]";
	}

	public abstract void sumaNums();

	public abstract void restaNums();
	
	public abstract void elevaNums();
	
	public abstract void areaCirculo();

	
		
}
	
	


