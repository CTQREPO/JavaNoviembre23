package com;

public abstract class Calculadora {
	
	
	String tamaño;
	String color;
	String funciones;
	
	public Calculadora() {
		
	}

	public Calculadora(String tamaño, String color, String funciones) {
		super();
		this.tamaño = tamaño;
		this.color = color;
		this.funciones = funciones;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	@Override
	public String toString() {
		return "Calculadora [tamaño=" + tamaño + ", color=" + color + ", funciones=" + funciones + "]";
	}
	
	public abstract void suma(double numero1, double numero2);
	public abstract void resta(double numero1, double numero2);
	public abstract void multiplicacion(double numero1,double numero2);
	public abstract void division(double numero1,double numero2);
	public abstract void porcentaje(double porcentaje,double numero);
	
	
}
