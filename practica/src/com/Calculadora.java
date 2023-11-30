package com;

public abstract class Calculadora {

	int numero1;
	int numero2;
	int resultado = numero1 + numero2;
	int resultado2 = numero1 - numero2;
	int resultado3 = numero1 / numero2;
  
 public Calculadora() {
	 
 }

public Calculadora(int numero1, int numero2, int resultado, int resultado2, int resultado3) {
	super();
	this.numero1 = numero1;
	this.numero2 = numero2;
	this.resultado = resultado;
	this.resultado2 = resultado2;
	this.resultado3 = resultado3;
	
}

public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}

public int getNumero2() {
	return numero2;
}

public void setNumero2(int numero2) {
	this.numero2 = numero2;
}

public int getResultado() {
	return resultado;
}

public void setResultado(int resultado) {
	this.resultado = resultado;
}

public int getResultado2() {
	return resultado2;
}

public void setResultado2(int resultado2) {
	this.resultado2 = resultado2;
}

public int getResultado3() {
	return resultado3;
}

public void setResultado3(int resultado3) {
	this.resultado3 = resultado3;
}

@Override
public String toString() {
	return "Calculadora [numero1=" + numero1 + ", numero2=" + numero2 + ", resultado=" + resultado + ", resultado2="
			+ resultado2 + ", resultado3=" + resultado3 + "]";
}
}
