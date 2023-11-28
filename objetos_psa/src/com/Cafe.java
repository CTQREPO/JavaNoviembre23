package com;

public class Cafe {

	String tipo;
	String procedencia;
	String tostado;

	int cantidad;
	int bolsa;

	public Cafe() {

	}

	public Cafe(String tipo, String tostado, int cantidad) {
		super();
		this.tipo = tipo;
		this.tostado = tostado;
		this.cantidad = cantidad;
	}

	public Cafe(String tipo, String procedencia, String tostado, int cantidad, int bolsa) {
		super();
		this.tipo = tipo;
		this.procedencia = procedencia;
		this.tostado = tostado;
		this.cantidad = cantidad;
		this.bolsa = bolsa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getTostado() {
		return tostado;
	}

	public void setTostado(String tostado) {
		this.tostado = tostado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return "Cafe [tipo=" + tipo + ", procedencia=" + procedencia + ", tostado=" + tostado + ", cantidad=" + cantidad
				+ ", bolsa=" + bolsa + "]";
	}

}
