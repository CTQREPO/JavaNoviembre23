package com;

public class Carro {

	// Atributos
	String color;
	String tipo;
	String materiales;
	int kilometraje, velocidades;

	// constructores
	public Carro() {
	}

	public Carro(String color, String tipo, String materiales, int kilometraje, int velocidades) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.materiales = materiales;
		this.kilometraje = kilometraje;
		this.velocidades = velocidades;
	}

	public Carro(String materiales, int kilometraje, int velocidades) {
		super();

		this.materiales = materiales;
		this.kilometraje = kilometraje;
		this.velocidades = velocidades;
	}

	// Getters & Setters

	// toString

	// -------Comportamientos

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	@Override
	public String toString() {
		return "carro [color=" + color + ", tipo=" + tipo + ", materiales=" + materiales + ", kilometraje="
				+ kilometraje + ", velocidades=" + velocidades + "]";
	}

}