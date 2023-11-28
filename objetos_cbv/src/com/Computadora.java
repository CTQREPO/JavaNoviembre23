package com;

import java.util.Arrays;

public class Computadora {
	String marca;
	String modelo;
	String Procesador;
	float precio;
	String tipo;
	float[] Dimensiones;
	
	public Computadora() {
		
	}



	public Computadora(String marca, String modelo, String procesador, float precio, String tipo, float[] Dimensiones) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		Procesador = procesador;
		this.precio = precio;
		this.tipo = tipo;
		this.Dimensiones = Dimensiones;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getProcesador() {
		return Procesador;
	}



	public void setProcesador(String procesador) {
		Procesador = procesador;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public float[] getDimensiones() {
		return Dimensiones;
	}



	public void setDimensiones(float[] dimensiones) {
		Dimensiones = dimensiones;
	}



	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", Procesador=" + Procesador + ", precio= $"
				+ precio + ", tipo=" + tipo + ", Dimensiones=" + Arrays.toString(Dimensiones) + "]";
	}





	

}
