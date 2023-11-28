package com;

public class Consola {

	String marca;
	String generacion;
	String color;
	
	int capacidad;
	
	public Consola() {
		
	}
	
	public Consola(String marca, String color, int capacidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.capacidad = capacidad;
	}
	
	public Consola(String marca, String generacion, String color, int capacidad) {
		super();
		this.marca = marca;
		this.generacion = generacion;
		this.color = color;
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Consola [marca=" + marca + ", generacion=" + generacion + ", color=" + color + ", capacidad="
				+ capacidad + "]";
	}
	
	
	
	
	
}
