package com;

public class ejercicioCons2 {

	String color;
	String tipo;
	String materiales;
	String talla;

	public ejercicioCons2() {

	}

	public ejercicioCons2(String color, String tipo) {
		super();
		this.color = color;
		this.tipo = tipo;
	}
	public ejercicioCons2(String color, String tipo, String materiales, String talla) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.materiales = materiales;
		this.talla = talla;
	}

//getter and setters
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

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

//toString

	@Override
	public String toString() {
		return "ejercicioCons2 [color=" + color + ", tipo=" + tipo + ", materiales=" + materiales + ", talla=" + talla
				+ "]";
	}

}
