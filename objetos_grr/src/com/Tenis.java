package com;

public class Tenis {

	String color;
	String modelo;
	String materiales;
	String marca;
	float talla=0;
	
	public Tenis(){
		
		
	}

	
	public Tenis(String color, String modelo, String materiales, String marca, int talla) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.materiales = materiales;
		this.marca = marca;
		this.talla = talla;
	}





	//getters & setters
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	
	
	
	//toString
	
	@Override
	public String toString() {
		return "Tenis [color=" + color + ", modelo=" + modelo + ", materiales=" + materiales + ", marca=" + marca
				+ ", talla=" + talla + "]";
	}
	
	
}
