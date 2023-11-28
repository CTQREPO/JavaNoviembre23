package com;

public class Reloj {
	//atributos
	String color;
	String tipo;
	String material;
	int hora, minuto;
	
	//constructores
	public Reloj() {
		
	}
	
	public Reloj(String material, int hora, int minuto) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.material = material;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public Reloj(String color, String tipo, String material, int hora, int minuto) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.material = material;
		this.hora = hora;
		this.minuto = minuto;
	}

	//getters & setters
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
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public int getHora() {
			return hora;
		}
		public void setHora(int hora) {
			this.hora = hora;
		}
		public int getMinuto() {
			return minuto;
		}
		public void setMinuto(int minuto) {
			this.minuto = minuto;
		}
	
	//toString
		@Override
	public String toString() {
		return "Reloj [color=" + color + ", tipo=" + tipo + ", material=" + material + ", hora=" + hora + ", minuto="
				+ minuto + "]";
	}
		
	
}
