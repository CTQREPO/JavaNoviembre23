package com;

public abstract class Calculadora {
	
	String operador;   //operacion a realizar ( + , * , / , - , log , exponente , potencia, etc) 
	int operandos;   //cuantos operandos va a tener la operacion(cientifica)
	int numdecimals;
	
	public Calculadora() {
		
	}

	public Calculadora(String operador, int operandos, int numdecimals) {
		super();
		this.operador = operador;
		this.operandos = operandos;
		
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getOperandos() {
		return operandos;
	}

	public void setOperandos(int operandos) {
		this.operandos = operandos;
	}

	public int getNumdecimals() {
		return numdecimals;
	}

	public void setNumdecimals(int numdecimals) {
		this.numdecimals = numdecimals;
	}

	@Override
	public String toString() {
		return "Calculadora [operador=" + operador + ", operandos=" + operandos + ", numdecimals=" + numdecimals + "]";
	}
	
	public abstract void calcular();

	
}
