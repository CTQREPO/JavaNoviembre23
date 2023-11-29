package com;

public abstract class Calculadora {
	
	
	String tama�o;
	String color;
	String funciones;
	
	public Calculadora() {
		
	}

	public Calculadora(String tama�o, String color, String funciones) {
		super();
		this.tama�o = tama�o;
		this.color = color;
		this.funciones = funciones;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Calculadora [tama�o=" + tama�o + ", color=" + color + ", funciones=" + funciones + "]";
	}
	
	public abstract void suma(double numero1, double numero2);
	public abstract void resta(double numero1, double numero2);
	public abstract void multiplicacion(double numero1,double numero2);
	public abstract void division(double numero1,double numero2);
	public abstract void porcentaje(double porcentaje,double numero);
	
	
}
