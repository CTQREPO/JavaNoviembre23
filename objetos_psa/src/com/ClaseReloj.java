package com;

public class ClaseReloj {

	// ATRIBUTOS
	String color;
	String tipo;
	String materiales;

	int horas;
	int minutos;

	// CONSTRUCTORES (CONSTRUYE UN OBJETO DE LA CLASE)
	public ClaseReloj() {

	}

	public ClaseReloj(String color, String tipo, String materiales) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.materiales = materiales;
	}

	public ClaseReloj(String color, String tipo, String materiales, int horas, int minutos) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.materiales = materiales;
		this.horas = horas;
		this.minutos = minutos;
	}

	// SETTERS & GETTERS
	public String getColor() {
		return color;
	}

	// SETTERS SE INVOCAN, HACEN ALGO PERO NO SIEMPRE DEVUELVEN UN VALOR
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	// toString PARA CONOCER EL ESTADO DEL OBJETO
	@Override
	public String toString() {
		return "ClaseReloj [color=" + color + ", tipo=" + tipo + ", materiales=" + materiales + ", horas=" + horas
				+ ", minutos=" + minutos + "]";
	}
}
