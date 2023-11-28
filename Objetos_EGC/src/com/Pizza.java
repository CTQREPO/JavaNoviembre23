package com;

public class Pizza {

	String tamaño;
	String tipo;
	String ingredientes;
	int rebanadas;
	
	public Pizza(String tamaño, String tipo, String ingredientes, int rebanadas) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.ingredientes = ingredientes;
		this.rebanadas = rebanadas;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getRebanadas() {
		return rebanadas;
	}

	public void setRebanadas(int rebanadas) {
		this.rebanadas = rebanadas;
	}

	@Override
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", tipo=" + tipo + ", ingredientes=" + ingredientes + ", rebanadas="
				+ rebanadas + "]";
	}
	
	
}
