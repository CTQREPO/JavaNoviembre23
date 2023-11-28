package com;

public class Pizza {

	String tama�o;
	String tipo;
	String ingredientes;
	int rebanadas;
	
	public Pizza(String tama�o, String tipo, String ingredientes, int rebanadas) {
		super();
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.ingredientes = ingredientes;
		this.rebanadas = rebanadas;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Pizza [tama�o=" + tama�o + ", tipo=" + tipo + ", ingredientes=" + ingredientes + ", rebanadas="
				+ rebanadas + "]";
	}
	
	
}
