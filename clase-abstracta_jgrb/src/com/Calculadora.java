package com;

import java.util.Scanner;

public abstract class Calculadora {

	double a;
	double b;
	double resultado;
	Scanner scanA;
	Scanner scanB;
	
	public Calculadora () {
	
		
	}

	public Calculadora(double a, double b, double resultado, Scanner scanA, Scanner scanB) {
		super();
		this.a = a;
		this.b = b;
		this.resultado = resultado;
		this.scanA = scanA;
		this.scanB = scanB;
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

	public Scanner getScanA() {
		return scanA;
	}

	public void setScanA(Scanner scanA) {
		this.scanA = scanA;
	}

	public Scanner getScanB() {
		return scanB;
	}

	public void setScanB(Scanner scanB) {
		this.scanB = scanB;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", resultado=" + resultado + "]";
	}
	
	//Abstractos
	public abstract void sumaRes();
	public abstract void restaRes();
	public abstract void multiRes();
	public abstract void divRes();
}
