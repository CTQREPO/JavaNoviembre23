package com;

import java.util.Scanner;

public abstract class Calculadora_Abstracta {

	double a;
	double b;
	double resultado;
	Scanner numA = null;
	Scanner numB = null;

	public Calculadora_Abstracta() {

	}

	public Calculadora_Abstracta(double a, double b, double resultado, Scanner numA, Scanner numB) {
		super();
		this.a = a;
		this.b = b;
		this.resultado = resultado;
		this.numA = numA;
		this.numB = numB;
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

	@Override
	public String toString() {
		return "Calculadora_Asbtracta [a=" + a + ", b=" + b + "]";
	}

	public abstract void sumaNums();

	public abstract void restaNums();

	public abstract void multiNums();

	public abstract void divideNums();

}
